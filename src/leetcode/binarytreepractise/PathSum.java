package leetcode.binarytreepractise;


/** error code **/
public class PathSum {
	static class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; left = null; right = null; }
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
	
	public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null)
            return false;
        if(root.left != null && (sum - (root.val+root.left.val) == 0) && (root.left.left == null && root.left.right == null))
            return true;
        if(root.right != null && (sum - (root.val+root.right.val) == 0)&& (root.right.left == null && root.right.right == null))
            return true;
        if(sum - root.val == 0 && (root.right == null && root.left == null))
            return true;
        if(root.left != null){
            return hasPathSum(root.left , sum - root.left.val);
        }
        if(root.right != null){
            return hasPathSum(root.right , sum - root.right.val);
        }
        
        return false;
    }
	
	public static void main(String args[]){
		PathSum bst = new PathSum();
		TreeNode top = new TreeNode(1);
		bst.insertData(top,-2);
		bst.insertData(top,-3);
		
		printBST(top);
		System.out.println(bst.hasPathSum(top , 4));
	}

	
	
	
}
