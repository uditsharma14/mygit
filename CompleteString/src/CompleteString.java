import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;


public class CompleteString {
	public static void main(String []args) throws IOException{
		 //new FileInputStream("F:/algo_codechef/CompleteString/src/input.txt")
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	     int numberOfTests=Integer.parseInt(br.readLine());
	     for(int counter=0;counter<numberOfTests;counter++){
	    	 String strn=br.readLine();
	    	 getDecision(strn);
	       }
	     }
	public static void getDecision(String strn  ) {
		 
		// to store Length and count
		HashMap<String,Integer> hashmap=new HashMap<String, Integer>();
		char arr[]=strn.toCharArray();
		for(int counter=0;counter<arr.length;counter++){
			hashmap.put(arr[counter]+"", 1);
		}
		if(hashmap.size()==26){
			System.out.println("YES");
		}
		else
			System.out.println("NO");
		}
	    	 
}
