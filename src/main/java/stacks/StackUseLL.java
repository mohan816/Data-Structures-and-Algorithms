package stacks;

public class StackUseLL {

	public static void main(String[] args) throws StackEmptyException {
		// TODO Auto-generated method stub
		
		StackUsingLL<Integer> stack = new StackUsingLL<>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.print();
		stack.pop();
		stack.pop();
		stack.pop();
		System.out.println();
		System.out.println(stack.size());
		System.out.println(stack.isEmpty());
		stack.pop();
		
		
		

	}

}
