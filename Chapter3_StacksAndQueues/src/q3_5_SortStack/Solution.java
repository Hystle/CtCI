package q3_5_SortStack;

import java.util.Stack;

public class Solution {
	public static Stack<Integer> sort(Stack<Integer> s1){
		Stack<Integer> s2 = new Stack<>();
		while(!s1.isEmpty()){
			int tmp = s1.pop();
			while(!s2.isEmpty() && s2.peek() < tmp){
				s1.push(s2.pop());
			}
			s2.push(tmp);
		}
		return s2;
	}
}
