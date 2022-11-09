
public class Arrayes {
	public static void main(String[] args) {
		
/*		int[] x = new int [5];
		x [0] = 10; 
	    x [1] = 20;
	    x [2] = 30;			
	    x [3] = 40;
	    x [4] = 50;
	    
	    
	    System.out.println("index 0 =" + x [0] );
	    System.out.println("index 0 =" + x [1] );
	    System.out.println("index 0 =" + x [2] );
	    System.out.println("index 0 =" + x [3] );
	    System.out.println("index 0 =" + x [4] );  
	    
	    // To create an array
	    // data- type [] name-of-array = new data-type [size]
	    // to refer an index
	    // name-of-array [index-number]
	    
	    
	    String []firstnames= new String [5];
	    
	    firstnames[0]= "ahmad"; 
	    firstnames[1]= "nabi";
	    firstnames[2]= "fawad";
	    firstnames[3]= "karim";
	    firstnames[4]= "marjan";
	    System.out.println(firstnames[4]);
	    
	    
	   boolean []temp = new boolean [7];
	   System.out.println(temp);
	    // before assign the value
	   System.out.println(temp[0]);
	    System.out.println(temp[1]);
	    System.out.println(temp[2]);
	    System.out.println(temp[3]);
	    System.out.println(temp[4]);
	    System.out.println(temp[5]);
	    System.out.println(temp[6]);
	    
	  // after assign the value  
	    temp[0] = true;
	    temp[1] = false;		  
	    temp[2] = true;
	    temp[3] = false;
	    temp[4] = true;
	    temp[5] = false;
	    temp[6] = false;
	    System.out.println(temp[0]);
	    System.out.println(temp[1]);
	    System.out.println(temp[2]);
	    System.out.println(temp[3]);
	    System.out.println(temp[4]);
	    System.out.println(temp[5]);
	    System.out.println(temp[6]);
	    
	    System.out.println(temp); */
	    
	    
	    
/*	int[] numbers = {1,7,8,4,9,6,10,8, };
	    
	
	    System.out.println(" lenght" +numbers.length);
	    
	    // is length a method/function? no
	    
	    String str = "this is test";
	    System.out.println("lenght of string" + str.length());
	    
	    // is length of Stirng a method/function? yes lenght ()
	    
	    System.out.println(numbers[0]);
	    System.out.println(numbers[1]);
	    System.out.println(numbers[2]);
	    System.out.println(numbers[3]);
	    System.out.println(numbers[4]);
	    System.out.println(numbers[5]);
	    System.out.println(numbers[6]);
	    System.out.println(numbers[7]);
	    
	    // processing the array with a loop
	    System.out.println(" ********* array with the loop");
	    int index = 0;
	    while (index<numbers.length) {
	        System.out.println(numbers[index++]);
	    } */
		
		
		
		int [] totalsales = {156,56,67,76,89,98,43,24,65,6,7,7,44,4,4,4,4,43,3,2,2,2};
		System.out.println("length of the array" + totalsales.length);
		
		 int index = 0;
		 int sum = 0;
		    while (index<totalsales.length) {
		    	sum = sum + totalsales[index++];
		        System.out.println(totalsales[index++]);
		    } 
		
		
		System.out.println("grand total : " + sum);
}
	

}