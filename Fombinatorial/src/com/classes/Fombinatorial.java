package com.classes;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Fombinatorial {
	 public static void main(String []args){
	try{
        //new FileInputStream("F:/algo_codechef/MagicalGirl/src/input.txt")
     //System.in
     BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       
       
        int t = Integer.parseInt(reader.readLine());
        
        for (int tt = 0; tt < t; tt++) {
        	String[] data = reader.readLine().split(" ");
        	int N=Integer.parseInt(data[0]);
        	int M=Integer.parseInt(data[1]);
        	int Q=Integer.parseInt(data[2]);
        }
        
} 
	catch (Exception e) {
		System.out.println(e.getStackTrace());
	}
	 }
}
