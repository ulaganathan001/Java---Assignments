package Award;

import java.util.*;

public class EmployeeAward {
	static LinkedList<String> emp = new LinkedList<String>();

	
	
	static String random() {
		String randomNum = null;
		 for(int i = 0; i < emp.size()-1; i++) {
	             randomNum = emp.get((int) (Math.random()*(emp.size()-1)) + 1);
	            
	        }
		  return randomNum;
		 
	}
	
	public static void main(String[] args) {
		emp.add("ulganathan");
		emp.add("Santosh");
		emp.add("Pradeep");
		emp.add("Dola");
		Scanner sc = new Scanner(System.in);
	for(;;)
	{
		System.out.println("Select choice from 1 to 3");
		System.out.println("1. List of Employees");
		System.out.println("2. Display award wining employee upon entered month");
		System.out.println("3. Exit");
		System.out.println("choose your choice");
		int choice = sc.nextInt();
		
		if(choice ==1) {
				System.out.println("list of empolyees");
				for(String employee:emp) {
					System.out.println(employee);
				}
				
		}
		else if(choice==2) {
			System.out.println("----Month Names are:----");
			System.out.println(" jan \n feb\n mar\n apr\n may\n june\n july\n aug\n sep\n oct\n nov\n desc\n");
			System.out.println("enter a month :");
			String month=sc.next();
			if(month.equalsIgnoreCase("jan")||month.equalsIgnoreCase("feb")||month.equalsIgnoreCase("mar")||month.equalsIgnoreCase("apr")||month.equalsIgnoreCase("may")||month.equalsIgnoreCase("june")||month.equalsIgnoreCase("july")||month.equalsIgnoreCase("aug")||month.equalsIgnoreCase("sep")||month.equalsIgnoreCase("oct")||month.equalsIgnoreCase("nov")||month.equalsIgnoreCase("desc"))
			{
					System.out.println(month+" month "+" lucky winner is "+EmployeeAward.random()+"\n");
					
			}
			
		}
		else if(choice ==3) {
			
			break;
		}
		else {
			System.out.println("Invalid choice");
			continue;
		}
	}
	}
}
