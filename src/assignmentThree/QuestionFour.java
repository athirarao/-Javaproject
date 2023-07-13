package assignmentThree;

public class QuestionFour {
	int chocolateNumber;
	
	void fillbox() {	
	while (chocolateNumber <= 63) {
		chocolateNumber+=5;
		System.out.println("Chocolate number is "+ chocolateNumber);
		if (chocolateNumber == 62) {
			System.out.println("Box full.Stop Filling");
			break;
		}
	}
	}
}
