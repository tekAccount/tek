package basics;

public class DataTypes {
 
public static void main(String[] args) {  
	
	// 2. reference / class
	
	String str = " test ";
	 
	String firstName; // declarition
	
	firstName = new String ("Dvid");
	
	firstName = "David "; // what goes inside the "" is called literal values
	
	System.out.println(str);
	
	// addition vs concatenation +
	// addition is adding two number / mathematically
	 
	int num1 = 10;
	int num2 = 20;
	
	System.out.println(num1+num2);
	System.out.println(num1+num1+num1+num1);
	
	// concatenation is adding value side by side
	 System.out.println("number " +num1+num2);
	
	// "10" is not the same as 10 
	 
	 String s1 = "10";
	 String s2 = "20";
	 System.out.println(s1+s2);
	 
	 
	 String sample1 = "sample:some number are " +1+ 2 ;
	  System.out.println(sample1);
	  
	  String sample2 = "sample2:some number are " + (1+2);
	  System.out.println(sample2);
	  
	 
	  
	  // Referencing
	  
	  int number1 = 99;
	  
	  int number2 = 85;
	  
	  int number3 = number1;
	  
	  System.out.println(number3);
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
		
	
}
}
