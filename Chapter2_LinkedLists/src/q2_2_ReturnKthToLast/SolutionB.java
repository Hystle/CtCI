package q2_2_ReturnKthToLast;

import model.Node;
/**
 * Optimal way
 * keep two pointers apart for k nodes
 * move both pointers forward till p1 hits end
 * @author Zach
 *
 */
public class SolutionB {
	public static Node returnKthToLast(Node top, int k){
		Node p1 = top;
		Node p2 = top;

		for (int i=0; i<k; i++){
			// if linked list length < k 
			if(p1 == null){
				return null;
			}
			// move k nodes
			p1 = p1.next;
		}

		while(p1 != null){
			p1 = p1.next;
			p2 = p2.next;
		}
		return p2;
	}

	public static void main(String[] args) {
		Node top = new Node(0);
		for (int i = 1; i < 10; i++) {
			top.appendToTail(i);
		}
		for (int i = 0; i < 5; i++) {
			System.out.println(returnKthToLast(top, i));
		}
	}
}
