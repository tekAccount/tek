package inclasspractice;

public class discountcalculate {

	public static void main(String[] args) {
		
		

        // create a double name = discount
        // create a String name = fullName
        // create an int name = age
        // create a char name = gender
        // create a double name = total



       // we are going to calculate the discount based on the age of the customer
        // if the customer is a female between 22-35 then we give 10% discount
        // if the customer is a male between 22-35 then we give 5% discount
        // if the customer is a female above 60, then 25% discount
        // if the customer is a male above 60, then 20% discount
        // if the customer is a female between 50-55, then 15% discount
        // if the customer is a male between 50-55, then 8% discount
        // anything else, no discount



       // calculate the discount based on the values of the variables
        // print the total before discount
        // print the discount amount
        // print the total after discount
		
		double discount= 0;
		String fullname= "shaheera";
		int age = 22;
		char gender ='f';
		double total = 400;
		double discountAmount = total * discount/100;
		 
		
		if (gender == 'f') {
			
			
		}if (age >= 22 && age <=35) {
			
			discountAmount= 10;
		} if ( age > 60) {
			
			discountAmount=25;
		} if ( age >=50 && age <=55) {
			
			discountAmount=15 ;
	    }
		else if ( gender=='m');{
		}if ( age >=22 && age <=35) {
			discountAmount= 5;
			
		}if ( age >=50 && age <=55) {
			
	       discountAmount=25;
			
		}if (age >60) {}
		 
		   discountAmount=20;
		
		System.out.println("salam.." +fullname);
		System.out.println("This is how much discount you get.." + discountAmount + "%");
		System.out.println("This is the total before discount  $" +total);
	    System.out.println("This is the total after discount $" +(total-discount));
		
		
		
		
		
		
		
						
					
		
	}

}
