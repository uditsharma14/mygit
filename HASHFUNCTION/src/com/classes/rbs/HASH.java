package com.classes.rbs;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class HASH {
	
public static void main(String []args){
	System.out.println(hashFuction("EAAEA"));
}
	
public static String[] split(String s){
  int length=s.length();
  int lengthS1=length/2;
  String s1=s.substring(0, lengthS1);
  String s2=s.substring(lengthS1, length);
  return new String[]{s1,s2};
}

public static int hashFuction(String s){
	int result = aCount(s);
	if(1<s.length()){
		String str[]=split(s);
		result=result+Math.max(hashFuction(str[0]), hashFuction(str[1]));
	}
	                                                                                                                                                                                            
	return result;
}
public static int aCount(String s){
	int length=s.length();
	int count=0;
	char ch[]=s.toCharArray();
	for(int counter=0;counter<length;counter++){
		if(ch[counter]=='A'){
			count++;
		}
	}
	return count;
}
}
