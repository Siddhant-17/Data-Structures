package Sid23;

public class TestSinglyLinkedList {

	
	public static void main(String[] args)
	{
		SinglyLinkedList l1 =new SinglyLinkedList();
		
		l1.insertatBeg(12);
		l1.insertatBeg(54);
		l1.insertatBeg(69);
		l1.insertatBeg(88);
		l1.insertatBeg(55);
		l1.insertatBeg(67);
		
		
		l1.insertatLast(0);
//		l1.insertatLast(11);
//		l1.insertatLast(00);
		l1.insertatLast(4654);
		
		
//		l1.DeleteatBeg();
//		l1.DeleteatLast();
		l1.display();
		
//		System.out.println("/n-----------------");
//		l1.insertatpos(78,3);
//		l1.display();
//		
//		l1.reverse();
//		
//		l1.search(69);
		
		l1.Deleteatpos(4);
		l1.display();
		
	}
}
