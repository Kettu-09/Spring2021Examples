package com.commonannotation;

import org.springframework.stereotype.Component;

@Component
public class ScienceTeacher implements Teacher {

	@Override
	public void teacher() {

		System.out.println("Science Teacher: I am your Science Teacher.");

	}

}
