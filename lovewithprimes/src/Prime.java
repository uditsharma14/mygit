import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;


public class Prime {
	
	public static void main(String []args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("F:/algo_codechef/lovewithprimes/src/input.txt")));
	    int numberOfTests=Integer.parseInt(br.readLine());{
	    	for(int counter=0;counter<numberOfTests;counter++){
	    		int weightOfCake=Integer.parseInt(br.readLine());
	    		int counter2=2;
	    		for(;counter2<weightOfCake;counter2++){
	    			if(isPrime(counter2)){
	    				if(isPrime(weightOfCake-counter2)){
	    					System.out.println("Deepa");
	    					break;
	    				}
	    				
	    			}
	    		}
	    		if(counter2==weightOfCake){
	    			System.out.println("Arjit");
	    		}
	    	}
	    }
	}
 
	public static boolean isPrime(int number){
		boolean flag=true;
		int counter=2;
		for(;counter<=number/2;counter++){
			if(number%counter==0){
				flag=false;
				break;
			}	
		}
		if(counter==(number/2)+1){
			flag=true;
		}
		return flag;
	}
}
