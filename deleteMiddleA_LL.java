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
		
		deleteMiddleA(head);
		
		while(head.next != null){
			System.out.println(head.val);
			head = head.next;
		}
		System.out.println(head.val);
	}

	private static void deleteMiddleA(Node head) {
		Node first = head;
		Node second = head;
		int flag = 0;
		while(first.next!=null && first.next.next!=null){
			first = first.next.next;
			if(flag == 0){
				flag = 1;
				continue;
			}
			second = second.next;
		}
		second.next = second.next.next;
	}
}
