package model;

import java.util.EmptyStackException;

public class MyStack<T> {
	Node<T> top;
	
	public void push(T item){
		Node<T> np = new Node<>(item);
		np.next = top;
		top = np;
	}
	
	public T pop(){
		if(top == null){
			throw new EmptyStackException();
		}
		T item = top.data;
		top = top.next;
		return item;
	}
	
	public T peek(){
		if(top == null){
			throw new EmptyStackException();
		}
		return top.data;
	}
	
	public boolean isEmpty(){
		return top == null;
	}

}

