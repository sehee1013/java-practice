package easy;

import java.util.Scanner;

public class Q63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = 0;
        sc.close();

        // 1부터 num-1까지 반복
        for (int divisor = 1; divisor < num; divisor++) {
            // 약수인 경우 result에 대입
            if (num % divisor == 0) {
                result = divisor;
            }
        }
        // 결과 출력
        System.out.println("가장 큰 진약수: " + result);
    }
}