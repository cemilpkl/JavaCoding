package programming;

public class IsThereDuplicate {

	public static void main(String[] args) {
		
		
		String str = "give me all the money";
		
		for(int i = 0; i < str.length(); i++) {
			for(int j = i + 1; j < str.length(); j++) {
				if(str.charAt(i) == str.charAt(j)) {
					System.out.println("There is a duplicate character: " + str.charAt(i));
					
					break;
				}
			}
		}
		

	}

}
