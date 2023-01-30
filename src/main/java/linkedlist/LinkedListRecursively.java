package linkedlist;

import java.util.Scanner;

public class LinkedListRecursively {
	
	public static Node<Integer> insertNodeSingleLinkedList(){
		Scanner sn = new Scanner(System.in);
		Node<Integer> head = null;
		int a = sn.nextInt();
		Node<Integer>temp = null;
		while(a != -1) {
			if(head == null) {
				Node<Integer> n1 = new Node<Integer>(a);
				head = n1;
				temp = n1;
			}
			else {
				a = sn.nextInt();
				if(a != -1) {
					Node<Integer> n1 = new Node<Integer>(a);
					temp.next = n1;
					temp = temp.next;
				}
				
			}
		}
		return head;
	}
	
	public static void printRecursively(Node<Integer> head) {
		//if head is null terminate 
		if(head == null)
		      return;
		System.out.print(head.data+" ");
		//passing the next node address
		printRecursively(head.next);
		//after the termination it will print the node from last
		//System.out.print(head.data+" ");
	}
	
	public static Node<Integer> insertNodeRecursively(Node<Integer> head, int ele, int pos){
		if(head.next == null && pos > 0)
		     return head;
		//Exit criteria
		if(pos == 0) {
			Node<Integer> newNode = new Node<Integer>(ele);
			newNode.next = head;
			return newNode;	
		}
		//Induction hypothesis
		Node<Integer> head1 = insertNodeRecursively(head.next, ele, pos-1);
		//small calculation
		head.next = head1;
		return head;
	}
	
	public static Node<Integer> deleteNodeRecursively(Node<Integer> head, int pos){
		if(head.next == null && pos > 0)
		     return head;
		if(pos == 0)
			return head.next;
		Node<Integer> head1 = deleteNodeRecursively(head.next, pos-1);
		head.next = head1;
		return head;
	}
	public static Node<Integer> reverseLinkedList(Node<Integer> head){
		if(head == null || head.next == null)
			return head;
		Node<Integer> head1 = reverseLinkedList(head.next);
		Node<Integer> tail = head1;
		while(tail.next != null) {
			tail = tail.next;
		}
		tail.next = head;
		head.next = null;
		return head1;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = insertNodeSingleLinkedList();
		//head = insertNodeRecursively(head, 60, 4);
		//head = deleteNodeRecursively(head, 4);
		Node<Integer> head1 = reverseLinkedList(head);
		printRecursively(head1);

	}

}
