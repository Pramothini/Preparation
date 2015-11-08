package leetcode.binarytreepractise;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

import leetcode.binarytreepractise.PathSum.TreeNode;

public class SerializeDeserializeBT {
	StringBuilder q = new StringBuilder ();
	public String serialize(TreeNode root) {
        q.append(root!=null ? root.val+"," : "#,");
        if(root!=null){
            serialize(root.left);
            serialize(root.right);
        }
        return q.toString().substring(0,q.length()-1);
    }
	
	
	 /**
		 * recursively adds a new element to a binary search tree
		 * @param curNode
		 * @param data
		 */
		public void insertData(TreeNode curNode,int data){
			if(data < curNode.val){
				if(curNode.left == null){
					curNode.left = new TreeNode(data);
					return;
				}
				else
					insertData(curNode.left,data);
			}

			if(data > curNode.val){
				if(curNode.right == null){
					curNode.right = new TreeNode(data);
					return;
				}
				else
					insertData(curNode.right,data);
			}
		}
		
		public static void printBST(TreeNode curNode){
			if(curNode != null)
				System.out.println(curNode.val);
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
		
		 public TreeNode deserialize(String data) {
			 if(data.equals("#")) return null;
		     Queue<String> q = new LinkedList<String>(Arrays.asList(data.split(",")));
		     return deserialize(q);
		 }
		    public TreeNode deserialize(Queue<String> q) {
		    	TreeNode root;
		    	if(q.peek().equals("#")){
		    		root = null;
		    		q.poll();
		    	}
		    	else
		    		root = new TreeNode(Integer.parseInt(q.poll()));
		    	if(root != null && q.size() >=0){
		    		root.left = deserialize(q);
		    		root.right = deserialize(q);
		    	}
		    	return root;
		    }
		
		public static void main(String args[]){
			SerializeDeserializeBT bst = new SerializeDeserializeBT();
			TreeNode top = new TreeNode(2);
			bst.insertData(top,1);
			bst.insertData(top,3);
			bst.insertData(top,8);
//			bst.insertData(top,12);
//			bst.insertData(top,1);
//			bst.insertData(top,21);
			//printBST(top);
			
//			System.out.println(bst.serialize(top));
			
			TreeNode res = bst.deserialize(bst.serialize(top));
			printBST(res);
			
		}
}
