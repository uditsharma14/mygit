import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;



public class Main {
	
    public static void main(String []args) throws IOException{
    	//new FileInputStream("F:/algo_codechef/promNight/src/input.txt")
    	BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("F:/algo_codechef/promNight/src/input.txt")));
        String numberOfTest= br.readLine();
        int N = Integer.parseInt(numberOfTest);
        for(int counter=0;counter<N;counter++){
        String countOfCandidate[]=br.readLine().split(" ");
        int boyCount=Integer.parseInt(countOfCandidate[0]);
        int girlCount=Integer.parseInt(countOfCandidate[1]);
        String heightOfBoy[]=br.readLine().split(" ");
        String heightOfgirl[]=br.readLine().split(" ");
        int heightOfBoyInt[]=new int[heightOfBoy.length];
        int heightOfgirlInt[]=new int[heightOfgirl.length];
	    for(int counter2=0;counter2<boyCount;counter2++){
	    		heightOfBoyInt[counter2]=Integer.parseInt(heightOfBoy[counter2]);
	    	}
	    for(int counter3=0;counter3<girlCount;counter3++){
	    	heightOfgirlInt[counter3]=Integer.parseInt(heightOfgirl[counter3]);
    	}
	    getAnswer(heightOfBoyInt,heightOfgirlInt);
        }
	 }
private static void getAnswer(int[] heightOfBoyInt, int[] heightOfgirlInt) {
		Arrays.sort(heightOfBoyInt);
		Arrays.sort(heightOfgirlInt);
		int counterGirl=0;
		boolean booleanBoy[]=new boolean[heightOfBoyInt.length];
		for(int counter=0;counter<heightOfBoyInt.length;counter++){
			if((heightOfBoyInt[counter]-heightOfgirlInt[counterGirl])>0){
				booleanBoy[counter]=true;
				counterGirl++;
			}
			
		  else 
				booleanBoy[counter]=false;
			
		  if(counterGirl==heightOfgirlInt.length-1)
				break;
			
		}
		int counter4=0;
		for(;counter4<booleanBoy.length;counter4++){
			if(booleanBoy[counter4]==false){
				System.out.println("NO");
				break;
			}
			if(counter4==heightOfBoyInt.length-1){
				System.out.println("YES");
			}
		}
	}
   

}
