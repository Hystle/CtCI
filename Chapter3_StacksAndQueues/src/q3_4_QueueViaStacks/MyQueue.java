package q3_4_QueueViaStacks;

import java.util.Stack;

/**
 * shift data only when peek and dequeue
 * @author Zach
 *
 * @param <T>
 */
public class MyQueue<T> {
	Stack<T> oStack, nStack = null;
	
	public MyQueue(){
		// stack keeps newest data at top
		nStack = new Stack<>();
		// stack gets data from nStack: oldest at top
		oStack = new Stack<>();
	}
	
	public void enqueue(T val){
		nStack.push(val);
	}
	// reverse data order in oStack
	public void shiftStacks(){
		if(oStack.isEmpty()){
			while(nStack != null){
				oStack.push(nStack.pop());
			}
		}
	}
	
	// peek from oStack
	public T peek(){
		shiftStacks();
		return oStack.peek();
	}
	
	// dequeue from oStack
	public T dequeue(){
		shiftStacks();
		return oStack.pop();
	}
}
