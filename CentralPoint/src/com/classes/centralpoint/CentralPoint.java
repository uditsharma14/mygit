package com.classes.centralpoint;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

public class CentralPoint {
	//F:/algo_codechef/Central Point/src/input.txt
public static void main(String []args){
	 try {
		 //new FileInputStream("F:/algo_codechef/CentralPoint/src/input.txt")
		    //System.in
			
		 BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("F:/algo_codechef/CentralPoint/src/input.txt")));
			while(true){
		    
			int pointCount=Integer.parseInt(reader.readLine());
		    if(pointCount==0){
		    	break;
		    }
		    long array[][]=new long[pointCount][2];
			for(int counter=0;counter<pointCount;counter++){
				String data[]=reader.readLine().split(" ");
				array[counter][0]=Long.parseLong(data[0]);
				array[counter][1]=Long.parseLong(data[1]);
			 }
			System.out.printf("%.6f",getMinimumDistanceSum(array));
			System.out.println("");
			}
		    
			
}
	 catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 }

private static double getMinimumDistanceSum(long array[][]) {
	double distanceSum[]=new double[array.length];
	for(int outerCounter=0;outerCounter<array.length;outerCounter++){
		double sum=0;
		for(int inerCounter=0;inerCounter<array.length;inerCounter++){
			double distance=Math.sqrt(Math.pow((array[inerCounter][1]-array[outerCounter][1]),2)+Math.pow((array[inerCounter][0]-array[outerCounter][0]),2));
			sum=sum+distance;
		}
		distanceSum[outerCounter]=sum;
	}
	
	Arrays.sort(distanceSum);
	
	// TODO Auto-generated method stub
	return  distanceSum[0];
}
}
