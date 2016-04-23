package q3_2_StackMin;

import java.util.Stack;

public class StackWithMin2 extends Stack<Integer>{
	private static final long serialVersionUID = 943826198507380320L;
	// minStack only contains one value: the min of StackWithMin2
	Stack <Integer> minStack;
	
	public StackWithMin2(){
		minStack = new Stack<>();
	}
	
	public void push(int value){
		if(value <= getOldMin()){
			minStack.push(value);
		}
		super.push(value);
	}
	
	public Integer pop(){
		int value = super.pop();
		if(value == getOldMin()){
			minStack.pop();
		}
		return value;
	}

	private int getOldMin() {
		if(minStack.isEmpty()){
			return Integer.MAX_VALUE;
		}
		return minStack.peek();
	}
}
