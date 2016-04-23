package model;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class MyQueue<T> {
	private Node<T> first = null;
	private Node<T> last = null;
	
	public void add(T item){
		Node<T> t = new Node<>(item);
		if(last != null){
			last.next = t;
		}
		last = t;
		if(first == null){
			first = last;
		}
	}
	
	public T remove(){
		if(first == null){
			throw new NoSuchElementException();
		}
		T data = first.data;
		first = first.next;
		if(first == null){
			last = null;
		}
		return data;
	}
	
	public T peek(){
		if(first == null){
			throw new EmptyStackException();
		}
		return first.data;
	}
	
	public boolean isEmpty(){
		return first == null;
	}
}
