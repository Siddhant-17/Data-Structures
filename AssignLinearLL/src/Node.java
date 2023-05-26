
public class Node {
	private int data;
	private Node Next;
	
	public Node()
	{
		data=0;
		Next=null;
	}
	
	public Node(int data)
	{
		this.data=data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return Next;
	}

	public void setNext(Node next) {
		this.Next = next;
	}
	

}
