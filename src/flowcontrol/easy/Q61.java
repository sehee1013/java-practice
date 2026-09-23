package easy;

import java.util.Scanner;

public class Q61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int limit = Math.min(a, b);
        int gcd = 0;
        sc.close();

        // 1부터 limit까지 반복
        for (int divisor = 1; divisor <= limit; divisor++) {
            // a와 b 둘 다 나누어 떨어지는 수 중 가장 큰 값 찾기
            if (a % divisor == 0 && b % divisor == 0) {
                gcd = divisor;
            }
        }
        // 결과 출력
        System.out.println("GCD: " + gcd);
    }
}