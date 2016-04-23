package test;

public class ArrayStack {
	final int MAX = 100;
	final int EMPTY = -9999;
	int top = -1;
	int[] st = new int[MAX];
	
	public boolean isEmpty(){
		return top == -1;
	}
	
	public void push(int n){
		if(top == MAX - 1){
			System.out.println("Overflow");
			System.exit(1);
		}
		++top;
		st[top] = n;
	}
	
	public int pop(){
		if (this.isEmpty()) {
			return EMPTY;
		}
		int hold = st[top];
		--top;
		return hold;
	}
}
