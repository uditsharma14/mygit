package com.classes.rbs;

public class GetCombination {
	static int aMaxCount=0;
	static int eMaxCount=0;
	public static void main(String []artgs){
		String arr[]=new  String[32];
		aMaxCount=3;
		eMaxCount=2;
		int aCount=0;
		int eCount=0;
		getPossibleCombination(arr,0,4,"",aCount,eCount);
	}
	
	public static String [] getPossibleCombination(String strArray[],int counter,int size,String string,int aCount,int eCount ){
		 
		 
		 if(counter<=size){
			 if(eMaxCount==eCount){
				 int length=string.length();
				 ++counter;
				for(int counter1=0;counter1<(size-length);counter1++){
					
					string=string+"E";
					
					}
				strArray[counter]=string;
			
				 }
				else if(eMaxCount==eCount){
					++counter;
					 int length=string.length();
				for(int counter1=0;counter1<(size-length);counter1++){
					
					string=string+"A";
					}
				 strArray[counter]=string;
				 
				 }
			 
			 ++counter;
			 
			 getPossibleCombination(strArray,counter,size,string+"E",++eCount,aCount);
			 getPossibleCombination(strArray,counter,size,string+"A",eCount,++aCount);
	     	 return strArray;
		 }
		 
		 
		 else{
			System.out.println(string);
			strArray[counter]=string;
			return strArray; 
		 }
		 
	 }
}
