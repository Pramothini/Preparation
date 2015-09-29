import java.util.Stack;

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
		preorderTraversal(node.right);
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
		postorderTraversal(node.right);
		System.out.println(node.data);
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
	 * Print the top view of the binary tree.
	 * @param root
	 */
	void top_view(Node root)
	{
		Stack stack = new Stack();
		Node rootleft = root.left;
		Node rootright = root.right;
		while(rootleft != null){
			stack.push(rootleft.data);
			rootleft = rootleft.left;
		}

		while(!stack.isEmpty()){
			System.out.print(stack.pop() + " ");
		}
		System.out.print(root.data + " ");

		while(rootright != null){
			System.out.print(rootright.data + " ");
			rootright = rootright.right;
		}

	}


	/**
	 * Iteratively traverses and prints a binary Tree
	 * @param root
	 */
	public void printPostOrderIterative(Node root) {
		if(root == null)
			return; 
		Stack<Node> stack = new Stack<Node>();
		stack.push(root);
		Node previous = null;
		while(!stack.empty()){
			Node current = stack.peek();
			if(previous == null || previous.left == current || previous.right == current){
				if(current.left != null){
					stack.push(current.left);
				}else if(current.right != null){
					stack.push(current.right);
				}else{
					System.out.println(stack.pop().data);
				}
			}else if(current.left == previous){
				if(current.right == null){
					System.out.println(stack.pop().data);
				}else{
					stack.push(current.right);
				}
			}else if(current.right == previous){
				System.out.println(stack.pop().data);
			}
			previous = current;
		}

	}

	int height(Node root)
	{
		if(root == null)
			return 0;
		return 1+Math.max(height(root.left),height(root.right));

	}
	
	/**
	 * return the lowest common ancestor (LCA) of v1 and v2 in the binary search tree
	 * 
	 * http://articles.leetcode.com/2011/07/lowest-common-ancestor-of-a-binary-search-tree.html
	 * 
	 * There’s only three cases you need to consider.

			Both nodes are to the left of the tree.
			Both nodes are to the right of the tree.
			One node is on the left while the other is on the right.
	 * @param root
	 * @param v1
	 * @param v2
	 * @return
	 */
	static Node lca(Node root,int v1,int v2)
    {
    if(Math.max(v1,v2) < root.data)
        return lca(root.left, v1,v2);
    else if(Math.min(v1,v2) > root.data)
        return lca(root.right, v1,v2);
    else
        return root;

       
    }

	public static void main(String args[]){
		BinarySearchTree bst = new BinarySearchTree();
		Node top = new Node(40);
		bst.insertData(top,25);
		bst.insertData(top,78);
		bst.insertData(top,10);
		bst.insertData(top,32);
		printBST(top);
		
		System.out.println("Height of the tree is "+ bst.height(top));
		System.out.println("lca of the tree is "+ lca(top,10,32).data);

		bst.findMin(top);
		//output : The min element in this BST is 10
		bst.findMax(top);
		// output : The max element in this BST is 78

		System.out.println("Inorder traversal");
		bst.inorderTraversal(top);

		System.out.println("preorder traversal");
		bst.preorderTraversal(top);

		System.out.println("postorder traversal - recursive");
		bst.postorderTraversal(top);

		System.out.println();


		System.out.println("postorder traversal - iterative");
		bst.printPostOrderIterative(top);
	}
}



