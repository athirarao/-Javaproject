package learnString;

import java.util.Scanner;

public class StringMain {

	public static void main(String[] args) {
		
		StringExample name = new StringExample();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		name.trainerName = sc.nextLine();
		
		
		name.displayTrainername();
		  

	}

}
