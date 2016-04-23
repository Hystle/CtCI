package q4_5_ValidateBST;

import model.TreeNode;
/**
 * use in-order traversal move nodes into an array
 * elements in array should be in sequence
 * @author Zach
 *
 */
public class SolutionA {
	public static boolean validateBST(TreeNode root){
		int[] array = new int[root.getSize()];
		copyBST(root, array);
		for(int i=0; i<array.length; i++){
			if(array[i] <= array[i-1]){
				return false;
			}
		}
		return true;
	}

	private static void copyBST(TreeNode root, int[] array) {
		int index = 0;
		// base case
		if(root == null){
			return;
		}
		// copy left
		copyBST(root.left, array);
		// copy current
		array[index] = root.data;
		index++;
		// copy right
		copyBST(root.right, array);
	}
}
