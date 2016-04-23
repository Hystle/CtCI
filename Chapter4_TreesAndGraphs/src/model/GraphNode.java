package model;

public class GraphNode {
	private GraphNode adjacent[];
	public int adjacentCount;
	private String vertex;
	public State state;
	
	public GraphNode(String vertex, int adjacentLength){
		this.vertex = vertex;
		adjacentCount = 0;
		adjacent = new GraphNode[adjacentLength];
	}
	
	public void addAdjacent(GraphNode n){
		if(adjacentCount < adjacent.length){
			this.adjacent[adjacentCount] = n;
			adjacentCount++;
		}
		else{
			System.out.println("No more adjacent can be added");
		}
	}
	
	public GraphNode[] getAdjacent(){
		return adjacent;
	}
	
	public String getVertex(){
		return vertex;
	}
}
