
public class DynamicQTest {
	public static void main(String[] args) {
		DyQueue D1=new DyQueue();
		
		D1.enque(17);
		D1.enque(7);
		D1.enque(495);
		D1.enque(5);
		D1.enque(85);
		
		
		D1.deque();
		
		System.out.println(D1.peak().getData());
		
		
		D1.display();
	}
}
