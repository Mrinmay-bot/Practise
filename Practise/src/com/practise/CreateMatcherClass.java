package com.practise;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CreateMatcherClass {

	public static void main(String[] args) {
		List<String> lst1= new ArrayList<String>();
		lst1.add("Hi ");
		lst1.add("i");
		lst1.add("am ");
		lst1.add("mrinmay ");
		lst1.add("and ");
		lst1.add("learning ");
		lst1.add("Java ");
		lst1.add("concepts now ");
		lst1.add("a days.");

		List<String> lst2= new ArrayList<String>();   
		lst2.add("Hi ");
		lst2.add("i");
		lst2.add("am ");
		lst2.add("mrinmay ");
		lst2.add("and ");
		lst2.add("learning ");
		lst2.add("Spring Boot ");
		lst2.add("concepts now ");
		lst2.add("a days.");
		List<String> jv=CreateMatcherClass.getMatched(String.join("", lst1), "Java concepts");
		List<String> sprngBt=CreateMatcherClass.getMatched(String.join("", lst2), "Spring Boot concepts");
		System.out.println("jv size:" + jv.size());
		System.out.println("sprngBt size:" + sprngBt.size());
		jv.stream().forEach(aa-> {
			System.out.println("list String in Jv  is: " + aa);
		});
		
		sprngBt.stream().forEach(aa-> {
			System.out.println("list String in sprngBt is:" + aa);
		});
	}

	public static List<String> getMatched(String fullString, String textToMatch){
		List<String> matchedList=new ArrayList<String>();
		Pattern p=Pattern.compile(textToMatch);
		Matcher m=p.matcher(fullString);
		while(m.find()) {
			matchedList.add(m.group());
		}
		return matchedList;
	}

}
