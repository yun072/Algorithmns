import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in) ;
		
		int N = scan.nextInt();
		int X = scan.nextInt();
		int arr[] = new int[N] ;
		
		for (int i = 0; i < N ; i++) {
			arr[i] = scan.nextInt();
		}
		for (int i = 0; i < N; i++) {
			if (arr[i] < X) {
				System.out.print(arr[i] + " ");
			}
		}
		
       
         }
			

	} 