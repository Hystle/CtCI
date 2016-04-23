package q2_5_SumLists;

import model.Node;
/**
 * backward
 * @author Zach
 *
 */
public class SolutionA {
	public static Node sumLists(Node l1, Node l2, int carry){
		if(l1 == null && l2 == null && carry == 0){
			return null;
		}
		Node result = new Node();
		int value = carry;
		// check if there is number for each unit
		if(l1 != null){
			value += l1.data;
		}
		if(l2 != null){
			value += l2.data;
		}
		result.data = value % 10;
		// if there is null in any of the lists, no need to calculate next unit
		if(l1 != null || l2 != null){
			Node more = sumLists(l1 == null ? null : l1.next,
								 l2 == null ? null : l2.next, 
								 value >= 10 ? 1 : 0 );
			result.next = more;
		}
		return result;
	}
	public static void main(String[] args) {
		Node l1 = new Node(7);
		l1.appendToTail(1);
		l1.appendToTail(6);
		Node l2 = new Node(5);
		l2.appendToTail(9);
		l2.appendToTail(2);
		Node top = sumLists(l1, l2, 0);
		while (top != null){
			System.out.println(top.data);
			top = top.next;
		}
	}
}
