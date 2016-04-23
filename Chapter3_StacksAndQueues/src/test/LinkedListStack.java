package test;

public class LinkedListStack<T>{
	Node top = null;
	final int EMPTY = -9999;
	
	public boolean isEmpty(){
		return top == null;
	}
	
	public void push(int d){
		Node n = new Node(d);
		n.next = top;
		top = n;
	}
	
	public int pop(){
		if (this.isEmpty()) {
			return EMPTY;
		}
		int hold = top.data;
		top = top.next;
		return hold;
	}
}
