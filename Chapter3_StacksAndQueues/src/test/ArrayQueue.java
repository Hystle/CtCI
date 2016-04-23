package test;

/**
 * circular queue
 * @author Zichao Zhou
 *
 */
public class ArrayQueue {
	final int MAX = 100;
	int head = 0; 
	int tail = 0;
	int [] QA = new int[MAX];
	
	public boolean isEmpty(){
		return head == tail;
	}
	
	public void enqueue(int n){
		tail = tail + 1;
		if(tail == head){
			System.out.println("Full Queue");
			System.exit(1);
		}
		QA[tail] = n;
	}
	
	public int dequeue(){
		if(this.isEmpty()){
			System.out.println("Empey Queue");
			System.exit(2);
		}
		// head default value is 0, so must increase by 1 first
		head = head + 1;
		return QA[head];
	}
}
