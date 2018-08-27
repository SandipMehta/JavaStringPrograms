package com.strings.example;

public class RotationOfString {
	public void findRotationOfString() {
		//Check Whether One String Is Rotation Of Another?
		String s1 = "JavaJ2eeStrutsHibernate";
		String s2="StrutsHibernateJavaJ2ee";
		
		if (s1.length() != s2.length()) {
			System.out.println("s1 String is not rotation of s2 string");
		}
		String s3 = s1+s1;
		if (s3.contains(s2)) {
			System.out.println("s1 String is rotation of s2 string");
		}
		else
		{
			System.out.println("s1 String is not rotation of s2 string");
		}
		
	}

}
