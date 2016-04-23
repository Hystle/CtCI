package q2_2_ReturnKthToLast;

import model.Node;
/**
 * recursive
 * recurse through linked list
 * return 0 when it hits end and then 1,2,3... till k 
 * @author Zach
 *
 */
public class SolutionA {
	public static int printKthToLast(Node top, int k){
		
		if (top == null){
			return 0;
		}
		
		int index = printKthToLast(top.next, k) + 1;
		
		if(index == k){
			System.out.println(k + "th to last is " + top.data);
		}
		return index;
	}
	
	public static void main(String[] args) {
		Node top = new Node(0);
		for (int i = 1; i < 10; i++) {
			top.appendToTail(i);
		}
		for (int i = 0; i < 5; i++) {
			printKthToLast(top, i);
		}
//		while(top != null){
//			System.out.println(top.data);
//			top = top.next;
//		}
	}
}
