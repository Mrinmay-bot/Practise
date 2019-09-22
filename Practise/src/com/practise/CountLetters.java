package com.practise;

import java.util.HashSet;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;

public class CountLetters {

	public static void main(String[] args) {
		String str="Hello World";
		int ln=str.length();
		Set<String> set=new HashSet<>();
		for(int i=0;i< str.length();i++) {
			if(!set.contains(Character.toString(str.charAt(i)))) {
				System.out.println("Letter :" + Character.toString(str.charAt(i)) 
				+ "     Occurence :" + StringUtils.countMatches(str, Character.toString(str.charAt(i))));
				set.add(Character.toString(str.charAt(i)));
			}

		}

	}	
}
