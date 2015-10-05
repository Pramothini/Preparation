package linkedList;

/**
 * You’re given the pointer to the head nodes of two linked lists that merge together at some node. 
 * Find the node at which this merger happens.
 * @author pramothinidk
 *
 */
public class MergePointOfTwoLinkedLists {
/**
 * 1. Traverse the first linked list(count the elements) and make a circular linked list. (Remember last node so that we can break the circle later on).
   2. Now view the problem as find the loop in the second linked list. So the problem is solved.
   3. Since we already know the length of the loop(size of first linked list) we can traverse those many number of nodes in second list, and then start another pointer from the beginning of second list. we have to traverse until they are equal, and that is the required intersection point.
   4. remove the circle from the linked list. (did not remove the circle in this code)
 */
	int FindMergeNode(Node headA, Node headB) {
	    Node tmp = headA;
	    int sizeOfA = 1;
	    while(tmp.next != null){
	        sizeOfA++;
	        tmp = tmp.next;
	    }
	    tmp.next = headA;
	    
	    Node firstB  = headB;
	    Node secondB  = headB;
	    
	    for(int i=1; i<=sizeOfA ; i++){
	        firstB = firstB.next;
	    }
	    
	    while(secondB != firstB){
	        firstB = firstB.next;
	        secondB = secondB.next;
	    }

	    
	    return firstB.data;
	    

	}
}
