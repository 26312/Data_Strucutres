package LinkList;

public class LinkListDemo {
	
	Node head;// The first node will be refereed as Head Node
	
	//Method to insert values in the List
	 
	public void insert(int data) {
		
		//To insert data into node we need to create a node 
		Node node = new Node();
		
		// Mentioning two values for the node
		node.data = data;
		node.next = null; // By default the value will be null
		
		
		// by default 'head' is null. If the node is null it would specify that there are no nodes in the list
		// and this is the first node in the list
		if(head == null) { 
			head = node;
		}
		// However, if it is not the first object, we will create a Node and make it as head 
		else {
			
			Node n = head; 
			// This code is to check the NULL within the nodes of Link List
			// The moment we get Null the node gets constructed and value is fed into the node
			// The below code will make use of a virtual node and will traverse through all the nodes in the List to identify 
			// 'null' and create a new node
			while(n.next != null) {
				
				n = n.next;
			}
			n.next = node;
		}
	}

	
	// To insert elements in the start of the list
	public void insertAtStart(int data) {
		// To add values we need to create a node first
		// This means we also have to change the head location
		// Which also means we need to make sure that the new element has the address of the previous first node
		
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		node.next = head;
		head = node;
	}
	
	// To insert value anywhere in the link list 
	public void insertAt(int index, int data) {
		
		
		
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		if(index == 0) {
			insertAtStart(data);
		}
		else {
		// Whenever you want to add node in-between the list you have to traverse through the remaining nodes to reach the destination node
		
		Node n = head;
		//Objective is to push the address from old node to the newly created node which will refer to the next node in the list
		for(int i = 0; i<index-1; i++) {
			n = n.next;
		}
		node.next = n.next;
		n.next = node;
		}
	}
	
	public void deleteAt(int index) {
		
		if(index==0) {
			head = head.next;
		}else {
			Node n = head;
			Node n1 = null; // Creating a temporary node
			
			for(int i=0;i<index-1;i++) {
				
				n = n.next;
			}
			n1 = n.next;
			n.next = n1.next;
			//System.out.println("n1: " + n1.data);
			n1 = null;
		}
		
	}
	
	
	
	
	public void show() {
		// To print the values it will traverse through the nodes in the list
		
		Node node = head;
		while(node.next != null) {
			System.out.println(node.data);//Printing the data of the node
			node = node.next;// moving to the next node
		}	
		System.out.println(node.data); // since we are traversing until Null it would not print the last entered number
		// Hence the number is manually entered using the above code
	}	
}
