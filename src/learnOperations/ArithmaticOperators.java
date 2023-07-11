package learnOperations;

public class ArithmaticOperators {
	int num1;
	int num2;
	
	void addTwonumbers () {
		int sum = num1+num2;
		System.out.println("Addition of "+num1 + " and " +num2 +" is " + sum);
	}	
	void subtractTwonumbers () {
		int difference = num1-num2;
		System.out.println("Difference of two numbers is "+ difference);
		
	}
	void multiplyTwonumbers () {
		int product = num1*num2;
		System.out.println("Prodcut of two numbers is " + product);
	}
    void divideTwonumbers () {
    	int   quotient = num1/num2;
    	int remainder = num1%num2;
    	System.out.println(" Quotient of two numbers is "+ quotient);
    	System.out.println("Remainder of 2 numbers is " + remainder);
    }
}
