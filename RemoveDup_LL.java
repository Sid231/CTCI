import java.util.*;

public class RemoveDup {
	
	public static void main(String s[]){
		Node head = new Node(0);
		Node newNode = head;
		
		//ADD ELEMENTS IN RANDOM ORDER
		newNode.val = 5;
		newNode.next = new Node(10);
		newNode = newNode.next;
		newNode.next = new Node(1);
		newNode = newNode.next;
		newNode.next = new Node(2);
		newNode = newNode.next;
		newNode.next = new Node(3);
		newNode = newNode.next;
		newNode.next = new Node(2);
		newNode = newNode.next;
		newNode.next = new Node(5);
		newNode = newNode.next;
		newNode.next = new Node(6);
		newNode = newNode.next;
		newNode.next = new Node(2);
		newNode = newNode.next;
		newNode.next = new Node(5);
		newNode = newNode.next;
		newNode.next = new Node(1);
		newNode = newNode.next;
		newNode.next = new Node(01);
		newNode = newNode.next;
		newNode.next = new Node(0);
		newNode = newNode.next;
		newNode.next = new Node(1);
		newNode = newNode.next;
		newNode.next = null;
		
		removeDuplicatesB(head);
		
		while(head.next != null){
			System.out.println(head.val);
			head = head.next;
		}
		
	}

	private static void removeDuplicatesA(Node head) {
		Node start = head;
		while(start.next != null){
			Node temp = start;
			while(temp.next!=null && temp.next.next != null){
				if(temp.next.val == start.val){
					temp.next = temp.next.next;
					continue;
				}
				temp = temp.next;
			}
			if(temp.next.val == start.val){
				temp.next = null;
			}
			start = start.next;
		}
	}
	
	private static void removeDuplicatesB(Node head) {
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(head.val);
		Node start = head;
		while(start.next != null){
			if(!hs.contains(start.next.val)){
				hs.add(start.next.val);
			}else{
				start.next = start.next.next;
				continue;
			}
			start = start.next;
		}
	}
}
