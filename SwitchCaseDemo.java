package assignmentPackage;
import java.util.*;
public class SwitchCaseDemo {

	/*
	 	5.use switch make cases, apply any loop 
	 	convenient so that it keeps on asking the 
	 	user what case u want to implement
		cases will be:
		1) Add 2 no’s
		2) Find average of 2 numbers
		3) Check even/odd
		4) Check positive or negative number
		5) check prime no or not 
		5) Quit- use exit(0)

	 */
	
	public static boolean isPrime(int number)
	{
		boolean isPrimeFlag= true;
		for(int i=2; i<number/2; i++)
		{
			if(number%i==0)
			{
				isPrimeFlag=false;
				break;
			}
		}
		return isPrimeFlag;
	}
	
	public static void main(String[] args) {
		boolean flag=true;
		do
		{
			Scanner scan= new Scanner(System.in);
			int choice; 
			
			System.out.println("1. ADD 2 NUMBERS");
			System.out.println("2. AVERAGE OF 2 NUMBERS");
			System.out.println("3. ODD EVEN CHECK");
			System.out.println("4. POSTIVE OR NEGATIVE");
			System.out.println("5. PRIME NUMBER CHECK");
			System.out.println("6. QUIT");
			
			choice= scan.nextInt();
			
			switch(choice) 
			{
			case 1: 
			{
				System.out.print("ENTER NUMBER 1: ");
				int a= scan.nextInt();
				System.out.print("ENTER NUMBER 2: ");
				int b= scan.nextInt();
				System.out.println("\nSUM: "+(a+b)+"\n");
			}
			break;
			
			case 2:
			{
				System.out.print("ENTER NUMBER 1: ");
				int a= scan.nextInt();
				System.out.print("ENTER NUMBER 2: ");
				int b= scan.nextInt();
				System.out.println("\nAVERAGE: "+((a+b)/2)+"\n");
			}
			break;
			
			case 3:
			{
				System.out.print("ENTER A NUMBER: ");
				int a= scan.nextInt();
				String str= (a%2==0) ? ("IT IS EVEN") : ("IT IS ODD");
				System.out.println("\n"+str+"\n");
			}
			break;
			
			case 4:
			{
				System.out.print("ENTER A NUMBER: ");
				int a= scan.nextInt();
				String str= (a<0) ? ("NEGATIVE NUMBER") : ("POSITIVE NUMBER");
				System.out.println("\n"+str+"\n");
			}
			break;
			
			case 5:
			{
				System.out.print("ENTER A NUMBER: ");
				int a= scan.nextInt();
				String str= (isPrime(a)) ? ("IT IS A PRIME NUMBER") : ("IT IS NOT A PRIME NUMBER");
				System.out.println("\n"+str+"\n");
			}
			break;
			
			case 6:
			{
				System.out.println("ARE YOU SURE TO QUIT (Y/N)");
				char exitState= scan.next().charAt(0);
				if(exitState=='Y' || exitState=='y')
				{
					flag=false;
				}
				else if(exitState=='N' || exitState=='n')
					continue;
				else
					System.out.println("WRONG INPUT\n");
				
			}
			break;
			
			default:
			{
				System.out.println("\nWRONG INPUT. TRY AGAIN !\n");
			}
			break;
			}
		}while(flag);
		
		System.exit(0);
	}
}
