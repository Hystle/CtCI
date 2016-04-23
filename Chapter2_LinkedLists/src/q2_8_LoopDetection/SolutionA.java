package q2_8_LoopDetection;

import model.Node;
/**
 * 
 * @author Zach
 *
 */
public class SolutionA {
	public static Node loopDetection(Node head){
		Node fast = head;
		Node slow = head;
		// find the collision node: LoopSize-k steps into linked list 
		while(fast != null && fast.next != null){
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast){
				break;
			}
		}
		// check if there are no loop
		if(fast == null || fast.next == null){
			return null;
		}
		// move slow to head; leave fast at collision point
		slow = head;
		// both nodes are k steps away from loop start
		while(slow != fast){
			// move at same pace till meet again
			slow = slow.next;
			fast = fast.next;
		}
		return fast;
	}
}
