package easy;

import java.util.Scanner;

public class Q37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        // 개수 변수 선언
        int count = 0;

        // 1부터 n까지 반복
        for (int i = 1; i <= n; i++) {
            // i가 K의 배수인 경우 count + 1
            if (i % k == 0) {
                count ++;
            }
        }
        // 결과 출력
        System.out.printf("%d의 배수 개수: %d%n", k, count);
        sc.close();
    }
}