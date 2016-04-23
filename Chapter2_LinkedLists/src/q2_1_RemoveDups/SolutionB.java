package q2_1_RemoveDups;

import model.Node;

/**
 * No extra buffer
 * @author Zach
 *
 */
public class SolutionB {
	public static void removeDups(Node top){
		Node curr = top;
		while(curr != null){
			Node runner = curr;
			// use runner.next to judge: keep track of prev node!
			while(runner.next != null){
				if(runner.next.data == curr.data){
					runner.next = runner.next.next;
				}
				else{
					runner = runner.next;
				}
			}
			curr = curr.next;
		}

	}
}
