package com.autowiredconcept;

import org.springframework.beans.factory.annotation.Autowired;

public class Human {

	@Autowired
	private Heart heart;

	/*
	 * public Human() {
	 * 
	 * }
	 * 
	 * @Autowired public Human(Heart heart) { super(); this.heart = heart; }
	 * 
	 * public void setHeart(Heart heart) { this.heart = heart; }
	 */

	public void startPumping() {

		if (heart != null)
			heart.pump();
		else
			System.out.println("So Sorry, You are Dead...!!!!");
	}

}
