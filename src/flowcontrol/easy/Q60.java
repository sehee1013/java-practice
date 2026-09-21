package easy;

import java.util.Scanner;

public class Q60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        sc.close();

        // 1부터 n - 1까지 반복
        for (int divisor = 1; divisor < n; divisor++) {
            // 약수인 경우 sum에 누적
            if (n % divisor == 0) {
                sum += divisor;
            }
        }// sum과 n이 같으면 완전수, 다르면 완전수 아님 출력
        if (sum == n) {
            System.out.println("완전수");
        } else {
            System.out.println("완전수 아님");
        }
    }
}