package assignmentThree;

// import java.util.Scanner;

public class AssignmentQ5Main {

	public static void main(String[] args) {
		QuestionFive useraccount = new QuestionFive ();
		useraccount.attemptNumber=1;
		useraccount.savedUsername= "pivotAdmin";
		useraccount.savedPassword= "Admin123";
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Enter User Name");
		//useraccount.userName= sc.nextLine();
		//System.out.println("Enter Password");
	//	useraccount.passWord= sc.next();
		
		useraccount.compareUsernameandPassword();
		

	}
	

}
