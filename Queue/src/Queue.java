
public class Queue {

	int data[];
	int front,rear;
	
	public Queue(int size)
	{
		data =new int[size];
		this.data=data;
		front=rear=-1;
	}
	
	public int getFront() {
		return front;
	}

	public void setFront(int front) {
		this.front = front;
	}

	public int getRear() {
		return rear;
	}

	public void setRear(int rear) {
		this.rear = rear;
	}

	public void enque(int value) {
		if(isFull())
		{
			System.out.println("queue is full");
			return;
		}
		if(rear==-1)
		{
			front=0;
			
		}
		data [++rear]=value;
		
		
	}
	public int deque()
	{
		if(isEmpty())
		{
			System.out.println("Queue is Empty");
			return -1;
		}
		int v=data[front++];
		if(front==rear+1)
			rear=front=-1;
		return v; 
	}
	public int peak()
	{
		if(isEmpty())
		{
			System.out.println("queue is empty");
			return -1;
		}
		return data[front];
	}
	public boolean isFull()
	{
		if(rear == data.length-1)
		return true;
		return false;
	}
	public boolean isEmpty()
	{
		if(rear==-1)
		return true;
		return false;
	}
	public void display()
	{
		if(isEmpty())
		{
			System.out.println("queue is empty");
			return;
		}
		for(int i=front;i<=rear;i++)
		{
			System.out.println("\t"+data[i]);
		}
		
	}


	
	
	
	
	
	
	
}
