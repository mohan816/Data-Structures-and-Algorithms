package stacks;

import java.util.NoSuchElementException;

public class StackUsingArray {
	
	private int[] data;
	private int index = -1;
	
	public StackUsingArray(){
		data = new int[5];
	}
	
	public void push(int ele) {
		if(index == data.length - 1)
			throw new NoSuchElementException();
		data[index + 1] = ele;
		index++;	
	}
	
	public int pop() {
		int pop = data[index];
		index--;
		return pop;
	}
	
	public int top() {
		if(index == -1) {
			System.out.println("Stack is Empty "+this.isEmpty());
			return -1;
		}
		else {
		return data[index];
		}
	}
	
	public int size() {
		return index + 1;
	}
	
	public boolean isEmpty() {
		if(index == -1)
			return true;
		return false;
	}
	
	public void print() {
		for(int i = index; i >= 0; i--)
			System.out.print(data[i]+" ");
	}
	

}
