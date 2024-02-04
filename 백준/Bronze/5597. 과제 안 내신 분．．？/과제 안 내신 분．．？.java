import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in) ;
		int[] student = new int [31] ;
		
		for(int i=1 ; i<29 ; i++) {
			int ad  = scan.nextInt();
			student[ad] = 1;
			
		}
		for(int i =1 ; i< student.length; i++) {
			if(student[i]!= 1) {
				System.out.println(i);
			}
		}
	} 
}


