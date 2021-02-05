package Queues;

public class Queue {
	
	int queue[] = new int[5];
	int size;
	int front;
	int rear;
	
	public void enQueue(int data) {
		
		if(!isFull()) {
			queue[rear] = data;
			rear = (rear + 1)%5;
			size = size + 1;
		}else
		{
			System.out.println("Queue is Full");
		}
		
	}
	public int deQueue() {
		
		int data = queue[front];

		if(!isEmpty()) {
			front = (front + 1)%5;
			size = size -1;
		}else {
			System.out.println("Queue is Empty");
		}		
		return data;
	}
	
	public int getSize() {
		return size;
		
	}
	
	public boolean isFull() {
		return  getSize() == 5;
	}
	
	public boolean isEmpty() {
		return getSize() == 0;
	}
	
	public void show(){
		System.out.print("Elements:");
		for(int i =0; i<size ; i++) {				//we are starting from 0 and ending with size
			System.out.print(queue[(front + i)%5]+ " ");// thus we front+i because we are shifting the front as well, i.e. we mist start from 1 as well in the loop 
		}
		System.out.println("\nElements in Queue: ");
		for(int n : queue) {
			System.out.print(n + " ");
		}
		
		
	}

}
