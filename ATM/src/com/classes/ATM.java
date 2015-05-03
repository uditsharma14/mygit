package com.classes;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class ATM {
	public static void main(String []args){
		   //new FileInputStream("F:/algo_codechef/ATM/src/com/classes/ATM.txt")
	    //System.in
	    try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	        String data[]=reader.readLine().split(" ");
	        int amount=Integer.parseInt(data[0]);
	        float balance=Float.parseFloat(data[1]);
	        if(balance>0&&amount>0){
	        	System.out.printf("%.2f",getBalance(balance,amount));
	        	
	        }
	    }
	    catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	}
	public static double getBalance(float balance,int amount){
    	if(amount%5==0&&(amount+0.5)<balance){
    		
    		return (float) (balance-(amount+0.5));
    	}
    	
    	return balance;
    }
}
