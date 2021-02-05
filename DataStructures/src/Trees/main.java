package Trees;

public class main {

	public static void main(String[] args) {
		
		BinaryTree bt = new BinaryTree();

		
		bt.addNode(50, "Boss");
		bt.addNode(25, "Vice Pres");
		bt.addNode(15,"Office Manager");
		bt.addNode(30, "Secretary");
		bt.addNode(75, "Sales Manager");
		bt.addNode(85, "Salesman 1");
	
		bt.postOrderTraverse(bt.root);	
		
		System.out.println("Search for 15:");
		
		System.out.println(bt.findNode(15));
		
	}

}
