import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class OutputApp 
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		Random card = new Random();
		String choice;
		int answer, x, i, j, k;
		double amount, bet, earnings = 100;
		choice="y";
	
		Cards tom = new Cards();
		
		while (choice.equalsIgnoreCase("Y"))
		{
			x= 1 + card.nextInt(3);
			System.out.println("##   ##   ##\n1    2    3");
			
			System.out.println("Your current earnings is: $" + earnings + " How much money would you like to bet?");
			bet=keyboard.nextDouble();
			tom.setBet(bet);
			if (bet>=5)
			{
				System.out.println("\nWhich card do you think has the Ace?");
				answer=keyboard.nextInt();
				tom.setAnswer(answer);
			
				if(x==tom.getAnswer())
				{
					tom.setEarnings(earnings+=(bet*2));
					if(x==1)
						System.out.println("Correct! The ace was card number 1!\nAA   ##   ##\n1    2    3");
					else if (x == 2)
						System.out.println("Correct! The ace was card number 2!\n##   AA   ##\n1    2    3");
					else
						System.out.println("Correct! The ace was card number 3!\n##   ##   AA\n1    2    3");
					
				}
				else
				{
					tom.setEarnings(earnings-=bet);
					if (x==1)
						System.out.println("Tough luck! The ace was card number1!\nAA   ##   ##\n1    2    3 ");
					else if (x==2)
						System.out.println("Tough luck! The ace was card number2!\n##   AA   ##\n1    2    3 ");
					else
						System.out.println("Tough luck! The ace was card number3!\n##   ##   AA\n1    2    3 ");
				}
				
				if(tom.getEarnings()<5)
				{
					System.out.println("I am sorry, but you do not have sufficient funds to make a bet. Your current earnings are: $" + tom.getEarnings());
					break;
				}
				if(tom.getEarnings()>=500)
				{
					System.out.println("Congratulations! You have earned the max amount of money from this game. Your final earnings are: $"+ tom.getEarnings());
				}
				System.out.println("\nWould you like to try again?");
				choice=keyboard.next();
				System.out.println("");
			}
			else
			{
				System.out.println("You must enter a minimum bet of $5, please try again.");
				choice.equals("y");
			}
				
			}
		}
}

