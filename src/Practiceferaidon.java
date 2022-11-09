
public class Practiceferaidon {

	public static void main(String[] args) {

//      nested if else; if (condition){
//      statement;}

		int grade = 49;

		if (grade <= 100 && grade >= 90) {
			if (grade >= 95) {
				System.out.println("A+");
			} else {
				System.out.println("A-");
			}

		} else if (grade < 90 && grade >= 80) {
			if (grade >= 85) {
				System.out.println("B+");

			} else {
				System.out.println("B-");
			}
		} else {
			System.out.println("You are out of the range");
			
		
		}

	}

}
