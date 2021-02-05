package Stack;

public class Stack {
	
	int stack[] = new int[5];
	int top = 0;
	
	public int push(int data) {
		
		stack[top] = data;
		top++;
		return data;
	}
	
	public int pop() {
		int data;// declaring a temporary Variable to take the popped value from stack
		top--; // remove the value from stack
		data= stack[top]; // assign the removed value from stack to data
		stack[top] = 0; // assign value to 0 from where the value is popped
		return data; // return the popped value
	}

	public int peek() {
		int data;
		data = stack[top-1];
		return data;
		
	}
	public void display() {
		for(int n: stack) {
			System.out.print(n + " ");
		}
	}
}
