import java.util.Scanner;
public class LinearSearch{
private static int LinearSearch(int[] arr, int key) {
		for(int i=0;i<arr.length;i++)
		{
			if(key==arr[i])
			{
				return i;
			}
		}
		return -1;
	}
	

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int arr[]={1,23,4,5,6,7,89,9};
		System.out.println("Enter key to search: ");
		int key =sc.nextInt();
		int index=LinearSearch(arr,key);
		if(index!=-1)
		{
			System.out.println("Key found at index :"+index);
		}
		else
		{
			System.out.println("Key not found");
		}
	}

	
}
