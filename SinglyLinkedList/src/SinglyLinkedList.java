
public class SinglyLinkedList {
		
		Node head;
		
		public SinglyLinkedList()
		{
			
		}
		
		public Node getHead() {
			return head;
		}

		public void setHead(Node head) {
			this.head = head;
		}
		public boolean insertatBig(int value)
		{	
			Node Newnode = new Node(value);
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
		
		
		public boolean insertatLast(int value)
		{
			Node Newnode=new Node(value);
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
		
		public boolean DeleteatBig()
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

