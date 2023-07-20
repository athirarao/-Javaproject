package assignmentFour;

import java.util.Scanner;

public class MobileBrands {
	String brandName;
	String prdctNeeded;
	String[] samsung = new String[4];
	String[] google = new String[4];
	String[] apple = new String [4];
	int prdctfound;
	
	Scanner sc = new Scanner(System.in);
	
	void prdctAvailability () {
		samsung[0]= "S20";
		samsung[1]= "S21";
		samsung[2]= "Flip3";
		samsung[3]= "Fold3";
		
			
	System.out.println("Enter brand name");
	brandName= sc.next();
	if (brandName.equalsIgnoreCase("samsung")) {
		System.out.println("Available Samsung products are ");
        
		for (int i=0; i<samsung.length; i++) {
			 System.out.println(samsung[i]);
			}
	System.out.println(" Enter a prdouct from above to check availability");
     prdctNeeded= sc.next();
           outerloop:
	       for (int j=0; j< samsung.length; j++) {
	    	 if (prdctNeeded.equalsIgnoreCase(samsung[j])){
	    		 System.out.println("Product selected is "+ samsung[j]);
	    		 prdctfound= 1;
	    		 break outerloop;
	    	 }
	     }
	     if (prdctfound != 1) {
	    	 System.out.println(" Please select a product from the list");
	    		 
	     } 
	    	 
	     }else if (brandName.equalsIgnoreCase("Apple")){
	      System.out.println("Product is available");
	      apple[0]= "iphone12";
	      apple[1]= "iphone11 mini";
	      apple[2]= "iphone11";
	      apple[3]= "iphone13";
	      for (int i=0; i<apple.length; i++) {
				 System.out.println(apple[i]);
				}
		System.out.println(" Enter a prdouct from above to check availability");
	     prdctNeeded= sc.next();
	           outerloop:
		       for (int j=0; j< apple.length; j++) {
		    	 if (prdctNeeded.equalsIgnoreCase(apple[j])){
		    		 System.out.println("Product selected is "+ apple[j]);
		    		 prdctfound= 1;
		    		 break outerloop;
		    	 }
		     }
		     if (prdctfound != 1) {
		    	 System.out.println(" Please select a product from the list");
		    		 
		     } 
	      
	
	}else if (brandName.equalsIgnoreCase("google")){
	      System.out.println("Product is available");
	      google[0]= "Google Pixel 6";
	      google[1]= "Google Pixel 6 Pro";
	      google[2]= "Google Pixel Pro";
	      google[3]= "Google Pixel 5";
	      for (int i=0; i<google.length; i++) {
				 System.out.println(google[i]);
				}
		System.out.println(" Enter a prdouct from above to check availability");
	     prdctNeeded= sc.next();
	           outerloop:
		       for (int j=0; j< google.length; j++) {
		    	 if (prdctNeeded.equalsIgnoreCase(google[j])){
		    		 System.out.println("Product selected is "+ google[j]);
		    		 prdctfound= 1;
		    		 break outerloop;
		    	 }
		     }
		     if (prdctfound != 1) {
		    	 System.out.println(" Please select a product from the list");
		    		 
		     } 
		
	}
	}
	}
	

	
	
	
	
	
		
		
		
	

	
	
	

	


