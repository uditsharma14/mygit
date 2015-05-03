package com.classes;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Main {
	public static void main(String []str){
		 try {
			 //new FileInputStream("F:/algo_codechef/Golden Trees/src/input.txt")
			 //new InputStreamReader(new FileInputStream("F:/algo_codechef/Chain/input.txt"))
			    //System.in
				BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				int t = Integer.parseInt(reader.readLine());
				for (int tt = 0; tt < t; tt++) {
					String chain=reader.readLine();
					System.out.println(""+countReplacment(chain));
					
				}
				
		 }
		 catch (Exception e) {
				System.out.println("exception generated :"+e);
			}
	}
	public static int countReplacment(String chain){
		int replacementCounter1=0;
		int replacementCounter2=0;
		for(int counter1=0;counter1<chain.length();counter1++){
			if(counter1%2==0&&chain.charAt(counter1)=='+'){
				replacementCounter1++;
			}
			else if(counter1%2==1&&chain.charAt(counter1)=='-'){
				replacementCounter1++;
			}
		}
		
		for(int counter2=0;counter2<chain.length();counter2++){
			if(counter2%2==0&&chain.charAt(counter2)=='-'){
				replacementCounter2++;
			}
			else if(counter2%2==1&&chain.charAt(counter2)=='+'){
				replacementCounter2++;
			}
		}
	if(replacementCounter1>replacementCounter2)
		return replacementCounter2;
	else 
		return replacementCounter1;
	}
	
}
