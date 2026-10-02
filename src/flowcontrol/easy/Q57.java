package easy;

import java.util.Scanner;

public class Q57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        // 1부터 n까지 반복
        for (int i = 1; i <= n; i++) {

            // n의 약수인 경우 출력
            if (n % i == 0) {
                System.out.printf("%d ", i);
            }
        }
        System.out.println();
    }
}