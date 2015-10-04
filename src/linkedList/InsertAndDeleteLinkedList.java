package linkedList;


/**
 * program to insert to the tail and return the head of the list
 * program to insert to the nth position of the linked list
 * delete a node at a particular position in the linked list 
 * @author pramothinidk
 *
 */
public class InsertAndDeleteLinkedList {
	static class Node{
		Node next;
		int data;

		Node(int data){
			this.data = data;
		}

		Node(){

		}
	
	
	/*
	  Insert Node at the end of a linked list 
	  head pointer input could be NULL as well for empty list
	  Node is defined as 
	  class Node {
	     int data;
	     Node next;
	  }
	*/
	static Node Insert(Node head,int data) {
	    Node tmp = head;
	    if(head == null){
	        head.data = data;
	        return head;
	    }
	    while(tmp.next!=null)
	        tmp = tmp.next;
	    tmp.next = new Node();
	    tmp.next.data = data;
	    return head;
	}
	  
	
	
	public void printNodes(){
		Node head = this;
		while(head!=null){
			System.out.print(head.data +" ---> ");
			head = head.next;
		}
	}
	
	
	/**
	 * Insert a node at a specific position in a linked list
	 * @param head
	 * @param data
	 * @param position
	 * @return
	 */
	static Node InsertNth(Node head, int data, int position) {
	    Node tmp = head;
	    Node newnode = new Node();
	    newnode.data = data;
	    if(position == 0){
	        newnode.next = tmp;
	        return newnode;
	    }
	    for(int i=1; i<position; i++)
	        tmp = tmp.next;
	    
	    newnode.next = tmp.next;
	    tmp.next = newnode;
	    return head;    

	}
	
	static Node Delete(Node head, int position) {
	    if(position == 0)
	        return head.next;
	    Node tmp = head;
	    for(int i=1 ; i<position ; i++)
	        tmp = tmp.next;
	    tmp.next = tmp.next.next;
	    return head;
	    
	}
	
	public static void main(String args[]){
		Node testTail = new Node(2);
		testTail.next = new Node(4);
		testTail.next.next = new Node(5);
		System.out.println("\nInserting in tail and returning the head");
		Insert(testTail, 3).printNodes();
		
		
		Node testTail2 = new Node(2);
		testTail2.next = new Node(4);
		testTail2.next.next = new Node(5);
		//testTail.printNodes();
		System.out.println("\nInserting in 0th position");
		testTail2 = InsertNth(testTail2, 3 , 0);
		System.out.println("Inserting in 1st position");
		InsertNth(testTail2, 10 , 1).printNodes();
		
		System.out.println("\n Deleting in 0 th position");
		Delete(testTail2,0).printNodes();
		
		System.out.println("\n Deleting in 3rd position");
		Delete(testTail2,3).printNodes();

		
		
	}
	}
}
