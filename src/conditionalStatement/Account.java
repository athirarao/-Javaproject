package conditionalStatement;

public class Account {
	
	double balanceAmount = 5055.35;
	int withdrawAmount;
	int overdraftAmount;
	int pinNumber;
	int enteredPinnumber;
	
	
	void atmwithdrawal() {
		
		if ( balanceAmount>withdrawAmount|| overdraftAmount>withdrawAmount) {
			System.out.println(" Customer withdraw cash");
		}else {
			
			System.out.println("Insufficient fund");
			
		}
	
	
		
	}
				
		
	void validatepinandWithdrawcash() {
		if ( enteredPinnumber == pinNumber) {
			System.out.println("Pin is correct");
			if (balanceAmount>withdrawAmount|| overdraftAmount>withdrawAmount) {
				System.out.println(" Customer withdraw cash");
			}else {
				System.out.println("No Balance");
			}
				
			}else {
			 System.out.println(" Incorrect Pin");
			}
			
		}
		
	
		
	}
	
	


