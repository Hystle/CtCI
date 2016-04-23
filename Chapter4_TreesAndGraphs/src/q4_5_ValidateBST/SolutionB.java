package q4_5_ValidateBST;

import model.TreeNode;

public class SolutionB {
	static Integer last_printed = null;
	public static boolean checkBST(TreeNode n){
		if(n == null){
			return true;
		}
		// 1. check left
		if(!checkBST(n.left)){
			return false;
		}
		// 2. check current
		if(last_printed != null && n.data <= last_printed){
			return false;
		}
		last_printed = n.data;
		// 3. check right
		if(checkBST(n.right)){
			return false;
		}
		// 4. all good
		return true;
	}
}
