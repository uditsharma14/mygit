import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileInputStream;

public class Main {
	public static void main(String []args) throws IOException{
		//new FileInputStream("F:/algo_codechef/AppleTrees/src/input.txt")
		//new FileInputStream("F:/algo_codechef/NumberOfR/src/input.txt")
		 BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("F:/algo_codechef/NumberOfR/src/input.txt")));
	     String numberOfTest= br.readLine();
	     int N = Integer.parseInt(numberOfTest);
	    for (int i = 0; i < N; i++) {
	       String splitString=br.readLine();
	      System.out.println(maxR(splitString));

	     }
	 }
	
	public static int  maxR(String arr){
		int counterK=0;
		int counterR=0;
		int startIndex=0;
		int previousCounterK=0;
		int endIndex=0;
		int rCounter=0;
	  for(int counter=0;counter<arr.length();counter++){
		 if(arr.charAt(counter)=='K') {
			 counterK++;
		 }
		  if(arr.charAt(counter)=='R')
			 counterR++;
		 
		 if(counterR>=counterK){
			 if(counterK>0 && (arr.charAt(counter)=='K')){
				 startIndex=counter;
				 endIndex=counter;
				 counterR=0;
				 counterK=0;
				 }
			 else if(counterK>0 && (arr.charAt(counter)=='R')&&(counter<arr.length()-2))
			 {
				 startIndex=counter+1;
				 endIndex=counter+1;
				 counterR=0;
				 counterK=0;
			 }
		}
		 else if(counterK>counterR){
		   
		    	endIndex=counter;
		    	
			}
		    
		   
		    
		 
		}

		 if((arr.charAt(arr.length()-1)=='R')&&(startIndex<endIndex))
		 {
			endIndex=endIndex-1; 
		 }
	     char arrChar[]=arr.toCharArray();
	     for(int counter2=startIndex;counter2<=endIndex;counter2++){
				if(arrChar[counter2]=='K'){
					arrChar[counter2]='R';
				}
				else
					arrChar[counter2]='K';
			}
		
		for(int counter4=0;counter4<arrChar.length;counter4++){
			if(arrChar[counter4]=='R'){
				rCounter++;
			}
		}
	return rCounter;
	}
}
