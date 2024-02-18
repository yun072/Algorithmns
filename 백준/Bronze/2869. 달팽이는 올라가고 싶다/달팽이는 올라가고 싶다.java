
import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
 
		Scanner scan = new Scanner(System.in);
 
		int u = scan.nextInt();		
		int d = scan.nextInt();	
		int length = scan.nextInt(); 	
 
		int day = (length - d) / (u - d);
        
		
		if ((length - d) % (u - d) != 0) {
			day++;
		}
		System.out.println(day);
	}
}