package Stack;

public class Runner {
	
	public static void main(String[] args) {
		
		StackII st = new StackII();
//		
//		System.out.println("Stack Empty: " + st.isEmpty());
//		
//		st.push(10);
//		st.push(20);
//		st.push(30);
//		st.push(40);
//		st.push(50);
//		st.display();
//		
//		System.out.println("\nPop:" + st.pop());
//		System.out.println("Stack After Pop");
//		
//		st.display();
//		
//		System.out.println("\nPeek: " + st.peek());
//		System.out.println("Size:" + st.size());
//		
//		System.out.println("\nPop 2:" + st.pop());
//		System.out.println("\nNew Size: " + st.size());
//		
//		System.out.println("Stack Empty: " + st.isEmpty());
//		
//		st.display();
		
		st.push(5);
		st.push(15);
		st.push(25);
		st.push(35);
		st.push(45);
		st.push(55);
		st.display();
		System.out.println("");
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		st.display();
	}
	
	

}
