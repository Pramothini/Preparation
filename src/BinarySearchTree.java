class Node{
	Node left;
	Node right;
	int data;

	Node(int data){
		left = null;
		right = null;
		this.data = data;
	}
}

/**
 * Program to recursively add a new element to a binary search tree
 * @author pramothinidk
 *
 */
public class BinarySearchTree {
	
	/**
	 * recursively adds a new element to a binary search tree
	 * @param curNode
	 * @param data
	 */
	public void insertData(Node curNode,int data){
		if(data < curNode.data){
			if(curNode.left == null){
				curNode.left = new Node(data);
				return;
			}
			else
				insertData(curNode.left,data);
		}

		if(data > curNode.data){
			if(curNode.right == null){
				curNode.right = new Node(data);
				return;
			}
			else
				insertData(curNode.right,data);
		}
	}

	public static void printBST(Node curNode){
		if(curNode != null)
			System.out.println(curNode.data);
		if(curNode.left != null)
			System.out.print("/");
		if(curNode.right != null)
			System.out.print("\\");
		System.out.println();
		if(curNode.left != null)
			printBST(curNode.left);
		if(curNode.right != null)
			printBST(curNode.right);


	}

	public static void main(String args[]){
		BinarySearchTree bst = new BinarySearchTree();
		Node top = new Node(12);
		bst.insertData(top,10);
		bst.insertData(top,11);
		bst.insertData(top,9);
		bst.insertData(top,50);
		bst.insertData(top,40);
		printBST(top);

	}
}



