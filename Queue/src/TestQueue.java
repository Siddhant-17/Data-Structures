
public class TestQueue {
	
	public static void main(String[] args) {
		Queue q1=new Queue(5);
		
		q1.enque(45);
		q1.enque(96);
		q1.enque(88);
		q1.enque(47);
		q1.deque();
		
//		q1.enque(4);
//		q1.enque(48);
//		q1.enque(44);
		
		
		
			System.out.println(q1.peak());
		
		
		q1.display();
		
		
	}
}
