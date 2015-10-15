package leetcode;
/**
 * Given two binary trees, write a function to check if they are equal or not.
   Two binary trees are considered equal if they are structurally identical and the nodes have the same value.
   https://leetcode.com/problems/same-tree/
 * @author pramothinidk
 *
 */

//Definition for a binary tree node.
 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
 
public class SameTree {
	public boolean isSameTree(TreeNode p, TreeNode q) {
        if( (p == null && q != null) || (p!=null && q==null) )
            return false;
        if(p == null && q == null)
            return true;
        if(p!= null && q!=null){
            if(p.val != q.val)
                return false;
            else{
                if(!isSameTree(p.left, q.left))
                    return false;
                if(!isSameTree(p.right , q.right))
                    return false;
            }
        }
        return true;
    }
}
