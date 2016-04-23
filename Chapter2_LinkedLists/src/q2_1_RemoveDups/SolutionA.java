package q2_1_RemoveDups;

import java.util.HashSet;
import java.util.Set;

import model.Node;

/**
 * use temporary buffer
 * @author Zach
 *
 */
public class SolutionA {
	public static void removeDups(Node n){
		Set<Integer> set = new HashSet<>();
		Node prev = n;
		while(n.next != null){
			// found duplicate in set: delete this node
			if(set.contains(n.data)){
				prev.next = n.next;
				
			}
			// no duplicate: add this node and mark prev node
			else{
				set.add(n.data);
				prev = n;
			}
			n = n.next;
		}
	}
}
