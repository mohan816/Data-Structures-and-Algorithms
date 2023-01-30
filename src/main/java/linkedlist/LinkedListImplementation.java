package linkedlist;

import java.util.Scanner;

public class LinkedListImplementation {
	
	static Node<Integer> head = null;
	static int length = 0;
	static Node<Integer>temp = null;
	
	public static Node<Integer> insertNodeSingleLinkedList(){
		Scanner sn = new Scanner(System.in);
		int a = sn.nextInt();
		temp = null;
		while(a != -1) {
			if(head == null) {
				Node<Integer> n1 = new Node<Integer>(a);
				head = n1;
				temp = n1;
				length++;
			}
			else {
				a = sn.nextInt();
				if(a != -1) {
					Node<Integer> n1 = new Node<Integer>(a);
					temp.next = n1;
					temp = temp.next;
					length++;
				}
				
			}
		}
		return head;
		
		/*
		 * Node<Integer> n1 = new Node<Integer>(10); Node<Integer> n2 = new
		 * Node<Integer>(20); Node<Integer> n3 = new Node<Integer>(30); Node<Integer> n4
		 * = new Node<Integer>(20); head = n1; n1.next = n2; n2.next = n3; n3.next = n4;
		 * return head;
		 */	
	}
	
	public static Node<Integer> remove(int index){
		if(index > length)
			return null;
		int i = 0;
		if(index == 0) {
			return head = head.next;
		}
		Node<Integer> temp = head;
		while(i <= index - 1) {
			if(i == index - 1)
				temp.next = temp.next.next;
			temp = temp.next;
			i++;
		}
		return head;
	}
	
	public static Node<Integer> removeValue(int val) {
		if(head.data == val) {
			return head = head.next;
		}
		Node<Integer> temp = head;
		while(temp.next != null) {
			if(temp.next.data == val)
				temp.next = temp.next.next;
			temp = temp.next;
		}
		return head;
		
	}
	
	public static Node<Integer> setValue(int index, int val){
		if(index > length) {
			return head;
		}
		Node<Integer> temp = head;
		int i = 0;
		while(temp != null) {
			if(i == index) {
				temp.data = val;
				return head;
			}
			i++;
			temp = temp.next;
		}
		return head;
	}
	
	public static int getIndex(int index) {
		if(index > length)
			return -1;
		Node<Integer> temp = head;
		int i = 0;
		while(temp != null) {
			if(i == index) {
				return temp.data;
			}
			i++;
			temp = temp.next;
		}
		return -1;
		}
	public  static int indexOf(int data) {
		//int data = head.data;
		if(data == 0) {
			return -1;
		}
		int i = 0;
		Node<Integer> temp = head;
		while(temp != null && temp.data != data) {
			temp = temp.next;
			i++;
		}
		return i;
	}
	
	public  static int lastIndexOf(int data) {
		//int data = head.data;
		int i = 0, count = -1;
		Node<Integer> temp = head;
		while(temp != null) {
			if(temp.data == data) {
				count = i;
			}
			temp = temp.next;
			i++;
		}
		return count;
	}
	
	public static Node<Integer> removeFirst(Node<Integer> head) {
		    head = head.next;
		    return head;
	}
	
	public static Node<Integer> removeLast(Node<Integer> head) {
	    Node<Integer> temp = head;
	    while(temp.next.next != null)
	    	temp = temp.next;
	    if(temp.next.next == null) {
	    	temp.next = null;
	    }
	    return head;
}
	public static Node<Integer> addFirst(int data){
		Node<Integer> n1 = new Node<Integer>(data);
		n1.next = head;
		head = n1;
		return head;	
	}
	
	public static void print(Node<Integer> head) {
		while(head != null) {
			System.out.print(head.data+" ");
			head = head.next;
		}
	}
	
	public static Node<Integer> removeAll(Node<Integer> head) {
		    head = null;
		    return head;
	}
	
	public static Node<Integer> addAll(int[] arr){
		if(head == null) {
		Node<Integer> head = null, tail = null;
			for(int i = 0; i < arr.length; i++) {
				Node<Integer> node = new Node<Integer>(arr[i]);
				if(head == null) {
					head = node;
					tail = node;
			}
				else {
					tail.next = node;
					tail = tail.next;
				}
		}
			return head;
		}
		else {
			for(int i = 0; i < arr.length; i++) {
				Node<Integer> node = new Node<Integer>(arr[i]);
					temp.next = node;
					temp = temp.next;
				}
		}
		return head;
	}

	public static void main(String[] args) {
		insertNodeSingleLinkedList();
		/*
		//set value based on index
		 System.out.println("Setting the value in the given index");
		print(setValue(2, 1000));
		
		// remove based on index
		System.out.println("removing the value in particular index");
	      print(remove(8));
		//remove based on data
	    System.out.println("Removeing the value based on value");
		print(removeValue(30));
		
		
		 // get Index
		int index = 3;
		int data = getIndex(index);
		System.out.println("Index of " + index +" is " + data);
		 
		
		//firstIndexOfElement
		int firstIndex = indexOf(20);
		 System.out.println("First Index of 20 is " +firstIndex); 
		 
		 //lastIndexOfElement
		 int lastIndex = lastIndexOf(20); 
		 System.out.println("Last Index of 20 is " +lastIndex);
		 
		//remove First
		 System.out.println("Removing the first node");
		 print(removeFirst(head)); 
		 
		//remove Last
		 System.out.println("Removing the last node");
		 print(removeLast(head));
		 
		//Add First
		System.out.println("Added the data in first position");
		print(addFirst(40));
		
		//removeAll
		System.out.println("Removed all the nodes");
		print(removeAll(head));
		*/
		//addAll
		System.out.println("Adding the entire array");
		int[] arr = {10, 20 ,30 ,40,50};
		print(addAll(arr));
		System.out.println();
		System.out.println("Removed all the nodes");
		print(removeAll(head));
		
		
		
		

	}

}
