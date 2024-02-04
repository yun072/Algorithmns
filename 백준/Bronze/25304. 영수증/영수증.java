import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in) ;
		
		int T = scan.nextInt(); // 총 금액
        int A = scan.nextInt(); // 종류의 수
        int total = 0;

        for(int i = 0; i < A; i++){
            int a = scan.nextInt(); // 각 물건의 가격
            int b = scan.nextInt(); // 각 물건의 개수
            total += a * b;
        }
        if(total == T){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
		
	
		
			
		
		
	
			

	}

}