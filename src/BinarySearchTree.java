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
 * Program that implements Binary Search Tree
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

	/**
	 * Finds the min element present in this BST
	 * @param n
	 */
	public void findMin(Node n){
		if(n != null){
			while (n.left!=null)
				n = n.left;
			System.out.println( " The min element in this BST is "+ n.data);
		}
	}

	/**
	 * Finds the max element present in this BST
	 * @param n
	 */
	public void findMax(Node n){
		if(n != null){
			while (n.right!=null)
				n = n.right;
			System.out.println( " The max element in this BST is "+ n.data);
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
	
	/**
	 * Traverse and print the BST inorder
	 * inorder - left, current node, right
	 * @param node
	 */
	public void inorderTraversal(Node node){
		if(node == null)
			return;
		inorderTraversal(node.left);
		System.out.println(node.data);
		inorderTraversal(node.right);
	}
	
	/**
	 * Traverse and print the BST preorder
	 * preorder - current node,left,right
	 * @param node
	 */
	public void preorderTraversal(Node node){
		if(node == null)
			return;
		System.out.println(node.data);
		preorderTraversal(node.left);
		inorderTraversal(node.right);
	}
	
	/**
	 * Traverse and print the BST postorder
	 * postorder - left,right,current node
	 * @param node
	 */
	public void postorderTraversal(Node node){
		if(node == null)
			return;
		postorderTraversal(node.left);
		inorderTraversal(node.right);
		System.out.println(node.data);
	}
	
	public static void main(String args[]){
		BinarySearchTree bst = new BinarySearchTree();
		Node top = new Node(40);
		bst.insertData(top,25);
		bst.insertData(top,78);
		bst.insertData(top,10);
		bst.insertData(top,32);
		printBST(top);
		bst.findMin(top);
		//output : The min element in this BST is 10
		bst.findMax(top);
		// output : The max element in this BST is 78
		
		System.out.println("Inorder traversal");
		bst.inorderTraversal(top);

		System.out.println("preorder traversal");
		bst.preorderTraversal(top);
		
		System.out.println("postorder traversal");
		bst.postorderTraversal(top);
	}
}



