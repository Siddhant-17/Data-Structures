import java.util.Arrays;

public class InsertionSort {
	
	
	
	
//	private static void InsertionSort(int[] arr) {
//		for(int i=1;i<=arr.length-1;i++)
//		{
//			int temp=arr[i];
//			
//			int j=i-1;
//			while(j>=0 && arr[j]>temp)
//			{
//				arr[j+1]=arr[j];
//				j--;
//			}
//			arr[j+1]=temp;
//		}
//		
//	}
	
	private static void InsertionSort(int[] arr) {
		for(int i=1;i<=arr.length-1;i++)
		{
			int temp=arr[i];
			int j;
			for(j=i-1;j>=0 && arr[j]>temp;j--)
			{
				arr[j+1]=arr[j];
			}
			arr[j+1]=temp;
		}
		
	}
	
	
	
	
	
	
public static void main(String[] args) {
	int arr[]= {3,2,56,76,32,1,4,87,5};
	
	
	InsertionSort(arr);
	System.out.println(Arrays.toString(arr));
}




}
