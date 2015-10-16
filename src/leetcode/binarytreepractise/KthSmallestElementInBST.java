package leetcode.binarytreepractise;

import java.util.ArrayList;
/**
 * Given a binary search tree, write a function kthSmallest to find the kth smallest element in it.
 * https://leetcode.com/problems/kth-smallest-element-in-a-bst/
 * @author pramothinidk
 * Logic: do inorder traversal for upto k elements and return the kth element
 *
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class KthSmallestElementInBST {
	public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> inorderResult = new ArrayList<Integer>();
        inorderResult = inordertraversal(root, inorderResult , k);
        return inorderResult.get(k-1);
    }
    
    public ArrayList<Integer> inordertraversal(TreeNode root, ArrayList<Integer> inorderResult , int k){
        if(root == null || (inorderResult.size() == k))
            return inorderResult;
        inorderResult = inordertraversal(root.left , inorderResult , k);
        inorderResult.add(root.val);
        inorderResult = inordertraversal(root.right , inorderResult, k);
        return inorderResult;
        
    }
}
