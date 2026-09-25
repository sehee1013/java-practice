package easy;

import java.util.Scanner;

public class Q64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = num;

        // 2부터 num-1까지 반복
        for (int divisor = 2; divisor < num; divisor++) {
            // result보다 작으면 대입
            if (num % divisor == 0 && divisor < result) {
                result = divisor;
            }
        }
        sc.close();
        // 결과 출력
        System.out.println("최소 진약수: " + result);
    }
}