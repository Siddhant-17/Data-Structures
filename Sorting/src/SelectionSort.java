import java.util.Arrays;

public class SelectionSort {

	
	
	public static  void SelectionSort(int arr[])
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				}
				
			}
			System.out.println(Arrays.toString(arr));
		}
	}
	
//	public static void display(int arr[])
//	{
//		for(int i=0;i<arr.length;i++)
//		{
//			System.out.print(" "+arr[i]);
//		}
//	}
	
	
	public static void main(String[] args) {
	
		int arr[]= {2,54,1,4,56,0,667,98,98,3};

		SelectionSort(arr);
//		display(arr);
		System.out.println("after sorting: "+Arrays.toString(arr));
}
}
