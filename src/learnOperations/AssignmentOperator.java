package learnOperations;

public class AssignmentOperator {
	
	int age = 25;
	
	void ageAfter5Years() {
		int finalAge = age+5;
		System.out.println("Age after 5 years = "+ finalAge);
		age += 5;
		System.out.println("Age after 5 years = "+ age);
	  }
	void ageBefore10Years(){
		age-=10;
		System.out.println("Age before 10 years is " +age);
	}
	void ageinmultipleYears(){
		age*=3;
		System.out.println("Age multiplied by 3 " +age);
	}    
}
