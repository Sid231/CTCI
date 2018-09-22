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
		
		Node start = head;
		start = start.next.next.next.next;
		
		System.out.println("delete"+start.val);
		deleteElementRandomly(start);
		
		while(head.next != null){
			System.out.println(head.val);
			head = head.next;
		}
		System.out.println(head.val);
	}

	private static boolean deleteElementRandomly(Node node) {
		if(node == null || node.next == null) return false;
		node.val = node.next.val;
		node.next = node.next.next;
		return true;
	}
}
