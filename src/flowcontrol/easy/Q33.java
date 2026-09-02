package easy;

import java.util.Scanner;

public class Q33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // 양수의 합 변수 선언
        int posSum = 0;

        // n개의 정수를 입력 받을 때까지 반복
        for (int i = 0; i < n; i++) {
            // 정수 입력 받기
            int num = sc.nextInt();
            // 정수가 양수인 경우 posSum에 더하기
            if (num > 0) {
                posSum += num;
            }
        }
        sc.close();
        // 결과 출력
        System.out.printf("양수 합: %d", posSum);
    }
}
