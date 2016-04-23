package q4_2_minimalTree;

import model.TreeNode;

public class Solution {
	public static TreeNode createMinimalTree(int[] array){
		// create a method for recursive
		return createMinimalTree(array, 0, array.length-1);
	}

	private static TreeNode createMinimalTree(int[] array, int start, int end) {
		if(start > end){
			return null;
		}
		int mid = (array[start] + array[end]) / 2;
		TreeNode node = new TreeNode(array[mid]);
		node.left = createMinimalTree(array, start, mid-1);
		node.right = createMinimalTree(array, mid+1, end);
		return node;
	}

}
