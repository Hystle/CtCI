package q2_3_DeleteMiddleNode;

import model.Node;

/**
 * delete middle without access to previous node:
 * duplicate next node's data and link to this node
 * delete that node
 * @author Zach
 *
 */
public class SolutionA {
	public static void deleteMiddleNode(Node n){
		if(n == null || n.next == null){
			n = null;
		}
		n.data = n.next.data;
		n.next = n.next.next;
		n.next.next = null;
	}
}
