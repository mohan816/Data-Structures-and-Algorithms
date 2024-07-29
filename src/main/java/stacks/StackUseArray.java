package stacks;

public class StackUseArray {

	public static void main(String[] args) throws StackEmptyException {
		// TODO Auto-generated method stub
		StackUsingArray stack = new StackUsingArray();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.print();
		System.out.println();
		System.out.println(stack.size());
		System.out.println(stack.top());
		stack.pop();
		stack.pop();
		System.out.println(stack.top());
		stack.pop();
		stack.pop();
		System.out.println(stack.isEmpty());
		System.out.println(stack.top());
		

	}

}
