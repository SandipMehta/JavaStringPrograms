package com.strings.example;

public class CharacterOccurence {
	/*Write a java program to count the total number of 
	 * occurrences of a given character in a string 
	 * without using any loop
	 * */
	 
	public void CountCharacterOccurence() {
		String str = "Java is java again java again";
		System.out.println("String : "+str);
		String chr = "a";
		int count =str.length();
		int countWithoutChar = (str.replace(chr, "")).length();
		System.out.println("# of 'a' occurance in above string :" + (count-countWithoutChar));
	}

}
