package com.strings.example;

import java.util.Arrays;

public class AnagramProgram {
	public void isAnagram(String s1, String s2) {
		String copyofs1 = s1.replace(" ", "");
		String copyofs2 = s2.replace(" ", "");
		
		boolean status = true;
		
		if (copyofs1.length() != copyofs2.length()) {
			status = false;
			System.out.println("String1 : "+s1 +" String2 : "+s2+" are not Anagram");
		}
		else {
			char[] chrs1 = copyofs1.toLowerCase().toCharArray();
			char[] chrs2 = copyofs2.toLowerCase().toCharArray();
			
			Arrays.sort(chrs1);
			Arrays.sort(chrs2);
			
			System.out.println("s1 : " + chrs1.toString());
			System.out.println("s2 : " + chrs2.toString());
			
			status = Arrays.equals(chrs1, chrs2);
			
			if (status == true) 
				System.out.println("String1 : "+s1 +" String2 : "+s2+" are Anagram");		
			else
				System.out.println("String1 : "+s1 +" String2 : "+s2+" are not Anagram");
		}
	}

}
