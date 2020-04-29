import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * You are required to present the user with a menu to display the result of the simulation, with the following options:
 * Company with the highest capital (number of shares times (x) latest share price)  
 * Company with the lowest capital (number of shares times (x) latest share price) 
 * If there are more than one company at the top or bottom position, they all should be displayed in the result
 * Investor with the highest number of shares 
 * Investor with the lowest number of shares 
 * It there is more than one investor in any of the positions, they all should be displayed in the result.  
 */

public class Menu {
	
	public Menu() {		
		
	}

	public void start() {	

		//add scanner method to read the user input
		Scanner userInput = new Scanner(System.in);		
		String option = null; //wont allow any null value (enter)
		
		Company comp = new Company();
		Investor inv = new Investor.InvestorBuilder().build();
		TradingDay tr = new TradingDay();
		
		//using the try/catch to the menu be displayed after each operation
		try {
			do {			
				System.out.println("********* MENU OPTIONS *********");
				System.out.println();			
				System.out.println("1. Companies with Highiest Capital");
				System.out.println("2. Companies with Lowest Capital");
				System.out.println("3. Investors with Highiest number of Shares");				
				System.out.println("4. Investors with Lowest number of Shares");
				System.out.println("5. Display Companies");
				System.out.println("6. Display Investors");
				System.out.println("7. Testing Reports");
				System.out.println();

				option=userInput.nextLine();
				switch (option) {
				case("1"):
					System.out.println("------------------------------------------------------");
					System.out.println("********* COMPANIES WITH HIGHIEST CAPITAL *********\n");					
					
				break;

				case("2"):
					System.out.println("------------------------------------------------------");
					System.out.println("********* COMPANIES WITH LOWEST CAPITAL *********\n");
									
					break;

				case("3"):
					System.out.println("------------------------------------------------------");
					System.out.println("********* INVESTORS WITH HIGHIEST NUMBER OF SHARES *********\n");

				
				break;

				case("4"):
					System.out.println("------------------------------------------------------");
					System.out.println("********* INVESTORS WITH LOWEST NUMBER OF SHARES *********\n");
			
				break;
				
				case("5"):
					System.out.println("------------------------------------------------------");
					System.out.println("********* DISPLAY COMPANIES *********\n");
					System.out.println();
					comp.create();			
				break;
				
				case("6"):
					System.out.println("------------------------------------------------------");
					System.out.println("********* DISPLAY INVESTORS *********\n");
					inv.create(); 
				break;
				
				case("7"):
					System.out.println("------------------------------------------------------");
					System.out.println("********* TESTING REPORTS *********\n");
					tr.BuyShare();
				break;

				default:
					System.out.println("Error reading input. Try again ");
					System.out.println();
				}
			} while (true);
		} catch (Exception e) {System.out.println("Error reading input");}
	}

}




	


