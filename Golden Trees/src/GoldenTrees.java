
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

class XOR {
	
	
 public static void main(String arg[]){
	 try {
		 //new FileInputStream("F:/algo_codechef/Golden Trees/src/input.txt")
		    //System.in
			BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("F:/algo_codechef/Golden Trees/src/input.txt")));
			int t = Integer.parseInt(reader.readLine());
           
			for (int tt = 0; tt < t; tt++) {
				String numberOfFlights=reader.readLine();
				int numberOfFlightsInt=Integer.parseInt(numberOfFlights);
				int city[]=new int[numberOfFlightsInt];
				int time[]=new int[numberOfFlightsInt];
		        for(int counter=0;counter<numberOfFlightsInt;counter++){
		        	String flightInfoData[]=reader.readLine().split(" ");
		        	city[counter]=Integer.parseInt(flightInfoData[0]);
		        	city[counter]=Integer.parseInt(flightInfoData[1]);
		        	
		            
		        }
		       
			}
	 }	
	 catch (Exception e) {
		System.out.println("exception generated :"+e);
	}
	 
 }
}