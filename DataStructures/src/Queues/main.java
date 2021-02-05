package Queues;

public class main {

	public static void main(String[] args) {
		
		Queue q = new Queue();
		
		q.enQueue(10);
		q.enQueue(20);
		q.enQueue(30);
		q.enQueue(40);
		
		
		q.deQueue();
		q.deQueue();
		
		q.enQueue(5);
		q.enQueue(6);
		
		q.enQueue(13);
		q.enQueue(15);
		
		
		q.show();
		
		System.out.println("\nQueue is Empty:"+ q.isEmpty());
		System.out.println("Queue is Full: "+ q.isFull());
		System.out.println("\nSize:" + q.getSize());
	}

}
