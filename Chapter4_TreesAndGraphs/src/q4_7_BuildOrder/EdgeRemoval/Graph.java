package q4_7_BuildOrder.EdgeRemoval;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph {
	// save all nodes in the graph
	private ArrayList<Project> nodes = new ArrayList<>();
	// save name-node pairs in the graph
	private HashMap<String, Project> map = new HashMap<>();
	// create new node if not existed
	public Project getOrCreateNode(String name){
		if(!map.containsKey(name)){
			Project node = new Project(name);
			nodes.add(node);
			map.put(name, node);
		}
		return map.get(name);
	}
	// add edge to node
	public void addEdge(String startName, String endName) {
		Project start = getOrCreateNode(startName);
		Project end = getOrCreateNode(endName);
		start.addNeighbour(end);
	}
	// return all nodes
	public ArrayList<Project> getNodes() {
		return nodes;
	}
}
