//1)  create class Employee 
//
//	int id 
//	float sal 
//	String first name , last name 
//
//	** id need to generate with static variable 
//
//		1) write Default Constructor 
//		2) 3 parameters constructor  -  first name , last name , sal 
//		3) toString method
//		4) equals method 

public class Employee {

	int id;
	float sal;
	String first_name;
	String last_name;
	
	public Employee()
	{
	   
	}
	public Employee(float sal,String first_name,String last_name)
	{
		            id++;
		     
		this.sal=sal;
		this.first_name=first_name;
		this.last_name=last_name;
	}
//	public String toString()
//	{
//	
//		return "Employee id = "+(id++)+"\nsal= "+sal+"\nfirst_name= "+first_name+"\nlast_name= "+last_name;
//	}
//	public boolean equals(Employee E)
//	{
//		Employee temp =(Employee) E;
//		if((this.id == temp.id)
//			&&(this.first_name==temp.first_name)
//			&&(this.last_name==temp.last_name)
//			&&(this.sal==temp.sal))
//		{
//			return true;
//		}
//		else
//		{
//			return false;
//		}
//	}
	
}
