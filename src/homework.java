
public class homework {

	public static void main(String[] args) {
		
		// calculate grades and assign letter
        // assign plus and minus as well
        // 90 - 100 A
        // 80 - 89 B
        // 70 - 79 C
        // 60 - 69 D
        // 0 - 59 F
        // in each category, if you pass 5, then add + if not add -
        // example 95 A+ 94 A-
		
	
		double grade =50;




        if ( grade >= 90) {
        if (grade <= 94) {
         System.out.println("A-");



        }if (grade >= 95) {
          if (grade <= 100) {
            System.out.println("A+");
         }
         }
        }else if(grade >= 80) {
            if(grade <= 84) {
                System.out.println("B-");
            }if(grade >= 85) {
                if(grade <= 90) {
                    System.out.println("B+");
                }
            }
        }else if (grade>=70) {
            if (grade<=74) {
                System.out.println("c-");
            }if (grade>=75) {
                if (grade<=80) {
                    System.out.println("c+");



               }



           }
        }else if (grade>=60) {
            if ( grade <= 64) {
                System.out.println("D-");
            } if (grade >= 65) {
                if (grade <=69) {
                    System.out.println("D+");
                }
            }
        } else if ( grade >= 0) {
            System.out.println("F");
        }  
	        

	}

}
