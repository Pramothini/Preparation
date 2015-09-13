import java.util.HashSet;
import java.util.Set;

/**
 * Program to remove duplicates from a sorted and unsorted linked list
 * @author pramothinidk
 *
 */

public class linkedListRemoveDuplicates {
	static class Node{
		Node next;
		int data;
		
		Node(int data){
			this.data = data;
		}
		
		public void insert(int data){
			Node node = new Node(data);
			Node head = this;
			while(head.next!=null){
				head = head.next;
			}
			head.next = node;
		}
		
		public void printNodes(){
			Node head = this;
			while(head!=null){
				System.out.print(head.data +" ---> ");
				head = head.next;
			}
		}
		
		public void removeDuplicatesFromUnsortedList(){
			Set<Integer> s = new HashSet<Integer>();
			Node head = this;
			while(head!=null){
				s.add(head.data);
				while(head.next != null && s.contains(head.next.data)){
					head.next = head.next.next;
				}
				head = head.next;
			}
		}
		
		public void removeDuplicatesFromUnsortedListUsingPrev(){
			Set<Integer> s = new HashSet<Integer>();
			Node cur = this;
			Node prev = null;
			while(cur!=null){
				if(s.contains(cur.data)){
					prev.next = cur.next;
				}
				s.add(cur.data);
				prev = cur;
				cur = cur.next;
			}
		}
		
		public void removeDuplicatesFromSortedList(){
			Node head = this;
			while(head != null){
				while(head.next!=null && head.next.data == head.data){
					head.next = head.next.next;
				}
			head = head.next;
			}
		}
		
		public static void main(String args[]){
			Node n = new Node(1);
			n.insert(2);
			n.insert(3);
			n.insert(2);
			n.insert(7);
			n.insert(7);
			System.out.println("Unsorted Input ");
			n.printNodes();
			n.removeDuplicatesFromUnsortedListUsingPrev();
			System.out.println("\nAfter removing duplicates ");
			n.printNodes();
			
			
			Node test = new Node(2);
			test.insert(2);
			test.insert(2);
			test.insert(2);
			test.insert(3);
			test.insert(8);
			System.out.println("\nSorted Input");
			test.printNodes();
			test.removeDuplicatesFromSortedList();
			System.out.println("\nAfter removing duplicates ");
			test.printNodes();
			
			
		}
	}
	
	
	
	
	

}
