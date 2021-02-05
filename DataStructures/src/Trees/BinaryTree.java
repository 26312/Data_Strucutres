package Trees;

public class BinaryTree {
	
	Node root;
	
	public void addNode(int key, String name) {
		
		Node newNode = new Node(key,name);
		
		if(root == null) {
			
			root = newNode; 
		
		}else {
			
			Node focusNode = root;
			
			Node parent;
			
			while(true) {
				
				parent = focusNode;
				
				if(key < focusNode.key){ // The left child needs to have key value less than it's parent
					
					focusNode = focusNode.leftChild;
					
					if(focusNode == null) { // Incase the left child has no children
						
						parent.leftChild = newNode;
						return;
						
					}
				}else 
				{
					focusNode = focusNode.rigthChild;
					
					if(focusNode == null) {
						
						parent.rigthChild = newNode;
						return;
					}
				}
				
			}
		}
	}// End of addNode method()
	
			public void inOrderTraverse(Node focusNode) {
		
					if(focusNode != null) {
						
						inOrderTraverse(focusNode.leftChild);
						System.out.println(focusNode);
						inOrderTraverse(focusNode.rigthChild);
					}
			} // End of inOrderTraverse
	
			public void preOrderTraverse(Node focusNode) {
		
				if(focusNode != null) {
			
					System.out.println(focusNode);
			
					preOrderTraverse(focusNode.leftChild);
			
					preOrderTraverse(focusNode.rigthChild);
				}
			}// End of preOrderTraverse
			
			public void postOrderTraverse(Node focusNode) {
	
				if(focusNode != null) {
		
					postOrderTraverse(focusNode.leftChild);
		
					postOrderTraverse(focusNode.rigthChild);
		
					System.out.println(focusNode);
				}
			} // End of postOrderTraverse
	
			public Node findNode(int key) {
				
				Node focusNode = root;
				
				while(focusNode.key != key) { // While we have not found the node, we will keep looking
					// So first we need to check of the key is less than current focusnode
					
					if(key < focusNode.key ) {
						focusNode = focusNode.leftChild;
					}
					else {
						
						focusNode = focusNode.rigthChild;
					}
					
					if(focusNode == null) {
						return null;
					}			
				}
				return focusNode;
			}// End of FindNode
			
}
