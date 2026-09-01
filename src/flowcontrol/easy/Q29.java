package easy;

import java.util.Scanner;

public class Q29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int sum = 0;
        // 1부터 n사이의 정수일 때 반복
        for (int i = 1; i <= n; i++) {
            // n을 나누었을 때 딱 떨어지는 수들의 총합 구하기
            if (n % i == 0) {
                sum += i;
            }
        }
        System.out.println("약수 합: " + sum);
    }
}
