import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in) ;
		
		int N = scan.nextInt() ;
		
		for(int i = 1 ; i <=N ; i++)
		{
			String str = scan.next();
			System.out.println(str.charAt(0) + "" + str.charAt(str.length()-1));
			
		}
		
		
		
       
         }
			

	}