package LinkList;

public class Runner {
	
	public static void main(String[] args) {
		
		LinkListDemo list = new LinkListDemo();
		
		list.insert(10);
		list.insert(11);
		list.insert(12);
		list.insert(13);
		list.insertAtStart(25);
		list.insertAt(2, 55);
		list.insertAt(0, 99);
		list.deleteAt(2);
		
		
	
		list.show();
	}
	

}
