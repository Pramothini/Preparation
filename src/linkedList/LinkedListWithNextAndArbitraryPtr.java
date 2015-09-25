package linkedList;

public class LinkedListWithNextAndArbitraryPtr {
	public void insert(int data,NodeWith2Ptrs head){
		NodeWith2Ptrs node = new NodeWith2Ptrs(data);
		while(head.next!=null){
			head = head.next;
		}
		head.next = node;
	}
	
	public void printNodes(NodeWith2Ptrs head){
		NodeWith2Ptrs temp = head;
		while(head!=null){
			System.out.println("next "+head.data +" ---> ");
			System.out.println("arbitrary "+head.arbitrary +" ---> ");
			head = head.next;
		}
	}
	
	public static void main(String args){
		
	}

}
class NodeWith2Ptrs{
	NodeWith2Ptrs next;
	NodeWith2Ptrs arbitrary;
	int data;

	NodeWith2Ptrs(int data){
		this.data = data;
	}
}