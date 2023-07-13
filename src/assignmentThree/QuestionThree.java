package assignmentThree;

public class QuestionThree {
          int bucket;
          int capacity;
          
       void fillTank() {
    	   while (capacity <= 90) {
    		   capacity = bucket * 10;
    		   System.out.println("Tank capacity reached "+ capacity);
    		   bucket++;
   	        if (capacity == 100) {
    			   System.out.println("Tank Reached Capacity.Stop filling");
    			   break;
    		  }
    	   }
       }
}
