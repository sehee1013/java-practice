package medium;

import java.util.Scanner;

public class Q52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // max 변수 선언
        int maxValue = Integer.MIN_VALUE;
        // second  변수 선언
        int secondValue = Integer.MIN_VALUE;

        // n번 정수 입력 받을 때까지 반복
        for (int i = 0; i < n; i++) {

            // 정수 입력 받기
            int currentNum = sc.nextInt();

            // currentNum이 maxValue보다 크면 secondValue = maxValue, maxValue = currentNum
            if (currentNum > maxValue) {
                secondValue = maxValue;
                maxValue = currentNum;

            }
            // 그 외에 secondValue보다 크면 secondValue = currentNum
            else if (currentNum > secondValue) {
                secondValue = currentNum;
            }
        }
        sc.close();
        // 결과 출력
        System.out.printf("두 번째로 큰 값: %d\n", secondValue);
    }
}
