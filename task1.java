import java.util.*;
import java.util.Scanner;
import java.util.Random;
class task1
{
	public void rule()
	{
		System.out.println("...............RULES OF THE GAME................");
        System.out.println("First of all You have to guess a number. ");
        System.out.println("If you guess right number in first attempt you got 10 point.");
        System.out.println("Otherwise you will get total 10 attempt.");
        System.out.println("As your attempt decrease , your score will also decrease.");
        System.out.println("And at last if you guessed the right number then you will get a score according to attempt.");
        System.out.println("Otherwise you will lose the game and you will get zero score. ");
	}
	public void game()
	{
		int ran, gn ,n=0;
        Random randNum = new Random();
        ran = randNum.nextInt(100);
		System.out.println("...............let's start the Game................");
        System.out.print("\n Guess the Number between 1 to 100 \n ");
		while(n<10)
		{
			Scanner obj = new Scanner(System.in);
			gn=obj.nextInt();
			System.out.println("your guessed number is "+ gn);
			if(gn==ran)
			{
				System.out.println("you guess right number and win the match ..");
				System.out.println("your score is "+(10-n));
				break;
				
			}
			else if(gn<ran)
			{
				System.out.println("Your estimated number is less than the actual number..");
				System.out.println("so please guess the big number.");
			}
			else
			{
				System.out.println("Your estimated number is bigger than the actual number..");
				System.out.println("so please guess the small number.");
			}
			if(n==8)
			{
				System.out.println("this is your last chance");
			}
			if(n==9)
			{
				System.out.println("You lose the game and your score is 0.");
			}
			n++;
			
			if(n<10)
			System.out.println("Guess again");
		}
	}
    public static void main(String str[])
    {
		int i=1;
        
		task1 ob = new task1();
		ob.rule();
		ob.game();
		
		while(i==1)
		{
			System.out.println("Do you want to play again ..");
			System.out.println("if yes then press 1 else press 0");
			Scanner st = new Scanner(System.in);
			i=st.nextInt();
			if(i==1)
			{
				ob.game();
			}
			else
			{
				System.out.println("I hope you enjoy this game and will come back to play it again..");
			}
		}
		
			
	}
}