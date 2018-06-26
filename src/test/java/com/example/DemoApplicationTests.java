package com.example;

import com.example.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class DemoApplicationTests {

	@Autowired
	private UserService userService;
	@Test
	public void contextLoads() {
       System.out.print("123");
	}
	@Test
	public void ServiceTest() {
		userService.insert();
	}

}
