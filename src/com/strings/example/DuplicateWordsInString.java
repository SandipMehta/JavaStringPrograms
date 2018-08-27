package com.strings.example;

import java.util.HashMap;

import java.util.Set;

public class DuplicateWordsInString {
	
	public void FindDuplicateWordsInString (String str) {
		String[] words = str.split(" ");
		HashMap<String,Integer> wordCount = new HashMap<String,Integer>();
		
		for (String word : words) {
			//System.out.println(word);
			if(wordCount.containsKey(word.toLowerCase())) {
				wordCount.put(word.toLowerCase(), wordCount.get(word.toLowerCase())+1);
			}
			else {
				wordCount.put(word.toLowerCase(), 1);
			}
		}
		System.out.println(wordCount.values());
		System.out.println("Words : "+str);
		Set<String> wordsInString = wordCount.keySet();
		System.out.println("Duplicate words with occurance : ");
		for (String word : wordsInString) {
			if (wordCount.get(word)>1) {
				System.out.println(word +" : "+wordCount.get(word));
			}
		}
			
	}
}
