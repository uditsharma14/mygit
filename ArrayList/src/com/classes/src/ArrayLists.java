package com.classes.src;

import java.util.ArrayList;

public class ArrayLists {
 public static void main(String []args){
	 ArrayList<Integer> arrayList=new ArrayList<Integer>();
	 arrayList.add(1);
	 arrayList.add(2);
	 arrayList.add(3);
	 arrayList.add(4);
	 arrayList.add(5);
	System.out.println(arrayList.size());
	 arrayList.add(null);
	
	// System.out.println(arrayList.size());
	System.out.println( arrayList.get(3));
	System.out.println(arrayList.remove(3));
	System.out.println( arrayList.get(3));
	 Employee employee=new Employee("runga", 13);
	 
 }
}
