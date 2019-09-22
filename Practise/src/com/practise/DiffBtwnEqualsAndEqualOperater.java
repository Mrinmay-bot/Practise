package com.practise;

import org.junit.Test;

public class DiffBtwnEqualsAndEqualOperater {
	String s1="Hello";
	String s2="Hello";
	
	@Test
	public void show() {
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
	}

}
