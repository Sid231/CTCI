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
		
		kthFromLastIteratve(head,5);
		
		/*
		while(head.next != null){
			System.out.println(head.val);
			head = head.next;
		}
		*/
		
	}

	private static int kthFromLastRecursive(Node head, int k) {
		if(head == null){
			return 0;
		}
		int val = kthFromLastRecursive(head.next,k)+1;
		if(val == k){
			System.out.println("kth from last is"+val);
		}
		return val;
	}
	
	private static int kthFromLastIteratve(Node head, int k) {
		int count = 0;
		Node headNext = head;
		while(count != k){
			headNext = headNext.next;
			count++;
		}
		while(headNext != null){
			headNext = headNext.next;
			head = head.next;
		}
		System.out.println("kth from last is"+head.val);
		return head.val;
	}
}
