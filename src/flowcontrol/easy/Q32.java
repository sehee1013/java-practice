package easy;

import java.util.Scanner;

public class Q32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // 정수 합 변수 선언
        int sum = 0;

        // N개의 정수 입력 받을 때가지 반복
        for (int i = 0; i < n; i++) {
            // 정수 입력 받기
            int num = sc.nextInt();
            // 입력 받은 정수 sum에 더하기
            sum += num;
        }
        sc.close();
        // 정수의 합 출력
        System.out.printf("합계: %d", sum);
    }
}
