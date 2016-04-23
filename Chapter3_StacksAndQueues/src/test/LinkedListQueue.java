package test;

public class LinkedListQueue {
	final int EMPTY = -9999;
	Node head = null;
	Node tail = null;
	
	public boolean isEmpty(){
		return head == null;
	}
	
	public void enqueue(int d){
		Node n = new Node(d);
		if (this.isEmpty()) {
			head = n;
			tail = n;
		}
		else{
			tail.next = n;
			tail = n;
		}
	}
	
	public int dequeue(){
		if(this.isEmpty()){
			System.out.println(EMPTY);
			System.exit(1);
		}
		int hold = head.data;
		head = head.next;
		// check if queue is empty after this dequeue
		if(head == null){
			tail = null;
		}
		return hold;
	}
}
