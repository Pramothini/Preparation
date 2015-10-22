package leetcode.binarytreepractise;

import java.util.ArrayList;
import java.util.List;

import leetcode.binarytreepractise.PathSum.TreeNode;
/**
 * Given a binary tree, return all root-to-leaf paths.

For example, given the following binary tree:

   1
 /   \
2     3
 \
  5
All root-to-leaf paths are:

["1->2->5", "1->3"]
https://leetcode.com/problems/binary-tree-paths/
 * @author pramothinidk
 *
 */
public class BinaryTreePaths {
	
	public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<String>();
        result = btpathHelper(root,"",result);
        return result;
    }
    
    public List<String> btpathHelper(TreeNode root , String ans, List<String> result){
        if(root == null)
            return result;
        if(root.left == null && root.right == null)
            result.add(ans+root.val);
        btpathHelper(root.left, ans+root.val+"->", result );
        btpathHelper(root.right, ans+root.val+"->", result );
        return result;
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
	
	public static void main(String args[]){
		BinaryTreePaths bst = new BinaryTreePaths();
		TreeNode top = new TreeNode(11);
		bst.insertData(top,2);
		bst.insertData(top,13);
		bst.insertData(top,8);
		bst.insertData(top,12);
		bst.insertData(top,1);
		bst.insertData(top,21);
		
		
		System.out.println(bst.binaryTreePaths(top));
	}
}
