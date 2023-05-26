



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
			int i=0;
			public int count()
			{
				
				Node temp=head;
				while(temp!=null)
				{
					i++;
				temp=temp.getNext();
				}
//				System.out.print("size="+i);
				return i;
			}

			public void middleeliment(int size) {
				
					
					Node temp=head;
					int j=1;
					int z=size/2;
					
					if(z%2==1)
					{
						z=z+1;
					}
					while(z>j )
					{
						j++;
						temp=temp.getNext();
					}
					System.out.print("middle element "+temp.getData());
				
			}
			
			public void assendingLL()
			{
				if(head==null)
				{
					return ;
				}
				
				
				for(Node temp=head;temp!=null;temp=temp.getNext())
				{
					for(Node tail=temp.getNext();tail!=null;tail=tail.getNext())
					{
						int x;
						if(temp.getData()>tail.getData())
						{
							x=temp.getData();
							temp.setData(tail.getData());
							tail.setData(x);
						}
						
					}
				
				}
			}
			
			
			public void DisendingLL()
			{
				if(head==null)
				{
					return ;
				}
				
				
				for(Node temp=head;temp!=null;temp=temp.getNext())
				{
					for(Node tail=temp.getNext();tail!=null;tail=tail.getNext())
					{
						int x;
						if(temp.getData()<tail.getData())
						{
							x=temp.getData();
							temp.setData(tail.getData());
							tail.setData(x);
						}
						
					}
				
				}
			}
			
			public void Duplicate()
			{
				for(Node temp=head;temp!=null;temp=temp.getNext())
				{
					for(Node tail=temp.getNext();tail!=null;tail=tail.getNext())
					{
//						int x;
						if(temp.getData()==tail.getData())
						{
							System.out.println("yes");
							Node sid=head;
							while(sid.getNext()!=tail)
							{
								sid=sid.getNext();
//							
								System.out.println(sid.getData());
								System.out.println(tail.getData());						
//							tail=tail.getNext();
							}
							
							}
						
						
					}
				
				}
			}

		}



