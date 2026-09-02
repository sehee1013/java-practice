package easy;

import java.util.Scanner;

public class Q36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        // 결과값 변수 선언
        int result = 0;

        // 1부터 n까지 반복
        for (int i = 1; i <= n; i++) {
            // i가 홀수면 결과값에 더함
            if (i % 2 != 0) {
                result += i;
            }
            // i가 짝수면 결과값에서 뺌
            else {
                result -= i;
            }
        }
        // 결과 출력
        System.out.println("결과: " + result);
    }
}