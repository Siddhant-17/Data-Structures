
public class DoublyLinear {

	 
	Node head;
	Node tail;
	
	
	public DoublyLinear() {
		this.head=null;
		this.tail=null;
	}


	public Node getHead() {
		return head;
	}


	public void setHead(Node head) {
		this.head = head;
	}


	public Node getTail() {
		return tail;
	}


	public void setTail(Node tail) {
		this.tail = tail;
	}
	
	
	public boolean InsertatBeg(int value)
	{
		
		Node Newnode = new Node(value);
		
		if(Newnode==null)
		{
			return false;
		}
		
		if(head==null)
		{
			head=tail=Newnode;
			return true;
		}
		
			 
			Newnode.setNext(head);
			head.setPre(Newnode);
			head=Newnode;
			return true;
		
	}
	


	public boolean InsertatLast(int value) {
		Node Newnode =new Node(value);
		if(Newnode == null)
		{
			return false; 
		}
		if(head==null)
		{
			head=tail=Newnode;
		}
			tail.setNext(Newnode);
			Newnode.setPre(tail);
			tail=Newnode;
		return true ;
	}


	public boolean Inseratpos(int value, int pos) {
		
		if(pos<=0)
		{
			return false;
		}
		if(pos==1)
		{
			InsertatBeg(value);
		}
		Node Newnode=new Node(value);
		if(Newnode==null)
		{
			return false;
		}
		int i=1;
		Node temp=head;
		while(i<pos-1)
		{
			i++;
			temp=temp.getNext();
			if(temp==null)
			{
				System.out.println("Invalid pos");
			}
		}
		if(temp.getNext()==null)
		{
			temp.setNext(Newnode);
			 Newnode.setPre(temp);
			 tail=Newnode;
		}
			Newnode.setPre(temp);
			Newnode.setNext(temp.getNext());
			temp.setNext(Newnode);
			Newnode.getNext().setPre(Newnode);
		
		return true;
	}
	
	public boolean DeleteatBeg()
	{
		if(head==null)
		{
			return false;
		}
		Node temp=head;
		head=temp.getNext();
		head.setPre(null);
		temp.setNext(null);
		
		return true;
	
	}
	public boolean DeleteatLast()
	{
		if(head==null)
		{
			return false;
		}
		Node temp=tail;
		tail=tail.getPre();
		tail.setNext(null);
		temp.setPre(null);
		return true;
	}
	public void ForwardDisplay()
	{
		Node temp =head;
		while(temp!=null)
		{
			System.out.print("   "+temp.getData());
			
			temp=temp.getNext();
			
		}
	}
	
	public void BackwardDisplay()
	{
		Node temp=tail;
		
		while(temp!=null)
		{
			System.out.print("   "+temp.getData());
			temp=temp.getPre();
		}
	}
	
	public boolean Search(int value)
	{
		if(head==null)
		{
			return false;
		}
		Node temp=head;
		int i=0;
		while(temp!=null)
		{
			i++;
			if(temp.getData()==value)
			{
				System.out.println("Element found at index" + i);
				break;
			}
			temp=temp.getNext();
		}
		
		return true;	
	}
	
	
	public boolean Deleteatpos(int pos)
	{
		if(pos<=0)
		{
			return false;
		}
		if(pos==1){
			DeleteatBeg();
		}
		int i=1;
		Node temp=head;
		
		while(i<pos-1)
		{
			i++;
			temp=temp.getNext();
			if(temp.getNext()==null)
			{
				System.out.println("not valid");
			}
			
		}
		if(temp.getNext().getNext()==null) {
			temp.setNext(null);
		}
		else{
		Node t=temp.getNext();
		temp.setNext(t.getNext());
		t.setNext(null);
		t.setPre(null);
		}
		return true;
		
		
	}
}
