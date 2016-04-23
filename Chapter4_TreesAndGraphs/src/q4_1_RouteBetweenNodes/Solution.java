package q4_1_RouteBetweenNodes;

import java.util.LinkedList;

import model.Graph;
import model.GraphNode;
import model.State;

public class Solution {
	public static boolean search(Graph g, GraphNode start, GraphNode end){
		if(start == end){
			return true;
		}
		
		for(GraphNode n : g.getNodes()){
			n.state = State.Unvisited;
		}
		
		LinkedList<GraphNode> list = new LinkedList<>();
		// initialization
		start.state = State.Visiting;
		list.add(start);
		// check all elements in list
		while(!list.isEmpty()){
			GraphNode m = list.removeFirst();
			if(m != null){
				for(GraphNode n : m.getAdjacent()){
					if(n.state == State.Unvisited){
						if(n == end){
							return true;
						}
						else{
							n.state = State.Visiting;
							list.add(n);
						}
					}
				}
				m.state = State.Visited;
			}
		}
		return false;
	}
	
	public static void main(String a[])
	{
		Graph g = createNewGraph();
		GraphNode[] n = g.getNodes();
		GraphNode start = n[3];
		GraphNode end = n[5];
		System.out.println(search(g, start, end));
	}
	
	public static Graph createNewGraph()
	{
		Graph g = new Graph();        
		GraphNode[] temp = new GraphNode[6];

		temp[0] = new GraphNode("a", 3);
		temp[1] = new GraphNode("b", 0);
		temp[2] = new GraphNode("c", 0);
		temp[3] = new GraphNode("d", 1);
		temp[4] = new GraphNode("e", 1);
		temp[5] = new GraphNode("f", 0);

		temp[0].addAdjacent(temp[1]);
		temp[0].addAdjacent(temp[2]);
		temp[0].addAdjacent(temp[3]);
		temp[3].addAdjacent(temp[4]);
		temp[4].addAdjacent(temp[5]);
		for (int i = 0; i < 6; i++) {
			g.addNode(temp[i]);
		}
		return g;
	}
}
