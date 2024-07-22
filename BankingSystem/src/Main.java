import java.util.Scanner;

public class Main {
	private static void printMenu() {
		System.out.println("1: Login");
		System.out.println("2: Create Account");
	}
	
	public static void main(String[] args) {
		
		//Taking user input
		byte choice;
		Scanner sc = new Scanner(System.in);
	
		
		boolean flag = true;
		
		while(flag)
		{
			System.out.println("\nSelect the Operation: ");
			Main.printMenu();
			choice = sc.nextByte();
			
			switch(choice)
			{
				case 1: //Login Options
					System.out.println("Login");
					Bank user = new Bank();
					user.loginUser();
					break;
					
				case 2: //Create Account
					System.out.println("1. Individual User")					System.out.println("1. Individual User");
					System.out.println("2. Corporate User");
					private int accountchoice = sc.nextInt();
					switch(choice)
					{
						case 1:
							user.registerIndividualuser();
							break;
							
						case 2:
							user.registerCorporateuser();
							break;
							
						default :
							System.out.println("Invalid Choice.");
							break;
					}
					break;
					
				case 0: //to terminate the program
					flag = false;
					break;
					//System.exit(0);
					
				default:
					System.out.println("Invalid Choice. Try Again...");
					break;
			}
		}
		
		System.out.println("Out of the program");
	}
}
