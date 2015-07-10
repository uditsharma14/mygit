import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {
	public static void main(String []args) throws IOException{
		//new FileInputStream("F:/algo_codechef/Dhoom 4/src/input.txt")
    	BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("F:/algo_codechef/Dhoom 4/src/input.txt")));
        String keys[]= br.readLine().split(" ");
        int Skey=Integer.parseInt(keys[0]);
        int Lkey=Integer.parseInt(keys[1]);
        int nOtherKeys=Integer.parseInt(br.readLine());
        int otheyKeys[]=new int[nOtherKeys];
        String otherKeysStr[]=br.readLine().split(" ");
        for(int counter=0;counter<nOtherKeys;counter++){
        	otheyKeys[counter]=Integer.parseInt(otherKeysStr[counter]);
         }
        System.out.println(keyCount(otheyKeys,Lkey,Skey));
        
	 }
	
	public static int keyCount(int otherkeys[],int LockKeyValue,int Skey){
		int keyCounter=0;
		int counter=otherkeys.length-1;
		Arrays.sort(otherkeys);
		int tempKey=Skey;
		while(true){
			if(counter==otherkeys.length-1){
				counter=0;
			}
			tempKey=(tempKey*otherkeys[counter])%100000;
			keyCounter++;
			if(tempKey==LockKeyValue){
				break;
			 }
			counter++;
		 }
		if(LockKeyValue!=tempKey &&counter==4){
			return -1;
		}
		return keyCounter;
	}
	
}
