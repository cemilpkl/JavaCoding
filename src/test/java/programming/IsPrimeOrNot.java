package programming;

public class IsPrimeOrNot {

	public static void main(String[] args) {

		//Prime number divisible by 1 and itself

		int number = 7;
		int count = 0;
		
		
		for(int i=1;  i<=number; i++) {
			
			
			if(number%i==0) {
				count++;
			}
		}
			
		
		if(count==2) {
			System.out.println("Prime");
		} else {
			
			System.out.println("Not a prime");
			
		}

	}

}
