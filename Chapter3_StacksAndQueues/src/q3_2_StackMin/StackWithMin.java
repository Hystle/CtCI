package q3_2_StackMin;

import model.MyStack;

public class StackWithMin extends MyStack<NodeWithMin>{
	public void push(int value){
		int newMin = Math.min(value, getOldMin());
		NodeWithMin np = new NodeWithMin(value, newMin);
		super.push(np);
	}
	private int getOldMin(){
		// if it's 1st node in stack: compare with Max Integer
		if(this.isEmpty()){
			return Integer.MAX_VALUE;
		}
		return peek().min;
	}
}

class NodeWithMin{
	int data;
	int min;
	
	public NodeWithMin(Integer data, Integer min) {
		this.data = data;
		this.min = min;
	}
	
}
