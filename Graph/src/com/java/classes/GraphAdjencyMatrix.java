package com.java.classes;

import java.util.Scanner;


class Graph {
	private int numberOfVertices;
	private int numberOfEdges;
	private int[][] adjencyMatrix;

	public int getNumberOfVertices() {
		return numberOfVertices;
	}

	public void setNumberOfVertices(int numberOfVertices) {
		this.numberOfVertices = numberOfVertices;
	}

	public int getNumberOfEdges() {
		return numberOfEdges;
	}

	public void setNumberOfEdges(int numberOfEdges) {
		this.numberOfEdges = numberOfEdges;
	}

	public int[][] getAdjencyMatrix() {
		return adjencyMatrix;
	}

	public void setAdjencyMatrix(int[][] adjencyMatrix) {
		this.adjencyMatrix = adjencyMatrix;
	}
 
 }

public class GraphAdjencyMatrix {
	private static int numberOfEgdes;
	private static int numberOfVertices;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		

		System.out.println("Enter the number of vertices:");
		numberOfVertices = sc.nextInt();
		System.out.println("Enter the number of edges:");
		numberOfEgdes = sc.nextInt();
		Graph graph = new Graph();
		graph.setNumberOfEdges(numberOfEgdes);
		graph.setNumberOfVertices(numberOfVertices);
		int [][]adjencyMatrix=new int[numberOfVertices][numberOfVertices];
		graph.setAdjencyMatrix(adjencyMatrix);
		
		for(int i=0;i<numberOfEgdes;i++){
			System.out.println("Enter the edge:");
			    int from=sc.nextInt();
				int to=sc.nextInt();
				adjencyMatrix[from][to]=1;
				adjencyMatrix[to][from]=1;
		}
	System.out.println(adjencyMatrix);
	}
}
