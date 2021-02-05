package DynamicStack;

public class main {

	public static void main(String[] args) {
		
		DStack st = new DStack();
		
		st.push(5);
		st.display();
		System.out.println("");
        st.push(10);
        st.display();
        System.out.println("");
        st.push(20);
        st.display();
        System.out.println("");
        st.push(30);
        st.display();
        System.out.println("");
        st.push(40);
        st.display();
        System.out.println("");
        st.push(50);
        st.display();
        
        st.pop();
        st.display();
        System.out.println("");
        st.pop();
        st.display();
        System.out.println("");
        st.pop();
        st.display();
        System.out.println("");
        st.pop();
        st.display();
        System.out.println("");
    
	}

}
