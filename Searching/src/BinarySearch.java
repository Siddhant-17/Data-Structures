import java.util.*;
public class BinarySearch {

	public static int BinearySearch(int arr[],int key)
	{
		int middle;
		int left=0;
		int right=arr.length-1;
		 
		 
		while(left<=right)
		{
			middle=(left+right)/2;
			if(arr[middle]==key)
				return middle;
			if(key<arr[middle])
				right=middle-1;
			else
				left=middle+1;	
		}
		return -1;
	}
	
	private static int recursionBineary(int[] arr, int left, int right, int key) {
		if(left>right)
			return -1;
		int index;
		int middle=(left+right)/2;
		if(arr[middle]==key)
			return middle;
		if(key<arr[middle])
			index=recursionBineary(arr,left,middle-1,key);
		else
			index=recursionBineary(arr,middle+1,right,key);
		return index;
		
	}
	
	
	public static void main(String[] args) {
		int arr[]= {22,33,44,55,66,77,88,99 };
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter value to be search:");
		int key=sc.nextInt();
//		int index=BinearySearch(arr,key);  
//		if(index!=-1)
//		{
//			System.out.println("element found at index"+index);
//		}
//		else {
//			System.out.println("element not found");
//		}
		
		int index=recursionBineary(arr,0,arr.length-1,key);  
		if(index!=-1)
		{
			System.out.println("element found at index "+index);
		}
		else {
			System.out.println("element not found");
		}
		
	}

	
}
