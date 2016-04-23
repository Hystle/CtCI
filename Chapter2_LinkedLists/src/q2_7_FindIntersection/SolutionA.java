package q2_7_FindIntersection;

import model.Node;

public class SolutionA {
	public static Node findIntersection(Node l1, Node l2){
		Result r1 = getTailAndSize(l1);
		Result r2 = getTailAndSize(l2);
		
		if(r1.tail != r2.tail){
			return null;
		}
		
		Node longer = r1.size > r2.size ? l1 : l2;
		Node shorter = r1.size > r2.size ? l2 : l1;
		
		Node nt = getNewTop(longer, Math.abs(r1.size-r2.size));
		
		while(nt != shorter){
			nt = nt.next;
			shorter = shorter.next;
		}
		return nt;
	}

	private static Node getNewTop(Node head, int diff) {
		Node tail = head;
		while(diff > 0 && tail != null){
			tail = tail.next;
			diff--;
		}
		return tail;
	}

	private static Result getTailAndSize(Node head) {
		if(head == null){
			return null;
		}
		int size = 1;
		Node tail = head;
		while(tail.next != null){
			size ++;
			tail = tail.next;
		}
		return new Result(tail,size);
	}
}

class Result{
	public Node tail;
	public int size;
	public Result(Node tail, int size){
		this.tail = tail;
		this.size = size;
	}
}


