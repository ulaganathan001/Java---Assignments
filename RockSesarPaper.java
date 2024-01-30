import java.util.*;
public class RockSesarPaper {
	public static void main(String args[]) {
		System.out.println("Welcome to rock, scissor, paper game:");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter player1 name: \n");
		String player1 =sc.next();
		System.out.print("Enter player2 name: \n");
		String player2 = sc.next();
		boolean var = true;
		int count =0;
		int playerone_count=0;
		int playertwo_count=0;
		for(;;) {
			System.out.print(player1 +" Enter your choice(rock, scissor, paper) \n");
			String player1_choice = sc.next();
			if(!(player1_choice.equals("rock")) && !(player1_choice.equals("scissor")) && !(player1_choice.equals("paper"))) {
				System.out.println("correct the spelling");
				continue;
				
			}
			System.out.print(player2 +"  Enter your choice(rock, scissor, paper) \n");
			String player2_choice = sc.next();
			if(!(player2_choice.equals("rock")) && !(player2_choice.equals("scissor")) && !(player2_choice.equals("paper"))) {
				System.out.println("correct the spelling");
				System.out.print(player2 +"  Enter your choice(rock, scissor, paper) \n");
				player2_choice = sc.next();				
			}
			
			if(player1_choice.equals("rock") && player2_choice.equals("rock")) {
				System.out.println("game tie");
				count++;
			}
			else if(player1_choice.equals("rock") && player2_choice.equals("scissor")) {
				System.out.println(player1 +" wins");
				playerone_count++;
				
				
			}
			else if(player1_choice.equals("rock") && player2_choice.equals("paper")) {
				System.out.println(player1 +" wins");
				playerone_count++;
				
			} 
			
			if(player1_choice.equals("scissor") && player2_choice.equals("rock")) {
				System.out.println(player2 +" wins");
				playertwo_count++;
			}
			else if(player1_choice.equals("scissor") && player2_choice.equals("scissor")) {
				System.out.println("game tie");
				count++;
				
			}
			else if(player1_choice.equals("scissor") && player2_choice.equals("paper")) {
				System.out.println(player1 +" wins");
				playerone_count++;
				
			} 
			
			if(player1_choice.equals("paper") && player2_choice.equals("rock")) {
				System.out.println(player2 +" wins");
				playertwo_count++;
			}
			else if(player1_choice.equals("paper") && player2_choice.equals("scissor")) {
				System.out.println(player2 +" wins");
				playertwo_count++;
				
			}
			else if(player1_choice.equals("paper") && player2_choice.equals("paper")) {
				System.out.println("game tie");
				count++;
				
			} 
			System.out.println("do you want to contine(Y/N)");
			char ch = sc.next().charAt(0);
			
			if(ch=='y')
			{
				var =true;
			}
			
			else {
				System.out.println("game Over");
				System.out.println("game tie count: " +count);
				System.out.println(player1 +" win count : "+ playerone_count);
				System.out.println(player2+ " win count : " + playertwo_count);
				break;
			}
			
			
		}
		
	}
}
