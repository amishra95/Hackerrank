/**
 * 
 */
import java.util.Scanner;
import java.util.HashSet;

/**
 * @author Avanish Mishra
 *
 */
public class TripletsQuestion {
	public static void main(String[] args) {
		
	HashSet<Integer> set = new HashSet<>();
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int d = scan.nextInt();
		int count = 0;
		
	for(int i = 0; i < size; i++) {
		int num = scan.nextInt();
	if(set.contains(num - d) && set.contains(num - 2 *d)) {
		
		count++;
		
	}
	set.add(num);
	}
	scan.close();
	System.out.println(count);
	}

}
