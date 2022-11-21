package linkedlist;

import java.util.Scanner;

public class DoublyLinkedListImplementation {
	
	static NodeDouble<Integer> head = null;
	static NodeDouble<Integer> tail = null;
	static int length = 0;
	
	public static NodeDouble<Integer> insertNodeDoublyLinkedList(){
		Scanner sn = new Scanner(System.in);
		int a = sn.nextInt();
		while(a != -1) {
			if(head == null) {
				NodeDouble<Integer> n1 = new NodeDouble<Integer>(a);
				head = n1;
				tail = n1;
				tail.prev = null;
				length++;
			}
			else {
				a = sn.nextInt();
				if(a != -1) {
					NodeDouble<Integer> n1 = new NodeDouble<Integer>(a);
					NodeDouble<Integer> temp = tail;
					tail.next = n1;
					tail = tail.next;
					tail.prev = temp;
					length++;
				}
				
			}
		}
		return head;
	}
	
	public static void print() {
		System.out.println("Printing from tail");
		while(tail != null) {
			System.out.print(tail.data +" ");
			tail = tail.prev;
		}
		System.out.println();
		System.out.println("Printing from head");
		while(head != null) {
			System.out.print(head.data +" ");
			head = head.next;
		}
		System.out.println();
	}
	
	public static NodeDouble<Integer> removeAll(NodeDouble<Integer> head){
		     head = null;
		     return head;
		
	}
	public static NodeDouble<Integer> addAll(int[] arr){
		if(head == null) {
			for(int i = 0; i < arr.length; i++) {
				NodeDouble<Integer> node = new NodeDouble<>(arr[i]);
				if(head == null) {
					head = node;
					tail = node;
					tail.prev = null;
				}
				else {
					NodeDouble<Integer> temp = tail;
					tail.next = node;
					tail = tail.next;
					tail.prev = temp;
					
				}
				
			}
			return head;
		}
		else {
			for(int i = 0; i < arr.length; i++) {
				NodeDouble<Integer> node = new NodeDouble<>(arr[i]);
				NodeDouble<Integer> temp = tail;
				tail.next = node;
				tail = tail.next;
				tail.prev = temp;
			}	
		}
		return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		insertNodeDoublyLinkedList();
	   // print();
		head = removeAll(head);
		//print();
		int arr[] = {1, 2, 3, 4, 5};
		addAll(arr);
		print();
		

	}

}
