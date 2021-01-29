package com.autowiredconcept;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BodyFunction {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

		Human human = context.getBean("human", Human.class);

		human.startPumping();

	}

}
