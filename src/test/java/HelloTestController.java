import com.xhn.hello.Hello;
import com.xhn.hello.service.UserService;
import org.json.JSONObject;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Hello.class)
public class HelloTestController {

    @Autowired
    private UserService userService;

    @Before
    public void setUp() throws Exception {
        System.out.println("setup");
    }

    @Test
    public void test1() throws Exception{
        System.out.println("test");
        JSONObject obj = new JSONObject();
        obj.put("user", userService.getUser(new Integer(2)));

        System.out.println(obj.toString());
    }

}
