import java.util.Arrays;

public class BubbleSort {

	
	public static void BubbleSort(int arr[])
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				//compare consecutive element
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			
		}
	}
	
	public static void ImprovedBubbleSort(int arr[])
	{
		//if in 1st iteration largest element is go at end position then why compare again so one change
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			System.out.println("no of i iteration "+i);
		}
	}
	
	public static void MoreImprovedBubbleSort(int arr[])
	{
		for(int i=0;i<arr.length-1;i++)
		{
			boolean swap=false;
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swap=true;
				}
			}
			if(swap==false)
			{
				System.out.println("no of i iteration "+i);
				break;
			}
		}
		
		
		
	}
	
	public static void main(String[] args) {
		int arr[]= {2,34,54,12,1,3,76,45,2};
//		BubbleSort(arr);
//		System.out.println("Bubble Sort : "+Arrays.toString(arr));
//		
//		
//		ImprovedBubbleSort(arr);
//		System.out.println("Improved Bubble Sort : "+Arrays.toString(arr));
//		
		int brr[]= {1,2,3,4,5,6,7};
		MoreImprovedBubbleSort(brr);
		System.out.println("More Improved Bubble Sort : "+Arrays.toString(brr));
	}

}
