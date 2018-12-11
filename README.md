

a spring boot with doc-https://docs.spring.io/spring-boot/docs/2.1.2.BUILD-SNAPSHOT/reference/htmlsingle
Developing Your First Spring Boot Application

Running the Example
mvn spring-boot:run



Creating an Executable Jar
java -jar target/myproject-0.0.1-SNAPSHOT.jar



question:
Consider the following: If you want an embedded database (H2, HSQL or Derby), please put it on the classpath. If you have database settings to be loaded from a particular profile you may need to activate it (no profiles are currently active).

经查，因引入了myBatis的jar包：

    <dependency>
                <groupId>org.mybatis.spring.boot</groupId>
                <artifactId>mybatis-spring-boot-starter</artifactId>
                <version>1.3.1</version>
    </dependency>

spring boot 会默认加载org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration这个类，而DataSourceAutoConfiguration类使用了@Configuration注解向spring注入了dataSource bean，又因为项目（eureka-server模块和短信模块）中并没有关于dataSource相关的配置信息，所以当spring创建dataSource bean时因缺少相关的信息就会报错。

解决办法：

1、在@SpringBootApplication注解上加上exclude，解除自动加载DataSourceAutoConfiguration
