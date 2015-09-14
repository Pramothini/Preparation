package linkedList;

/**
 * Program to reverse a linked list
 * @author pramothinidk
 *
 */
public class ReverseALinkedList {

	public Node reverse(Node head){
		if(head == null || head.next == null)
			return head;
		Node second = head.next;
		Node third = second.next;
		Node prev = null;
		Node cur;

		second.next = head;
		head.next = null;
		cur = third;
		prev = second;

		while(cur != null){
			Node temp = cur.next;
			cur.next = prev;
			prev = cur;
			cur = temp;
		}

		return prev;
	}

	public void printNodes(Node head){
		while(head!=null){
			System.out.print(head.data +" ---> ");
			head = head.next;
		}
	}

	public void insert(int data,Node head){
		Node node = new Node(data);
		while(head.next!=null){
			head = head.next;
		}
		head.next = node;
	}

	public static void main(String args[]){
		ReverseALinkedList rll = new ReverseALinkedList();
		Node n = new Node(1);
		rll.insert(2,n);
		rll.insert(3,n);
		rll.insert(2,n);
		rll.insert(7,n);
		rll.insert(7,n);
		System.out.println("Input ");
		rll.printNodes(n);
		System.out.println("Reversed linked list");
		rll.printNodes(rll.reverse(n));
	}
}

class Node{
	Node next;
	int data;

	Node(int data){
		this.data = data;
	}
}
