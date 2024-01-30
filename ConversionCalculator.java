import java.util.Scanner;

public class ConversionCalculator {
	public static void main(String args[]) {
		System.out.println(" 1.Length \n 2.Aria \n 3.Temparature \n");
		System.out.print("Enter your choice : ");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		
		switch(choice) {
			case 1:
				System.out.println("\n 1.Meter to Inch \n 2.Inch to Meter \n");
				System.out.print("Enter your choice : ");
				int choice1=sc.nextInt();
				if(choice1==1) {
					System.out.print(" \n enter meter : ");
					double ans = sc.nextInt();
					
					System.out.println(ans +" meter is equal to " +ans*39.37 + " inch");
					break;
				}
				else {
					System.out.print("\n enter Inch : ");
					double ans = sc.nextInt();
					double an=ans/39.37;
					double cm=(int)((an-(int)an)*100);
					System.out.println((int)ans +" Inch is equal to " +(int)an + " meter " + (int)cm + " cm");
					break;
				}
			case 2:
				System.out.println("1.Celsius to Fahrenheit \n 2.Fahrenheit to Celsius \n");
				System.out.print("Enter your choice : \n");
				int choice2=sc.nextInt();
				if(choice2==1) {
					System.out.print("enter celsius : ");
					double ans = sc.nextInt();
					System.out.println(ans +" celsius is equal to " +((ans * 9 / 5) + 32) + " fahrenheit");
					break;
				}
				else {
					System.out.print("enter fahrenheit : ");
					double ans = sc.nextInt();
					System.out.println(ans +" fahrenheit is equal to " +((ans - 32) * 5 / 9) + " celsius");
					break;
				}
				
			
			case 3:
				System.out.println("1.Squrefoot to squremeter \n 2.squremeter to squrefoot \n");
				System.out.println("Enter your choice : ");
				int choice3=sc.nextInt();
				if(choice3==1) {
					System.out.println("enter squrefoot : \n");
					double ans = sc.nextInt();
					System.out.println(ans +" squrefoot is equal to " + ans/10.764 + " squremeter");
					break;
				}
				else {
					System.out.println("enter squremeter : \n");
					double ans = sc.nextInt();
					System.out.println(ans +" squremeter is equal to " + ans*10.764 + " squrefeet");
					break;
				}
			default:
				System.out.println("Invalid Choice");
		}
		
		
		
	}
}
