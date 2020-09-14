package com.lti;

import java.time.LocalDateTime;
import java.util.Date;

public class Hello {

	public static void main(String[] args) {
		System.out.println("hello world");
		Date d = new Date();
		System.out.println(d);
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);

	}

}
