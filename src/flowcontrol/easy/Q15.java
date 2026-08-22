package easy;

import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // total 변수 선언하여 1부터 입력받은 수 n 사이의 모든 짝수의 합 구하기
        // 1부터 n까지 반복 -> 짝수인 경우 total에 더하기
        int total = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                total += i;
            }
        }
        System.out.printf("짝수 합: %d", total);
    }
}

