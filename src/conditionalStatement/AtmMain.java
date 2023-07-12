package conditionalStatement;
 
import java.util.Scanner;

public class AtmMain {

	public static void main(String[] args) {
		// New Account
		Account athiraAccount = new Account();
		
		Scanner sc = new Scanner(System.in);
		
		athiraAccount.balanceAmount = 700;
		
		athiraAccount.overdraftAmount = 2000;
		
		System.out.println("Enter withdraw amount");
		 
		athiraAccount.withdrawAmount = sc.nextInt();
		athiraAccount.pinNumber = 1234;
		System.out.println("Enter pin number");
		athiraAccount.enteredPinnumber = sc.nextInt();
		
		athiraAccount.validatepinandWithdrawcash();
		
//	athiraAccount.atmwithdrawal();

 	}

}
