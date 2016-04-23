package q4_3_ListOfDepths;

import java.util.ArrayList;
import java.util.LinkedList;

import model.TreeNode;
/**
 * depth-first search
 * @author Zach
 *
 */
public class SolutionA {
	public static ArrayList<LinkedList<TreeNode>> createLevelLinkedList(TreeNode root){
		ArrayList<LinkedList<TreeNode>> lists = new ArrayList<>();
		createLevelLinkedList(root, lists, 0);
		return lists;
	}

	private static void createLevelLinkedList(TreeNode root, ArrayList<LinkedList<TreeNode>> lists, int level) {
		if(root == null){
			return;
		}
		// create OR get list for each level
		LinkedList<TreeNode> levelList = null;
		if(lists.size() == level){
			levelList = new LinkedList<>();
			lists.add(levelList);
		}
		else{
			lists.get(level);
		}
		// KEY LINE: add root to levelList and recursive
		levelList.add(root);
		createLevelLinkedList(root.left, lists, level+1);
		createLevelLinkedList(root.right, lists, level+1);
	}
	
}
