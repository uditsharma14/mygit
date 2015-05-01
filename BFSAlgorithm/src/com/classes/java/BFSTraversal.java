package com.classes.java;



import java.util.LinkedList;
import java.util.Queue;



public class BFSTraversal {
	static int visited[]=new int[Graph.vertices];
	public static void BFSTraversal(){
		
		for(int counter=0;counter<Graph.vertices;counter++){
			if(visited[counter]==0){
				BFS(Graph.adjencyMatrix,counter);
			}
			
		}
	}
	
	public static void BFS(int adjencyMatrix[][],int Vertex){
		
		
		Queue<Integer> queue=new LinkedList<Integer>();
		queue.add(Vertex);
		visited[Vertex]=1;
		while(queue.size()>0){
			int nodeVisited= queue.remove();
			System.out.println(nodeVisited+" "+"NODE VISITED");
			
			for(int counter=0;counter<Graph.vertices;counter++){
				if((visited[counter]==0)&&(adjencyMatrix[nodeVisited][counter]==1)){
					queue.add(counter);
					visited[counter]=1;
				}	
		   }
 	}
 }
	
	public static void main(String []args){
		BFSTraversal();
	}	
}
