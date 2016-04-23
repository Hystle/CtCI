package model;

public class TreeNode {
	private int size = 0;
	public int data;
	public TreeNode left; 
	public TreeNode right;
	public TreeNode parent;
	
	public TreeNode(int data) {
		setSize(1);
		this.data = data;
	}
	
	public int getSize() {
		return size;
	}
	
	public void setSize(int size) {
		this.size = size;
	}

	public void setLeftChild(TreeNode left){
		this.left = left;
		if(left != null){
			left.parent = this;
		}
	}
	
	public void setRightChild(TreeNode right){
		this.right = right;
		if(right != null){
			right.parent = this;
		}
	}
	
	public void insertInOrder(int d){  
		if(d <= data){
			if(left == null){
				this.setLeftChild(new TreeNode(d));
			}
			else{
				// recursive!!
				left.insertInOrder(d);
			}
		}
		else{
			if(right == null){
				this.setRightChild(new TreeNode(d));
			}
			else{
				right.insertInOrder(d);
			}
		}
		size++;
	}
	
	public boolean isBST(){
		if(left != null){
			if(data < left.data || !left.isBST()){
				return false;
			}
		}
		if(right != null){
			if(data > right.data || !right.isBST()){
				return false;
			}
		}
		return true;
	}

	public int height(){
		int leftHeight = left != null ? height() : 0;
		int rightHeight = right != null ? height() : 0;
		return Math.max(leftHeight, rightHeight) + 1;
	}
	
	public TreeNode find(int d){
		if(data == d){
			return this;
		}
		else if(data > d){
			return left != null ? left.find(d) : null;
		}
		else if(data < d){
			return right != null ? right.find(d) : null;
		}
		return null;
		
	}
	
	
}
