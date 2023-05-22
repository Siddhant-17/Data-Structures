import java.util.Scanner;
import java.lang.String;

public class EmployeeService {
	
	 
	
	public static  void CreateEmployee(Employee E[]) {
		
		for(int i = 0 ; i <E.length ; i++)
		{
		System.out.println("Enter Employee :"+(i+1));
		System.out.println("Enter first_name");
		Scanner sc = new Scanner(System.in);
		String first_name = sc.next();
		System.out.println("Enter last_name");
		String last_name = sc.next();
		System.out.println("Enter Sal");
		float sal = sc.nextFloat();
		E[i]=new Employee(sal,first_name,last_name);
		}
	}
	public static  void DisplayEmployee(Employee E[]) {
	
		for(int i = 0 ; i <E.length ; i++)
		{
		System.out.println();
		System.out.println("Enter Employee :"+E[i].id);
		System.out.println("first_name = "+E[i].first_name);
		System.out.println("last_name= "+E[i].last_name);
		System.out.println("Sal= "+E[i].sal);
		}
		
	}

	public static void SortSal(Employee E[])
	{
		System.out.println("\n----After Sorting----");
		for(int i=0;i<=E.length-1;i++)
		{
			Employee temp;
			for(int j=0;j<i;j++)
			{
				if(E[i].sal<E[j].sal)
				{
					temp = E[i];
					E[i]=E[j];
					E[j]=temp;
				}
			}
		}
		
	}
	public static void compareTo(Employee E[]) {
		for (int i = 0; i < E.length; i++) {
			for (int j = i + 1; j < E.length; j++) {
			
		Employee temp;
				// to compare one string with other strings
				if ((E[i].first_name.compareTo( E[j].first_name))>0)
				{
					// swapping
					temp = E[i];
					E[i] = E[j];
					E[j] = temp;
				}
			}
		}
	

		
		
	}
	public static void compareTolastname(Employee[] E) {
			for (int i = 0; i < E.length; i++) {
				for (int j = i + 1; j < E.length; j++) {
				
			Employee temp;
					// to compare one string with other strings
					if ((E[i].last_name.compareTo( E[j].last_name))>0)
					{
						// swapping
						temp = E[i];
						E[i] = E[j];
						E[j] = temp;
					}
				}
			}
		
	}
	
//	public static void DeleteEmployee(Employee E[],int id)
//	{
//		for(int i=0 ; i<E.length;i++)
//		{
//			if(E[i].id == id)
//			{
//				for(int j=i+1;j<E.length-1;j++)
//				{
//					E[j]=E[j+1];
//					
//				}
//			}
//			
//			
//		}
//	}
	
	
		
	
}
