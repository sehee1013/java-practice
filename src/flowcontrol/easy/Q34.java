package easy;

import java.util.Scanner;

public class Q34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        // 제곱합 변수 선언
        int sum = 0;
        // 1부터 N까지 반복
        for (int i = 1; i <= n; i++) {
            // 제곱한 값을 sum에 더함
            sum += i * i;
        }
        // 결과 출력 
        System.out.println("제곱합: " + sum);
    }
}