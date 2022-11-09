
public class While {

	public static void main(String[] args) {
		
		String givenstring = "This is A Test";
	    int countofvowels = 0;
		int index = 0;
		while (index< givenstring.length()) {
		char c = givenstring.toLowerCase().charAt(index++);
		
		if (c== 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				++countofvowels;
		} 
		
			 
			
		}
			
		System.out.println(" we have"  + countofvowels  + "vowel character the given String!");

	}

}
