package q3_1_ThreeInOne;

import java.util.EmptyStackException;

public class FixedMultiStack {
	private int stackNum = 3;
	private int stackCapacity;
	// total length of three stacks
	private int[] values;
	// size of each stack => top of each stack
	private int[] sizes;
	
	public FixedMultiStack(int stackSize){
		stackCapacity = stackSize;
		values = new int[stackSize * stackNum];
		sizes = new int[stackNum];
	}
	
	public void push(int stackNum, int value) throws Exception{
		if(isFull(stackNum)){
			throw new Exception();
		}
		sizes[stackNum]++;
		values[indexOfTop(stackNum)] = value;			
	}
	
	public int pop(int stackNum){
		if(isEmpty(stackNum)){
			throw new EmptyStackException();
		}
		int hold = values[indexOfTop(stackNum)];
		sizes[stackNum]--;
		return hold;
	}

	public int peek(){
		if(isEmpty(stackNum)){
			throw new EmptyStackException();
		}
		return values[indexOfTop(stackNum)];
	}
	
	private boolean isEmpty(int stackNum2) {
		return sizes[stackNum2] == 0;
	}

	private boolean isFull(int stackNum2) {
		return sizes[stackNum2] == stackCapacity;
	}

	private int indexOfTop(int stackNum2) {
		int offset = stackNum * stackCapacity;
		int size = sizes[stackNum2];
		return offset + size -1;
	}

}
