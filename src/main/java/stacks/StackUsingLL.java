package stacks;

public class StackUsingLL<T> {
	 
	private Node<T> head;
	private int size;
	
	public StackUsingLL() {
		head = null;
		size = 0;
	}
	
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void push(T ele) {
	    Node<T> node = new Node<>(ele);
	    node.next = head;
	    head = node;
	    size++;
		
	}
	
	public T top() throws StackEmptyException {
		if(head == null)
			throw new StackEmptyException();
		return head.data;
	}
	
	public T pop() throws StackEmptyException {
		if(head == null)
			throw new StackEmptyException();
		T data = head.data;
		head = head.next;
		size--;
		return data;
		
	}
	
	public void print() {
		Node<T> temp = head;
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}


}
