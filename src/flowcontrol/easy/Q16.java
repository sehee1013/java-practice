package easy;

import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close(); // 리소스 해제
        
        // 누적 계산값 변수 선언
        long sum = 1;
        // 입력받은 수 n까지 반복해서 곱하고 출력
        for (int i = 1; i <= n; i++ ) {
            sum *= i;
        }
        System.out.printf("%d! = %d", n, sum);
    }
}
