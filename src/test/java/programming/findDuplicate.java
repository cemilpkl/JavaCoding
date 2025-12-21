package programming;

public class findDuplicate {

	public static void main(String[] args) {
		
		String str = "Kader ayirdi bizi";
		String duplicateValue = "";
		
		
		
		for(int i=0; i<str.length(); i++) {
			
			for(int j=i+1; j<str.length(); j++) {
				
				
				if(str.charAt(j)==str.charAt(i)) {
					
					duplicateValue+= str.charAt(i)+ ", ";
					break;
				}
				
			}
		}
		
		
		System.out.println("Duplicate values: "+duplicateValue);
	}

}
