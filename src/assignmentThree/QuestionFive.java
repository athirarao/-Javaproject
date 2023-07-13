package assignmentThree;

import java.util.Scanner;
public class QuestionFive {{
	
}
	String userName;
	String passWord;
	String savedUsername;
	String savedPassword;
	int attemptNumber;
	
	
	
	void compareUsernameandPassword () {
		while (attemptNumber<= 3) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter User Name");
			userName= sc.nextLine();
			System.out.println("Enter Password");
			passWord= sc.next();
			
			if (savedUsername.equals(userName)&& savedPassword.endsWith(passWord)) {
				System.out.println("You are logged into the application");
				break;
			}else {
				System.out.println("Incorrect user ID or Password");
			}
			attemptNumber++;
			if (attemptNumber == 4) {
				System.out.println("Account Locked");
				break;
				
			}
			
		}
	}

}
