/**
 * Program to find the Kth to the last element in a singly linked list
 * @author pramothinidk
 *
 */
public class FindKthToLastElementInALinkedList {
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
		
		public void printKtoLast(int k){
			Node head = this;
			Node cur = this;
			for(int i=1 ; i<= k;i++){
				if(cur.next == null && i!=k){
					System.out.println(" Oops the total size is less than k !");
					return;
				}
				cur = cur.next;
			}
			
			while (cur != null){
				cur = cur.next;
				head = head.next;
			}
			
			while(head != null){
				System.out.print(head.data +" ---> ");
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
			System.out.println("Input ");
			n.printNodes();
			System.out.println();
			n.printKtoLast(3);
		}
		
		
	}
}
