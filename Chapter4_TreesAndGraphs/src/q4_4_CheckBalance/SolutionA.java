package q4_4_CheckBalance;

import model.TreeNode;

public class SolutionA {
	public static boolean checkBalance(TreeNode root){
		if(root == null){
			return true;
		}
		int diff = Math.abs(getHeight(root.left) - getHeight(root.right));
		if(diff > 1){
			return false;
		}
		else{
			return checkBalance(root.left) && checkBalance(root.right);
		}
	}

	private static int getHeight(TreeNode root) {
		if(root == null){
			return 0;
		}
		return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
	}
}
