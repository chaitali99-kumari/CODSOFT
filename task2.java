import java.util.*;
class task2
{
	public static void main(String str[])
	{
		String name , subject , grade;
		int n[]=new int[5];
		int i , total_marks=0;
		float avg_per;
		System.out.println("Enter the name of the student");
		Scanner sc = new Scanner(System.in);
		name=sc.nextLine();
		for(i=0 ; i<5 ; i++)
		{
			System.out.println("Write the subject for which you are going to enter marks");
			subject = sc.nextLine();
			System.out.println("Enter "+name+"'s  " +subject+" marks out of 100");
			n[i]=sc.nextInt();
			sc.nextLine();
		}
		for(i=0 ; i<5 ; i++)
		{
			total_marks=total_marks+n[i];
		}
		System.out.println("Total marks obtained by "+name+" is "+total_marks);
		avg_per=total_marks/5;
		System.out.println("Average percentage is "+avg_per);
		if(avg_per>90 && avg_per<=100)
		{
			grade="A";
		}
		else if(avg_per>70 && avg_per<=90)
		{
			grade="B";
		}
		else if(avg_per>50 && avg_per<=70)
		{
			grade="C";
		}
		else if(avg_per>30 && avg_per<=50)
		{
			grade="D";
		}
		else
		{
			grade="E";
		}
		System.out.println(" And grade is "+grade);
	}
}