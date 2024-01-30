package Award;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ticket {
	public static void main(String[] args) {
		int at = 4;
		LinkedList<String> employees = new LinkedList<String>();
		Queue<String> ae = new LinkedList<String>();
		Queue<String> wl = new LinkedList<String>();
		employees.add("Ak");
		employees.add("muthu");
		employees.add("pradeep");
		employees.add("santhosh");
		employees.add("ulaganathan");
		employees.add("satya");
		employees.add("thamaraiselvan");
		employees.add("parthasarathy");
		for (;;) {
			System.out.println("1.List of employees");
			System.out.println("2.Book a ticket");
			System.out.println("3.Waiting list employees");
			System.out.println("4.Available Tickets");
			System.out.println("5.Cancel Ticket");
			System.out.println("6.Display Booked Persons List");
			System.out.println("7.Exit\n");
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter your choice between(1 to 7):");
			int choice = sc.nextInt();
			if (choice == 1) {
				System.out.println(employees + "\n");
			} 
			else if (choice == 2) {
				String emp = null;
				if (ae.size() >= 0 && ae.size() <= at) {
					do {
						System.out.print("Enter employee name:");
						emp = sc.next();
						if (employees.contains(emp)) {
							ae.add(emp);
							System.out.println("Ticket booked successfully \n");
							break;
						} else {
							System.out.println(
									emp + " does not matching with emoployees list.Please correct the spelling\n");
						}
					} while (true);
				} 
				else {
					System.out.println("Housefull");
					System.out.println("Do you want to book a ticket in waiting list (yes/no)");
					String c = sc.next();
					if (c.equalsIgnoreCase("yes")) {
						if (employees.contains(emp)) {
							wl.add(emp);
							System.out.println("Added succesfully to waiting list\n");
						} 
						else {
							System.out.println(emp + "Name does not match with employees list\n");
						}
					} 
					else {
						System.out.println("Thank you\n");
					}
				}
			} 
			else if (choice == 3) {
				System.out.println(wl + "\n");
			} 
			else if (choice == 4) {
				System.out.println("Available Tickets : " + (at - ae.size()) + "\n");
			} 
			else if (choice == 5) {
				if (ae.size() == 0) {
					System.out.println("No one booked\n");
				} 
				else {
					do {
						System.out.println("Enter employee name: ");
						String names = sc.next();
						if (ae.contains(names)) {
							ae.remove(names);
							if (!wl.isEmpty()) {
								String name = wl.poll();
								ae.add(name);
								System.out.println("Ticket canceled successfully.First person in the waiting list, "
										+ name + ", got the ticket.\n");
								break;
							} 
							else {
								System.out.println("Ticket canceled successfully.\n");
								break;
							}
						}
						else {
							System.out.println("Name does not match in the booked list.Please enter correct name...\n");
						}
					} while (true);
				}
			}
			else if (choice == 6) {
				System.out.println(ae + "\n");
			} 
			else if (choice == 7) {
				break;
			}
			else {
				System.out.println("Invalid choice: Enter Correct Choice. ");
			}
		}
	}
}
