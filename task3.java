import java.util.*;
class task3
{
	int bal=18000 , pin=2211;
	Scanner sc = new Scanner(System.in);
	
	public void chckPin()
	{
		int n;
		System.out.println("Enter your pin :");
		n=sc.nextInt();
		System.out.println("Pin is: " +n);
		if(n==pin)
		{
			menu();
		}
		else
		{
			System.out.println("Please enter a valid pin");
			chckPin();
		}
	}
	public void menu()
	{
		int opt;
		do
		{
			System.out.println("\n Enter your choice");
			System.out.println("1) check your balance");
			System.out.println("2) Withdraw Amount");
			System.out.println("3) Deposit Amount");
			System.out.println("4) Exit");
			
			opt=sc.nextInt();
			
			switch(opt)
			{
				case 1:
					chckBalance();
					break;
				case 2:
					withdraw();
					break;
				case 3:
					deposit();
					break;
				case 4:
					System.out.println("Thank you for using ATM");
					break;
				default:
					System.out.println("Enter a valid option");
			}
		}while(opt!=4);
	}
	
	public void chckBalance()
	{
		System.out.println("your account balance is: " +bal);
	}
	
	public void withdraw()
	{
		int amt;
		System.out.println("Enter amount to withdraw");
		amt = sc.nextInt();
		System.out.println("Amount to withdraw: " +amt);
		if(amt > bal)
		{
			System.out.println("Insufficient Balance");
		}
		else
		{
			bal = bal-amt;
			System.out.println("Money Withdraw Successfully.");
			System.out.println("Remaining Balance is: "+bal);
		}
	}
	
	public void deposit()
	{
		int money;
		System.out.println("Enter amount to Deposit");
		money = sc.nextInt();
		System.out.println("Amount to Deposit: " +money);
		bal = bal+money;
		System.out.println("Money Deposited : "+money);
		System.out.println("Money Deposited Successfully");
		System.out.println("Total Balance: "+bal);		
	}
	
	public static void main(String str[])
    {
		task3 ob = new task3();
		ob.chckPin();
	}	
}