package q2_6_Palindrome;

import model.LinkedListStack;
import model.Node;

public class SolutionB {
	public static boolean isPalindrome(Node head){
		Node fast = head;
		Node slow = head;
		LinkedListStack stack = new LinkedListStack();
		
		// fast.next!= null:[make sure fast will no move to null
		while(fast != null && fast.next != null){
			stack.push(slow.data);
			slow = slow.next;
			fast = fast.next.next;
		}
		
		// has odd numbers and slow is at middle: skip it
		if(fast != null){
			slow = slow.next;
		}
		
		// compare stack top 
		while(slow != null && !stack.isEmpty()){
			int top = stack.pop();
			if(top != slow.data){
				return false;
			}
			slow = slow.next;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Node l1 = new Node(1);
		l1.appendToTail(2);
		l1.appendToTail(2);
		l1.appendToTail(1);
		System.out.println(isPalindrome(l1));
	}
}
