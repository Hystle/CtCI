package q4_6_Successor;

import model.TreeNode;

public class Solution {
	public static TreeNode inOrderSucc(TreeNode node){
		if(node == null){
			return null;
		}
		// if there is right subtree, return the left most one
		if(node.right != null){
			return leftMostChild(node.right);
		}
		// if no right subtree for this node
		else{
			// go up
			TreeNode n = node;
			TreeNode p = n.parent;
			/*
			 * if this node doesn't have right subtree itself
			 * but it's on the right subtree of its parent: go up till on left
			 */
			while(p != null && p.left != n){
				n = p;
				p = p.parent;
			}
			return p;
		}
	}
	
	private static TreeNode leftMostChild(TreeNode n){
		if(n == null){
			return null;
		}
		while(n.left != null){
			n = n.left;
		}
		return n;
	}
}
