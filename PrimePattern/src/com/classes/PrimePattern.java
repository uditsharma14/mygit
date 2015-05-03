package com.classes;

public class PrimePattern {
	int arrayXY[][]=new int[4000001][3];
	
	public void getPrimeCoordinates(int arrayXY[][]){
		int x=0;
		int y=0;
		int counter=0;
		arrayXY[counter][0]=x;
		arrayXY[counter][1]=y;
		arrayXY[counter][2]=counter;
		for(;counter<400&&(x<=200||y<=200||x>=-200||y>=-200);counter++){
			counter=counter+1;
			arrayXY[counter][0]=x+counter;
			arrayXY[counter][1]=y;
			arrayXY[counter][2]=counter;
			
			arrayXY[counter][0]=x;
			arrayXY[counter][1]=y+counter;
			arrayXY[counter][2]=counter+1;
			
			
			
			
			
			
			
		}
	}

}
