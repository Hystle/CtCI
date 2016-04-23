package q2_5_SumLists;

import model.Node;

/**
 * follow-up: forward
 * @author Zach
 *
 */
public class SolutionB {

	public static Node sumLists(Node l1, Node l2, int carry){
		int len1 = length(l1);
		int len2 = length(l2);
		if (len1 < len2) {
			l1 = padList(l1, len2 - len1);
		} else {
			l2 = padList(l2, len1 - len2);
		}
		PartialSum sum = addListsHelper(l1, l2);
		if (sum.carry == 0) {
			return sum.sum;
		} else {
			Node result = insertBefore(sum.sum, sum.carry);
			return result;
		}
	}

	private static int length(Node l) {
		if (l == null) {
			return 0;
		} else {
			return 1 + length(l.next);
		}
	}

	private static Node padList(Node l, int padding) {
		Node head = l;
		for (int i = 0; i < padding; i++) {
			head = insertBefore(head, 0);
		}
		return head;
	}

	private static PartialSum addListsHelper(Node l1, Node l2) {
		if (l1 == null && l2 == null) {
			PartialSum sum = new PartialSum();
			return sum;
		}
		PartialSum sum = addListsHelper(l1.next, l2.next);
		int val = sum.carry + l1.data + l2.data;
		Node full_result = insertBefore(sum.sum, val % 10);
		sum.sum = full_result;
		sum.carry = val / 10;
		return sum;
	}

	private static Node insertBefore(Node list, int data) {
		Node node = new Node(data);
		if (list != null) {
			node.next = list;
		}
		return node;
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

class PartialSum{
	public Node sum = null;
	public int carry = 0;
}

