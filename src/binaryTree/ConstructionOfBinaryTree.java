package binaryTree;



import java.util.HashMap;

/**
 * Program to construct a binary tree from a preorder and inorder traversal
 * @author pramothinidk
 * ref : http://edwardliwashu.blogspot.com/2013/01/construct-binary-tree-from-preorder-and.html
 */
public class ConstructionOfBinaryTree {
	HashMap<Integer, Integer> inorderHM = new HashMap<Integer, Integer>();
	
	public void mapIndex(int[] inorder){
		for(int i=0; i< inorder.length ; i++){
			inorderHM.put(inorder[i],i);
		}
	}
	
	public Node constructTree(int[] in,int inStart,int inEnd,int[] pre,int preStart,int preEnd){
		if(inStart > inEnd || preStart > preEnd)
			return null;
		Node root = new Node(pre[preStart]);
		int offset = inorderHM.get(pre[preStart]);
		int len = offset - inStart;
		root.left = constructTree(in,inStart,offset-1,pre,preStart+1,preStart+len);
		root.right = constructTree(in,offset+1,inEnd,pre,preStart+len+1,preEnd);
		return root;
		
	}
	
	public void printBST(Node curNode){
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
		ConstructionOfBinaryTree cbst = new ConstructionOfBinaryTree();
//		int[] preorder = {7,10,4,3,1,2,8,11};
//		int[] inorder = {4,10,3,1,7,11,8,2};
		
		int[] inorder = {10,30,40,50,60,70,90};
		int[] preorder = {50,30,10,40,70,60,90};
		cbst.mapIndex(inorder);
		Node n = cbst.constructTree(inorder, 0 , inorder.length-1 ,preorder,0,preorder.length-1);
		cbst.printBST(n);
		
		
	}
}

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
