package com.commonannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component() // {use for create bean for class without using xml file} // Default bean name
				// as same as Class name here{ "college" }
public class College {

	@Autowired  // to inject the class
	@Qualifier("scienceTeacher") // use for {to inject the particular class to the interface} there are two
									// implementation classes.
	private Teacher teacher;

	@Autowired
	private Principal principal;

	public void test() {
		System.out.println("College class to test......!!!!!");

		principal.principalMethod();

		teacher.teacher();

	}
}
