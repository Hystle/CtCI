package model;

public class Graph {
	public static int MAX_VERTICES = 6;
	private GraphNode[] vertices;
	public int count;
	public Graph(){
		vertices = new GraphNode[MAX_VERTICES];
		count = 0;
	}
	public void addNode(GraphNode n){
		if(count < vertices.length){
			vertices[count] = n;
			count++;
		}
		else{
			System.out.println("Full");
		}
	}
	public GraphNode[] getNodes(){
		return vertices;
	}
}
