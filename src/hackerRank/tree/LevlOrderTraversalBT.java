package hackerRank.tree;

import java.util.ArrayList;

/**
 * print the level order traversal
 * https://www.hackerrank.com/challenges/tree-level-order-traversal
 * @author pramothinidk
 *
 */
public class LevlOrderTraversalBT {

    
    class Node {
       int data;
       Node left;
       Node right;
       }
   
   void LevelOrder(Node root)
    {
       ArrayList<Node> q = new ArrayList<Node>();
       if(root == null)
            return;
       q.add(root);
       while(q.size() >= 1){

           if(q.get(0) != null) {
               if(q.get(0).left != null ) q.add(q.get(0).left);
               if(q.get(0).right != null ) q.add(q.get(0).right);
            }
           System.out.print(q.get(0).data + " ");
           q.remove(0);
       }
    }
}
