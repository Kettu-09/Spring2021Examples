package com.commonannotation;

import org.springframework.stereotype.Component;

@Component
public class MathTeacher implements Teacher {

	@Override
	public void teacher() {

		System.out.println("Math Teacher: I am your Math Teacher.");
	}

}
