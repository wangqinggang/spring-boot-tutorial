package com.ideaworks;

import com.ideaworks.entity.Person;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.swing.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class GetConfigDataApplicationTests {
	@Autowired
	Person person;

	@Test
	public void test() {
		System.out.println(person);
	}

}
