import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;


public class Main {
	public static void main(String []args) throws IOException{
		   //new FileInputStream("F:/algo_codechef/Most Frequent/src/input.txt")
		//new FileInputStream("F:/algo_codechef/AretheySame/src/input.txt")
		   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		   
		   String str1= br.readLine();
		   String str2=br.readLine();
		   areTheySame(str1,str2);
	}

	private static void areTheySame(String str1, String str2) {
		HashMap<Character, Integer> hashmap1=new HashMap<Character, Integer>();
		HashMap<Character, Integer> hashmap2=new HashMap<Character, Integer>();
		boolean flag=false;
		for(int counter=0;counter<str1.length();counter++){
			 if(hashmap1.get(str1.charAt(counter))==null){
				 hashmap1.put(str1.charAt(counter), 1);
			   }
			   else
			   {
				   hashmap1.put(str1.charAt(counter), hashmap1.get(str1.charAt(counter))+1);
			   }
			
		}
		for(int counter2=0;counter2<str2.length();counter2++){
			 if(hashmap2.get(str2.charAt(counter2))==null){
				 hashmap2.put(str2.charAt(counter2), 1);
			   }
			   else
			   {
				   hashmap2.put(str2.charAt(counter2), hashmap2.get(str2.charAt(counter2))+1);
			   }
			
		}
		
		 Iterator iterator=hashmap1.entrySet().iterator();
		 while(iterator.hasNext()){
			 Map.Entry entry=(Entry) iterator.next();
			
				 if(hashmap2.get(entry.getKey())!=null 
						 &&(Integer)entry.getValue()==(Integer)hashmap2.get(entry.getKey()))
					 flag=true;
			 
			     else {
			    	 flag=false;
			    	 break;
			     }
		
	  }
		 if(flag==true){
			 System.out.println("YES");
		 }
		 else
			 System.out.println("NO");
	}
}
