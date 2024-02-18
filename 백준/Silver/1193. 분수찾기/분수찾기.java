import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int num = scan.nextInt();
       int g = 0; // 몇 번째 그룹?  
       
       // 층 수
       while(num-g > 0) {
          num -= g;
          g++;
       }
       
       int box = num; // 몇 번째 칸?
       int sum = g+1; // 분모와 분자의 합
       int m=0; // 분모
       int c=0; // 분자
       
       // 홀수층
       if(g%2==1) {
          m = box;
          c = sum-box;
       }
       
       //짝수층
       if(g%2==0) {
          m = box;
          c = sum - box;
       }
       
       System.out.println(c +"/" + m);
    } 
}
