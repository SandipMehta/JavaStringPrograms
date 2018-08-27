package com.strings.example;

public class ReverseString {
	
	public void reversestring_usingStringBuffer() {
		StringBuffer sb = new StringBuffer("Hello World , I AM HERE");
		System.out.println("Reversing String using String buffer : -");
		System.out.println("Original String :" + sb.toString());
		System.out.println("Reverse String :" + sb.reverse());		
	}
	public void reversestring_chararray() {
		String str = "Hello World , I AM HERE";
		String reverseString ="";
		char[] chrarray = str.toCharArray();
		for(int i=chrarray.length-1;i>=0;i--) {
			reverseString = reverseString + chrarray[i];
		}
		System.out.println("Original String : "+str);
		System.out.println("Reverse String : "+reverseString);
	}
	public String reversestring_recursivemethod(String str) {
		System.out.println(str);
		if ( (str == null) || (str.length()<=1) ) {
			return str;
		}
		return reversestring_recursivemethod(str.substring(1))+str.charAt(0);
	}	
}
