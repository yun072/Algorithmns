import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in) ;
		while(true){					
        
		int a = scan.nextInt();
        int b = scan.nextInt();

        if(a == 0 && b == 0){		
        break;
         }
        System.out.println(a + b);
         }
			

	}

}