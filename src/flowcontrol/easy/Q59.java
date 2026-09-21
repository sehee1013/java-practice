package easy;

import java.util.Scanner;

public class Q59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        
        // 소수 플래그 변수
        boolean isPrime = true;
        // 2부터 정수 N - 1까지 순회
        for (int divisor = 2; divisor < n; divisor++) {
            // 딱 나누어 떨어지면 소수 아님
            if (n % divisor == 0) {
                isPrime = false;
            }
        }
        // 결과 출력 
        if (isPrime) {
            System.out.println("소수");
        }
        else {
            System.out.println("소수 아님");
        }
    }
}