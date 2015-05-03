package com.java.classes;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Karan {
	public static void main(String []args) throws IOException{
		 //new FileInputStream("F:/algo_codechef/Karanproblem/src/input.txt")
		 BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("F:/algo_codechef/Karanproblem/src/input.txt")));
		 String data;
		 
		 do{
			 data =br.readLine();
			 long number=Long.parseLong(data);
			 if(number==-1){
				 break;
			 }
			 else if(number%2==0){
				 System.out.println(number);
			 }
		 }while(true);
		 
	}
}
