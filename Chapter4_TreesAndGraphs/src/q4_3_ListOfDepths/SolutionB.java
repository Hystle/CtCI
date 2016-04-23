package q4_3_ListOfDepths;

import java.util.ArrayList;
import java.util.LinkedList;

import model.TreeNode;
/**
 * breath-first search
 * @author Zach
 *
 */
public class SolutionB {
	public static ArrayList<LinkedList<TreeNode>> createLevelLinkedList(TreeNode root){
		ArrayList<LinkedList<TreeNode>> lists = new ArrayList<>();
		// visit root
		LinkedList<TreeNode> levelList = new LinkedList<>();
		if(root != null){
			levelList.add(root);
		}
		while(levelList.size() > 0){
			// add curr levelList
			lists.add(levelList);
			// save curr levelList as parent
			LinkedList<TreeNode> parents = levelList;
			// create new levelList
			levelList = new LinkedList<TreeNode>();
			// visit children
			for(TreeNode parent: parents){
				if(parent.left != null){
					levelList.add(parent.left);
				}
				if(parent.right != null){
					levelList.add(parent.right);
				}
			}
		}
		return lists;
	}
}
