package firstPackage;

public class MobileMain {

	public static void main(String[] args) {
		
		//Instantiating a class
		MobilePhone iPhone = new MobilePhone();
		
		//Assigning values to variables
		iPhone.brandName = "IPhone";
		iPhone.modelnumber = 12;
		iPhone.screensizeinInches = 6.5;
		iPhone.iscamerapresent = true; 
		
		//Calling method or Invoking a method
		iPhone.makeCalls();
		iPhone.sendTextMessage();
		iPhone.takePictures();
		
		System.out.println("$$$$$$$$$$$$$$");
		//Instantiating a class		
		MobilePhone samsung = new MobilePhone();
		samsung.brandName = "Samsung";
		samsung.modelnumber = 22;
		samsung.screensizeinInches = 6.2;
		samsung.iscamerapresent = true;	
		samsung.makeCalls();
		
	}

}
