package com.arun.test;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StudentMain {
	
	public static int regxTest(String s){
		String regexe = "[0]+";
		Pattern pattern = Pattern.compile(regexe);
		Matcher matcher = pattern.matcher(s);
		if (matcher.matches()) {
			return 1;
		}
		String regex = "\\A\\W?(?>\\w+\\W)*\\w*\\z";
		pattern = Pattern.compile(regex);
		matcher = pattern.matcher(s);
		if (!matcher.matches()) {
			return 2;
		}
		char firstChar = s.charAt(0);
		char lastChar = s.charAt(s.length() - 1);
		if ((!Character.isDigit(firstChar) && !Character.isAlphabetic(firstChar))
				|| (!Character.isDigit(lastChar) && !Character.isAlphabetic(lastChar))) {
			return 1;
		}
		return 0;
	}

	public static void main(String[] args) {
		Student std=new Student();
		std.setAge(24);
		std.setName("Arun Sathua");
		List<Student> student=new ArrayList<>();
		student.add(std);
		System.out.println(student);
		System.out.println(regxTest("AU@@11000"));
		//System.out.println("This is Arun");
		System.out.println("This is Jrmm");
	}

}
