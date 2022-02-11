
import java.util.*;

public class VongForEach {

	
	
	public static void main(String[] args) {
		
		int[] array = {0, 1, 2, 3, 4, 5};
		for(int i :array) {
			System.out.println(i);
		}
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Tao");
		list.add("Oi");
		list.add("Chuoi");
		list.add("Dua hau");
		
		for(String s:list) {
			System.out.println(s);
		}
	}
	
	
}
