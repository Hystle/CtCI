package q4_4_CheckBalance;

import model.TreeNode;

public class SolutionB {
	public static boolean checkBalance(TreeNode root){
		if(checkHeight(root) == -1){
			return false;
		}
		else{
			return true;
		}
	}

	private static int checkHeight(TreeNode root) {
		if(root == null){
			return 0;
		}
		
		int leftHeight = checkHeight(root.left);
		if(leftHeight == -1){
			return -1;
		}
		
		int rightHeight = checkHeight(root.right);
		if(rightHeight == -1){
			return -1;
		}
		
		int diff = Math.abs(leftHeight - rightHeight);
		if(diff > 1){
			return -1;
		}
		else{
			return Math.max(leftHeight, rightHeight) + 1;
		}
	}
}
