package firstPackage;

public class MobilePhone {
    
   String brandName;  
   int modelnumber;
   double screensizeinInches;
   int storagecapacity;
   String operators;
   boolean iscamerapresent;
   
   void makeCalls() {
    	 System.out.println("Making calls from "+brandName+modelnumber);
   }
   void sendTextMessage() {
	   System.out.println("Sending text messages");
	   
   }
   void takePictures() {
	   System.out.println("Taking Pictures");
   }
}
