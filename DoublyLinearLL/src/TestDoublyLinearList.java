
public class TestDoublyLinearList {

	
	public static void main(String[] args)
	{
	DoublyLinear D1 = new DoublyLinear();
	
	D1.InsertatBeg(12);
	D1.InsertatBeg(55);
	D1.InsertatBeg(48);
	D1.InsertatBeg(98);
	
//	D1.display();
	
	D1.InsertatLast(25);
	
	
	
	
	D1.Inseratpos(23,3);
//	D1.DeleteatBeg();
//	D1.DeleteatLast();
//	D1.DeleteatLast();
	D1.Deleteatpos(11);
	D1.ForwardDisplay();
	D1.Search(98);
	System.out.println();
//	D1.BackwardDisplay();
	
	}
	
}
