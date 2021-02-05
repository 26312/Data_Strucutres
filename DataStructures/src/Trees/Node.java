package Trees;

public class Node {

	int key;
	String name;
	
	Node leftChild;
	Node rigthChild;
	
	Node(int key, String name){
		
		this.key = key;
		this.name = name;
	
			
	}

	@Override
	public String toString() {
		return name + " has a key " + key;
	}
	
	
	
}
