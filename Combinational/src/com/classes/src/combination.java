package com.classes.src;

public class combination {
	static char ch[]={'a','b','c'};
public static void main(String args[]){
	
	
	combination("",-1,2);
}
  public static int combination(String temp,int start,int end){
	  
	  
	  if(start>=0&&start<=end){
	  temp=temp+ch[start];
	  System.out.println(temp);
	  }
	  if(start==end||start>end){
		  return 0;
	  }
	  
	 
	  
	  combination(temp,start+1,end);
	  combination(temp,start+2,end);
	  return 0;
  }
}
