package com.practise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeTwoSortedArrayList {

	public static void main(String[] args) {
		List<Integer> list1 =new ArrayList<Integer>();
		list1.add(2);
		list1.add(4);
		list1.add(6);
		list1.add(8);
		list1.add(10);
		list1.add(9999);
		
		List<Integer> list2=new ArrayList<>();
		list2.add(1);
		list2.add(5);
		list2.add(9);
		list2.add(1001);
		
		List<Integer> result=MergeTwoSortedArrayList.mergeArrayList(list1, list2);
		result.stream().forEach(aa->System.out.println(aa));
		
	}
	
	public static List<Integer> mergeArrayList(List<Integer> list1, List<Integer> list2){
		list1.addAll(list2);
		System.out.println("Beforfe sort...........");
		list1.stream().forEach(aa->System.out.println(aa));
		Collections.sort(list1);
		System.out.println("After sort...........");
		list1.stream().forEach(aa->System.out.println(aa));
		return list1;
	}

}
