package Sid23;
public class SinglyLinkedList {

	
	Node head;
	
	public SinglyLinkedList()
	{
		
	}
	
	public Node gethead()
	{
		return this.head;
	}
	public void sethead(Node head)
	{
		this.head=head;
	}
	
	
	@SuppressWarnings("unused")
	public boolean insertatBeg(int value1)
	{
		Node Newnode = new Node(value1);
		if(Newnode==null)
		{
			return false;
		}
		if(head==null)
		{
			head=Newnode;
		}
		else
		{
			Newnode.setNext(head);
			head=Newnode;
		}
		return true;
	}
	@SuppressWarnings("unused")
	public boolean insertatLast(int value1)
	{
		Node Newnode=new Node(value1);
		if(Newnode==null)
		{
			return false;
		}
		if(head==null)
		{
			head=Newnode;
		}
		else
		{
			Node temp=head;
			while(temp.getNext()!=null)
			{
				temp=temp.getNext();
			}
			temp.setNext(Newnode);
			
		}
		return true;
		
	}
	
	public boolean DeleteatBeg()
	{
		if(head==null)
		{
			return false;
		}
		else{
			Node temp=head.getNext();
			head=temp;
		}
		return true;
		
	}
	
	public boolean DeleteatLast()
	{
		
		if(head==null)
		{
			return false;
		}
		else{
			Node temp=head;
			while(temp.getNext().getNext()!=null)
			{
				temp=temp.getNext();
			}
			temp.setNext(null);
			return true;
		}
			
	}
	
	public boolean reverse()
	{
		Node p,q,r;
		p=head;
		q=head.getNext();
		while(q!=null)
		{
			r=q.getNext();
			q.setNext(p);
			p=q;
			q=r;
		}
		head.setNext(null);
		head=p;
		
		System.out.println("\nafter reverse");
		display();
		
		return true;
	}
	
	
	@SuppressWarnings("unused")
	public boolean insertatpos(int value1 ,int pos)
	{
		if(head==null)
		{
			return false;
		}
		if (pos<=0)
		{
			return false;
		}
		if(pos==1)
		{
			insertatBeg(value1);
		}
		else
		{
			Node temp=head;
			Node Newnode=new Node(value1);
			
			int i=1;
			while(i<pos-1 && temp!=null)
			{
				temp=temp.getNext();
				i++;
			}
			if(temp==null)
			{
				System.out.println("Invalid Position");
				return false;
			}
			Newnode.setNext(temp.getNext());
			temp.setNext(Newnode);
			
					
			
		}
		
	
	
	return true;
	}
	
	public boolean search(int value)
	{
		
		Node temp = head;
		
		int counter=0;
		
		while(temp!=null)
		{
			counter++;
			if(value==temp.getData())
			{
				System.out.println("\n"+value+" Element found at "+counter);
				
			}
			
			temp=temp.getNext();
		}
	
		return false;
	
	}
	
	public boolean Deleteatpos(int pos)
	{
		if(head==null)
		{
			return false;
		}
		if(pos<=0)
		{
			System.out.println("Enter valid position");
		}
		if(pos==1)
		{
			DeleteatBeg();
		}
		else 
		{
			Node temp=head;
			int counter=1;
			
			while(counter < pos-1 && temp!=null)
			{
				temp=temp.getNext();
				counter++;
			}
			if(temp==null)
			{
				System.out.println("\nInvalid Position");
				return false;
			}
			
			Node t=temp.getNext();
			temp.setNext(t.getNext());
			t.setNext(null);
			System.out.println("\nNode deleted  "+t.getData());
			
			
		}
		
		return true;
	}
	
	
	public void display()
	{
		Node temp=head;
		while(temp!=null)
		{
		System.out.print("\t"+temp.getData());
		temp=temp.getNext();
		}
	}

	
	
}
