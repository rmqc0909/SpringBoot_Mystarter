# SpringBoot_Mystarter
springboot 实现一个自动配置
该项目需要注意以下：
1.SpringBoot_Mystarter工程下的pom.xml需要增加依赖如下
<dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-configuration-processor</artifactId>
      <optional>true</optional>
      <version>1.4.3.RELEASE</version>
</dependency>
2.若没有该依赖，则SpringBoot_Mystarter工程里面的spring.factories文件不会生效，即自己实现的自动配置不会生效，
会导致Test_Mystarter这个module的测试类TestMystarterApplication无法注入HelloService该Bean.
