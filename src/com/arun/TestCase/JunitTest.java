package com.arun.TestCase;

public class JunitTest {

	private static boolean isNotNullNotEmptyNotWhiteSpace(String s) {
		return (s != null && !s.isEmpty() && !s.trim().isEmpty());
	}
	public static void main(String[] args) {
		System.out.println(isNotNullNotEmptyNotWhiteSpace("aruns"));
	}

}
