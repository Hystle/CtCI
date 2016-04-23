package q4_7_BuildOrder.EdgeRemoval;

import java.util.ArrayList;
import java.util.HashMap;

public class Project {
	private String name;
	// save all nodes that depend on this node
	private ArrayList<Project> children = new ArrayList<>();
	// save the name-node pairs of children
	private HashMap<String, Project> map = new HashMap<>();
	// count number of children
	private int dependencies = 0;

	public Project(String name) {
		this.name = name;
	}
	// add one dependency to this project
	public void addNeighbour(Project node){
		if(!map.containsKey(node.getName())){
			children.add(node);
			node.incrementDependencies();
		}
	}
	
	public String getName(){
		return name;
	}

	public ArrayList<Project> getChildren(){
		return children;
	}

	public void incrementDependencies() {
		dependencies++;
	}

	public void decrementDependencies() {
		dependencies--;
	}

	public int getDependencies(){
		return dependencies;
	}
}
