import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;


public class Password {
	public static void main(String []args) throws IOException{
		//new FileInputStream("F:/algo_codechef/password/src/input.txt")
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     int numberOfTests=Integer.parseInt(br.readLine());
     HashMap<String, Integer> hashMap=new HashMap<String, Integer>();
     for(int counter=0;counter<numberOfTests;counter++){
    	 String data=br.readLine();
    	 String reverString=new StringBuffer(data).reverse().toString();
    	 if(hashMap.get(reverString)==null){
    	 hashMap.put(data, 1);
    	 }
    	 else
    	 {   
    		 System.out.println(data.length()+" "+data.charAt(data.length()/2));
    	 }
      }
	}
}
