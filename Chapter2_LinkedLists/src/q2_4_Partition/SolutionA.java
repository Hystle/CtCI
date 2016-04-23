package q2_4_Partition;

import model.Node;

public class SolutionA {
	public static Node partition(Node node, int k){
		// head == tail => top at beginning: 3
		Node head = node;
		Node tail = node;
		while(node != null){
			/*
			 *  must save the next node for input linked list!!
			 *  because variable node will be changed when < k
			 */
			Node nextOfInput = node.next;
			if(node.data < k){
				// insert new node in front of old one: ...2->1->3
				node.next = head;
				head = node;
			}
			else{
				// insert new node behind old one: 3->5->8...
				tail.next = node;
				tail = node;
			}
			node = nextOfInput;
		}
		tail.next = null;
		return head;
	}
	public static void main(String[] args) {
		Node top = new Node(0);
		for(int i=1; i<10; i++){
			top.appendToTail(i);
		}
		Node newTop = partition(top,5);
		while(newTop != null){
			System.out.println(newTop);
			newTop = newTop.next;
		}
	}
}
