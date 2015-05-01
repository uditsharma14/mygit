
public class DepthFirstSearch {
	static int visited[]=new int[Graph.vertices];
	public static void DFSTraversal(){
		
		for(int counter=0;counter<Graph.vertices;counter++){
			if(visited[counter]==0){
				DFS(Graph.adjencyMatrix,counter);
			}
			
		}
	}
	
	public static void DFS(int adjencyMatrix[][],int Vertex){
		visited[Vertex]=1;
		System.out.println(Vertex+ ": Node Visited");
		for(int counter2=0;counter2<Graph.vertices;counter2++){
			if((visited[counter2]==0)&&(adjencyMatrix[Vertex][counter2]==1)){
				DFS(adjencyMatrix,counter2);
			}
		}
	}
	
	public static void main(String []args){
		DFSTraversal();
	}
}
