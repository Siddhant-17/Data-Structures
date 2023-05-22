
public class TestLl {

	public static void main(String[] args)
	{
		SinglyLinkedList l1 =new SinglyLinkedList();
		
		l1.insertatBig(12);
		l1.insertatBig(54);
		l1.insertatBig(69);
		l1.insertatBig(88);
		l1.insertatBig(55);
		l1.insertatBig(1);
		
		
		l1.insertatLast(0);
//		l1.insertatLast(11);
//		l1.insertatLast(00);
		l1.insertatLast(4654);
		
		
		l1.DeleteatBig();
		l1.DeleteatLast();
		
		
		l1.display();
	}
}
