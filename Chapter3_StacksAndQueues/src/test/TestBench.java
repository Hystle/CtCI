package test;

import org.junit.Test;

public class TestBench {

	@Test
	public void testArrayStack() {
		ArrayStack stack = new ArrayStack();
		for (int i = 0; i < 10; i++) {
			stack.push(i);
		}
		while (!stack.isEmpty()) {
			System.out.print(stack.pop() + " ");
		}
	}
	
	@Test
	public void testLinkedListStack(){
		LinkedListStack llStack = new LinkedListStack();
		for (int i = 0; i < 10; i++) {
			llStack.push(i);
		}
		while(!llStack.isEmpty()){
			System.out.print(llStack.pop() + " ");
		}
	}
	
	@Test
	public void testArrayQueue(){
		ArrayQueue queue = new ArrayQueue();
		for(int i=0; i<10; i++){
			queue.enqueue(i);
		}
		while(!queue.isEmpty()){
			System.out.print(queue.dequeue() + " ");
		}
	}

	@Test
	public void testLinkedListQueue(){
		LinkedListQueue linkedListQueue = new LinkedListQueue();
		for (int i = 0; i < 10; i++) {
			linkedListQueue.enqueue(i);
		}
		while(!linkedListQueue.isEmpty()){
			System.out.print(linkedListQueue.dequeue() + " ");
		}
	}
}
