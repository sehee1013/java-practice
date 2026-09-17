package easy;

import java.util.Scanner;

public class Q54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int maxDigit = 0; // 자릿수 최댓값 저장 변수

        // num이 0보다 크면 반복
        while (num > 0) { 
            // digit % 10 값과 maxDigit 값 비교해서 크면 대입
            int digit = num % 10;
            if (digit > maxDigit) {
                maxDigit = digit;
            }
            num /= 10;
        }
        sc.close();
        // 결과 출력
        System.out.println("자릿수 최댓값: " + maxDigit);
    }
}