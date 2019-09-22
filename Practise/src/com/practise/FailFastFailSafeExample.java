package com.practise;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastFailSafeExample {

	public static void main(String[] args) {
		FailFastFailSafeExample.chechForFailSafe();
		FailFastFailSafeExample.chechForFailFast();
	}

	public static void chechForFailFast() {
		System.out.println("Inside chechForFailFast scenario......");
		List<String> lst=new ArrayList<>();
		lst.add("Mrinmay");
		lst.add("Rajesh");
		lst.add("Mohan");
		lst.add("Rahul");

		for(String str:lst) {
			if(str.equals("Mohan")) {
				lst.remove(str);
				lst.stream().forEach(aa-> {
					System.out.println("aa :" + aa);
				});
			}			
		}
		System.out.println(" Ater  Modification.................");

		for(String str:lst) {
			if(str.equals("Rahul")) {
				lst.remove(str);
				lst.stream().forEach(aa-> {
					System.out.println("cc :" + aa);
				});
			}			
		}
		
		lst.stream().forEach(aa-> {
			System.out.println("dd :" + aa);
		});


	}

	public static void chechForFailSafe() {
		System.out.println("Inside chechForFailSafe scenario......");
		List<String> lst=new CopyOnWriteArrayList<>();
		lst.add("Mrinmay");
		lst.add("Rajesh");
		lst.add("Mohan");
		lst.add("Rahul");

		for(String str:lst) {
			if(str.equals("Mohan")) {
				lst.remove(str);
				lst.stream().forEach(aa-> {
					System.out.println("aa :" + aa);
				});
			}			
		}
		System.out.println(" Ater  Modification.................");

		for(String str:lst) {
			if(str.equals("Rahul")) {
				lst.remove(str);
				lst.stream().forEach(aa-> {
					System.out.println("cc :" + aa);
				});
			}			
		}

		lst.stream().forEach(aa-> {
			System.out.println("dd :" + aa);
		});

	}
}
