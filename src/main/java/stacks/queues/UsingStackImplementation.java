package stacks.queues;

public class UsingStackImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StackUsingArray stack = new StackUsingArray();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		System.out.println(stack.top());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.top());
		System.out.println(stack.size());
		System.out.println(stack.isEmpty());
		stack.push(60);
		System.out.println(stack.top());
	}

}
