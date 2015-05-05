package com.classes.src;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Main {
  public static void main(String []args) throws Exception{
	  //new FileInputStream("F:/algo_codechef/Alien language/src/input.txt")
	  BufferedReader bufferedReader=new BufferedReader(new InputStreamReader
			  (System.in));
	  int numberOfTests=Integer.parseInt(bufferedReader.readLine());
	  for(int counter=0;counter<numberOfTests;counter++){
		  String wordsByJhool=bufferedReader.readLine();
		  String wordsByJaddu=bufferedReader.readLine();
		  wordsmatches(wordsByJhool,wordsByJaddu);
	  }
	  
  }

private static void wordsmatches(String wordsByJhool, String wordsByJaddu) {
	boolean bool=false;
	for(int counter=0;counter<wordsByJaddu.length();counter++){
		bool=wordsByJhool.contains(wordsByJaddu.substring(counter, counter+1));
		if(bool==true){
			break;
		}
	}
	
	if(bool==true){
		System.out.println("YES");
	}
	else
		System.out.println("NO");
}
}
