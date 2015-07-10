import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
 public static void main(String []args) throws IOException{
      //new FileInputStream("F:/algo_codechef/binarySearch/src/input.txt")
     BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("F:/algo_codechef/binarySearch/src/input.txt")));
     String line = br.readLine();
     int N = Integer.parseInt(line);
     int array[]=new int[N];
     for (int i = 0; i < N; i++) {
        array[i]=Integer.parseInt(br.readLine());
     }
    
    int numberOfquries=Integer.parseInt(br.readLine());
    int arrElementTosearch[]=new int[numberOfquries];
   
   for(int counter=0;counter<numberOfquries;counter++){
   	arrElementTosearch[counter]=Integer.parseInt(br.readLine());
   	System.out.println(binarySearch(array,0,array.length,arrElementTosearch[counter]));
   }
 }
 
 public static int binarySearch(int arr[],int lower,int higher,int elementToFind){
	 while (lower < higher)
	    {
	      int mid = (lower+higher)/2;
	      if(mid > higher){
	    	  break;
	      }
	     if (arr[mid] < elementToFind)
	    	  lower = mid + 1;
	      else
	    	  higher = mid;
	      }
	  if ((lower == higher) && (arr[lower] == elementToFind))
	    return lower;
	  else
	    return -1;
  }
}
