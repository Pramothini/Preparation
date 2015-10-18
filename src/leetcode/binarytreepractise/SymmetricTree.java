package leetcode.binarytreepractise;

/**
 * https://leetcode.com/problems/symmetric-tree/
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

For example, this binary tree is symmetric:

    1
   / \
  2   2
 / \ / \
3  4 4  3
But the following is not:
    1
   / \
  2   2
   \   \
   3    3
 * @author pramothinidk
 *
 */
public class SymmetricTree {
	public boolean isSymmetric(TreeNode root) {
        if(root == null)
            return true;
        return isSymmetricHelper(root.left, root.right);
        
    }
    
    public boolean isSymmetricHelper(TreeNode left, TreeNode right){
        if(left == null)
            return (right == null);
        if(right == null)
            return false;
        return (left.val == right.val && isSymmetricHelper(left.left,right.right) && isSymmetricHelper(left.right,right.left)  );
    }
}
