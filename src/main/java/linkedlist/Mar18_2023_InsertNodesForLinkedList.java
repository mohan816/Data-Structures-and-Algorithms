package linkedlist;
import java.util.*;

public class Mar18_2023_InsertNodesForLinkedList {
	/*
	 * 1) If the user says n number then we need to create node data from 1 to n and we need to print it
	 */
	public static Node<Integer> insertNode() {
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt(), count = 0;
		Node<Integer> head = null, tail = null;
		while(data != -1) {
			count++;
			Node<Integer> n = new Node<>(data);
			if(head == null) {
				head = n;
				tail = n;
			}
			else {
				tail.next = n;
				tail = tail.next;
			}
			data = sc.nextInt();
		}
		return head;
	}
	
	//Delete a node in the linkedlist, Pos - > Node which can be deleted in the particular position, if the pos is greater or equal to length 
	//return the same head without any modification
	public static Node<Integer> deleteNode(Node<Integer> head, int pos){
		if(pos == 0 && head != null) {
			return head.next;
		}
		else {
			int count = 0;
			Node<Integer> prev = head;
			while(count < pos - 1 && prev != null) {
				count++;
				prev = prev.next;
			}
			if(prev != null && prev.next != null) {
				prev.next = prev.next.next;
			}
		}
		return head;
		  
	}
	
	public static void print(Node<Integer> head) {
		while(head != null) {
			System.out.print(head.data+" ");
			head = head.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		     Scanner sc = new Scanner(System.in);
             Node<Integer> head = insertNode();
             head = deleteNode(head, sc.nextInt());
             print(head);
	}

}
