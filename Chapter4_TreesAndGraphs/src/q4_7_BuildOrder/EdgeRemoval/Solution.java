package q4_7_BuildOrder.EdgeRemoval;

import java.util.ArrayList;

public class Solution {
	/* Build the graph, adding the edge (a, b) if b is dependent on a. 
	 * Assumes a pair is listed in ¡°build order¡±. The pair (a, b) in 
	 * dependencies indicates that b depends on a and a must be built
	 * before b. */
	public static Graph buildGraph(String[] projects, String[][] dependencies) {
		Graph graph = new Graph();
		// add projects
		for (String project : projects) {
			graph.getOrCreateNode(project);
		}
		// add dependencies
		for (String[] dependency : dependencies) {
			String first = dependency[0];
			String second = dependency[1];
			graph.addEdge(first, second);
		}
		return graph;
	}

	/* 
	 * Insert projects with zero dependencies into the order array, starting at index offset
	 */
	public static int addNonDependent(Project[] order, ArrayList<Project> projects, int offset) {
		for (Project project : projects) {
			if (project.getDependencies() == 0) {
				order[offset] = project;
				offset++;
			}
		}
		return offset;
	}
	// organize projects in order
	public static Project[] orderProjects(ArrayList<Project> projects) {
		// create array for all projects in the graph needed to be processed
		Project[] order = new Project[projects.size()];

		/* Add ¡°roots¡± to the build order first.*/
		int endOfList = addNonDependent(order, projects, 0);
		// point to next node to be processed
		int toBeProcessed = 0;
		while (toBeProcessed < order.length) {
			Project current = order[toBeProcessed];

			/* We have a circular dependency since there are no remaining
			 * projects with zero dependencies. */ 
			if (current == null) {
				return null;
			}

			/* Remove myself as a dependency. */
			ArrayList<Project> children = current.getChildren();
			for (Project child : children) {
				child.decrementDependencies();
			}			

			/* Add children that have no one depending on them. */
			endOfList = addNonDependent(order, children, endOfList);

			toBeProcessed++;
		}
		return order;
	}
}
