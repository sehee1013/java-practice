package easy;

import java.util.Scanner;

public class Q31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        // 홀수 합과 짝수 합 변수 선언
        int oddSum = 0;
        int evenSum = 0;

        // 1부터 N까지 반복
        for (int i = 1; i <= n; i++) {
            // 짝수인 경우 짝수 합에 더함
            if (i % 2 == 0) {
                evenSum += i;
            }
            // 홀수인 경우 홀수 합에 더함
            else {
                oddSum += i;
            }
        }
        // 결과 출력
        System.out.println("홀수 합: " + oddSum);
        System.out.println("짝수 합: " + evenSum);
    }
}
