package stacks;

public class StackUsingArray {
	
	private int[] data;
	int top;
	
	public StackUsingArray() {
		data = new int[1];
		top = -1;
	}
	
	//O(1)
	//if top == data.length - 1, which means data array is filled, if we
	//want to insert an element then we need to double the size of the data array
	public void push(int ele) {
		if(top == data.length - 1) {
			doubleCapacity();
		}
		data[++top] = ele;
	}
	
	//O(n)
	private void doubleCapacity() {
		int[] temp = data;
		data = new int[2 * temp.length];
		for(int i = 0; i < temp.length; i++) {
			data[i] = temp[i];
		}
	}
	
	//O(1)
	public int size() {
		return top + 1;
	}
	
	//O(1)
	public boolean isEmpty() {
		return top == -1;
	}
	
	//O(1)
	public int pop() throws StackEmptyException {
		if(top == -1) {
			throw new StackEmptyException();
		}
		return data[top--];
	}
	
	//O(1)
	public int top() throws StackEmptyException {
		if(top == -1) {
			throw new StackEmptyException();
		}
		return data[top];
	}
	
	//O(n)
	public void print() {
		for(int i = 0; i <= top; i++) {
			System.out.print(data[i]+" ");
		}
	}
	

}
