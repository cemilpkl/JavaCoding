package programming;

public class MakeItReversed {

	public static void main(String[] args) {
		
		String str = "Cemil Pekel QA Engineer";
		String duplivateValue ="";
		
		
		String[] wordsInStrings = str.split(" ");
		
		StringBuilder reverse = new StringBuilder();
		
		for(int i=wordsInStrings.length-1; i>=0; i--) {
			
			reverse.append(wordsInStrings[i]).append(" ");
			
		}
		System.out.println("Before Reversed: "+ str);
		System.out.println("After Reversed: "+ reverse);
		}

}
