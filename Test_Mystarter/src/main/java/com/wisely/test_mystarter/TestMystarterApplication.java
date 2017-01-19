package com.wisely.test_mystarter;

import com.wisely.spring_boot_start.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class TestMystarterApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestMystarterApplication.class, args);
	}
	@Autowired
	HelloService helloService;

	@RequestMapping("/")
	public String index() {
		return helloService.sayHi();
	}

}
