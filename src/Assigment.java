
public class Assigment {

	public static void main(String[] args) {
		
		
		
		//boolean x = true ;
	    //  System.out.println(x);
	      
	      
	      
	      

		//double x = 11.2;
		 //nt b = 18;

		 //ouble y = 3.5;

		 //ouble w = (x*b*y);

		//System.out.println(w);
		  
		  
		//System.out.println("welcome to tek school");
		
		
		
	////ing x ="Welcome To Tek school";
	    
	     //ystem.out.println(x);
		
		
		

		
		
/*nt y = 120;
int a = 453;
int b = 8457346;

  System.out.println(x
  System.out.println(y);
  System.out.println(a);
  System.out.println(b);?*/
		
		
		
	/*ouble x = 2.34;

		  double y = 45.32;

		  double a = 65.05;

		    System.out.println(x);
		    System.out.println(y);
		    System.out.println(a);*/
		
		
	/*	String x = "Hello";
		
		String y = "World";
		
		System.out.println(x);
		System.out.println(y); */
		
		
		// array of integers,sum, min, max, avg, count
		
		int []totalsales= { 156, 5, 1, 75,  545 };
		
		
		int  index = 0;
		
		
		// i want to see the sum of all of the in integers in the array
		int sum = 0;
		int min = totalsales[0];
		int max = totalsales[0];
		int count = totalsales.length;
		double avg = 0;
		
		while (index < totalsales.length) {
			// print the value of each index
			System.out.print(totalsales[index]  +  ",  " );
			
			// adding the current value to the sum
			sum = sum + totalsales[index];
			
			// current index value > max ==== then assign the current value to max
			if (totalsales[index]> max ) {
				max = totalsales[index];
				
			}
			//current index value < min ==== then assign the current value to min 
			if (totalsales[index]<min) {
				min = totalsales[index];
			}
			index++;
		}
		
		// going to the next line
		System.out.println();
		
	    // finding average
		avg = (double) sum / count;
		
		System.out.println("sum:\t" + sum);
		System.out.println("MIN:\t"+ min);
		System.out.println("MAX:\t" + max);
		System.out.println("AVG:\t" + avg);
		System.out.println("sum:\t" + count); 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
