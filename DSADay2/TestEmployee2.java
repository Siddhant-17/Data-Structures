import java.util.Scanner;
import java.lang.String;
public class TestEmployee2 {

	public static void main(String[] args) {
		Employee E[] = new Employee[3];
		
		EmployeeService.CreateEmployee(E);
//		EmployeeService.DisplayEmployee(E);
		
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("Sort Based on \n 1)Salary\n2)first_name\n3)last_name\n4)Delete");
		System.out.println("Enter choice");
		int choice = sc.nextInt();
		
		
	while(choice != 0)
		{
		if(choice == 1)
		{
			EmployeeService.SortSal(E);
		    EmployeeService.DisplayEmployee(E);
		}
		else if(choice == 2) 
		{	
		EmployeeService.compareTo(E);
		EmployeeService.DisplayEmployee(E);
		}
		else if(choice == 3)
		{
		EmployeeService.compareTolastname(E);
		EmployeeService.DisplayEmployee(E);
		}
//		else if(choice == 4)
//		{
//			EmployeeService.DeleteEmployee(E,1);
//			EmployeeService.DisplayEmployee(E);
//		}
		
		else 
		{
		System.out.println("invalid choice");
		}
		System.out.println("Enter 1 to continue\n Enter 0 to exit");
		choice = sc.nextInt();
	}
	sc.close();
}
}
