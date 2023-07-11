package learnOperations;

public class OperatorsMain {

	public static void main(String[] args) {
		ArithmaticOperators ao = new ArithmaticOperators();
		ao.subtractTwonumbers();
		ao.num1 = 5;
	    ao.num2 = 10;
		ao.addTwonumbers();
		
		ao.subtractTwonumbers();
		
		System.out.println("Reassigning values");
        ao.num1 = 15;
        ao.num2 = 12;
        ao.addTwonumbers();
        
        ao.subtractTwonumbers();
        ao.multiplyTwonumbers();
        ao.divideTwonumbers();
        
        
        ArithmaticOperators ao1 = new ArithmaticOperators();
        ao1.num1 = 40;
        ao1.num2 = 5;		
        ao1.divideTwonumbers();
        
        AssignmentOperator as2 = new  AssignmentOperator();
        as2.ageAfter5Years();
        as2.ageBefore10Years();
        as2.ageinmultipleYears();
        
	}

}
