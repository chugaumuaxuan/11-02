
public class ReTurnInSwitchCase {
	
	public static String toEnglish(int number) {
	    switch (number) {
	        case 0: return "zero";
	        case 1: return "one";
	        case 2: return "two";
	        default: return "many";		        
	    }
	}
	
	public static int toNumber(String Word) {
	    switch (Word) {
	        case "Mot" : return 1;
	        case "Hai": return 2;
	        case "Ba": return 3;
	        default: return 1234;		        
	    }
	}
	
	public static void main(String[] args) {
		
				System.out.println(toEnglish(1));
				System.out.println(toNumber("Mot"));
	}
}
	
