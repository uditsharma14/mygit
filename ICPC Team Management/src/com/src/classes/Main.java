package com.src.classes;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;


public class Main {
 public static void main(String []args) throws IOException{
	 //new FileInputStream("F:/algo_codechef/ICPC Team Management/src/input.txt")
	 BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("F:/algo_codechef/ICPC Team Management/src/input.txt")));
     int numberOfTests=Integer.parseInt(br.readLine());
     for(int counter=0;counter<numberOfTests;counter++){
    	 String data[]=br.readLine().split(" ");
    	 int numberOfStudent=Integer.parseInt(data[0]);
    	 int numberOfStudentPerGroup=Integer.parseInt(data[1]);
    	 String arr[]=new String[numberOfStudent];
    	 for(int counter2=0;counter2<numberOfStudent;counter2++){
    		 String name=br.readLine();
    		 arr[counter2]=name;
    	 }
    	 getDecision(arr,numberOfStudentPerGroup);
     }
   }
 
public static void getDecision(String arr[],int numberOfStudentPerGroup  ) {
	 
	// to store Length and count
	HashMap<Integer,Integer> hashmap=new HashMap<Integer, Integer>();
	for(int counter=0;counter<arr.length;counter++)
	{
		int StringLength=arr[counter].length();
		if(hashmap.get(StringLength)!=null){
			hashmap.put(StringLength, hashmap.get(StringLength)+1);
		}
		else
			hashmap.put(StringLength, 1);
	}
	boolean booleanflag=false;
	Iterator iterator=hashmap.entrySet().iterator();
	while(iterator.hasNext()){
		Map.Entry pair=(Entry) iterator.next();
		if((Integer)pair.getValue()==numberOfStudentPerGroup||((Integer)pair.getValue()%numberOfStudentPerGroup==0)){
			booleanflag =true;
		}
		else{
			booleanflag=false;
			break;
		}
	}
	if(booleanflag==true){
		System.out.println("Possible");
	}
	else
		System.out.println("Not possible");
   }
}
