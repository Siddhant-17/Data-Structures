
public class CircularQueue {

	int data[];
	int front ,rear;
	int size;                                                     
	public CircularQueue(int size) {
		data = new int [size];
		front = -1;
		rear = -1;
		size=size;
	}

	public int[] getData() {
		return data;
	}

	public void setData(int[] data) {
		this.data = data;
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
	
	
	public boolean isEmpty()
	{
		if(rear==-1)
		return true;
		return false;
		
	}
	
	public boolean isFull()
	{
		if(rear==data.length-1 && front==0 || front==rear+1)
		return true;
		return false;
		
	}
	public void enque(int value)
	{
		if(isFull())
		{
			System.out.println("Queue is full");
			return;
		}
		if(rear==-1)
		
			front=0;
		
		data[++rear%size]=value;
	}
	public int deque()
	{
		if(isEmpty())
		{
			System.out.println("Queue is empty");
			return -1;
		}
		int v=data[front++%size];
		if(front==rear+1)
			rear=front=-1;
		return v;
		
	}
	public void Display()
	{
		if(isEmpty())
		{
			System.out.println("Queue is empty");
			return ;
		}
		for(int i=front;i<=rear;i++)
		{
			System.out.println("\t"+data[i%data.length]);
		}
	}
	
	
}
