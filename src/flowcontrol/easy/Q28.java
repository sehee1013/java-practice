package easy;

import java.util.Scanner;

public class Q28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.close();

        int sum = 0;
        // 1 이상 n 이하
        for (int i = 1; i <= n; i++) {
            // K의 배수만 합산
            if (i % k == 0) {
                sum += i;
            }
        }
        System.out.println(k + "의 배수 합: " + sum);
    }
}

