package q4_5_ValidateBST;

import model.TreeNode;

public class SolutionC {
	public static boolean checkBST(TreeNode node){
		return checkBST(node, null, null);
	}

	private static boolean checkBST(TreeNode node, Integer min, Integer max) {
		// base case
		if(node == null){
			return true;
		}
		// check current
		if((min != null && node.data <= min) ||(max != null && node.data >= max)){
			return false;
		}
		// check children
		if(!checkBST(node.left, min, node.data)|| !checkBST(node.right, node.data, max)){
			return false;
		}
		return true;
	}
	
}
