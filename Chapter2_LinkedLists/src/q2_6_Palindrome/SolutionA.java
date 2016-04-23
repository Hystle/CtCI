package q2_6_Palindrome;

import model.Node;
/**
 * not finished
 * @author Zach
 *
 */
public class SolutionA {
	public static boolean isPalindrome(Node head){
		HeadAndTail reversed = reverse(head);
		return isEqual(head, reversed.head);
	}

	private static boolean isEqual(Node one, Node two) {
		// no need check length
		while(one != null && two != null){
			if(one.data != two.data){
				return false;
			}
			one = one.next;
			two = two.next;
		}
		return one == null && two == null;
	}

	private static HeadAndTail reverse(Node head) {
		return null;
	}
}

class HeadAndTail{
	public Node head;
	public Node tail;
	public HeadAndTail(Node n1, Node n2){
		head = n1;
		tail = n2;
	}
}
