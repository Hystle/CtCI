package test;

public class Node {
	public int data;
	public Node next = null;
	
	public Node() {
	}

	public Node(int data){
		this.data = data;
	}
	
	@Override
	public String toString() {
		return "Node [data=" + data + "]";
	}
	
	public void appendToTail(int d){
		Node end = new Node(d);
		Node top = this;
		while(top.next != null){
			top = top.next;
		}
		top.next = end;
	}
	
	/**
	 * Given top node and the value, nodes containing this value will be deleted
	 * New top node will be return
	 * @param top
	 * @param d
	 * @return
	 */
	public Node deleteNode(Node top, int d){
		Node n = top;
		// if top is deleted, move to new top
		if(n.data == d){
			return n.next;
		}
		while(n != null){
			// n->prev; targ->curr
			Node targ = n.next;
			if(targ.data == d){
				n.next = targ.next;
			}
			n = n.next;
		}
		return top;
	}
}
