package easy;

import java.util.Scanner;

public class Q43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        int digit = sc.nextInt();
        sc.close();
        int count = 0; // 자릿수 등장 횟수 카운트

        // 입력값이 0인 경우
        if (num == 0) {
            if (digit == 0) {count = 1;}
        }
        else {
            // num이 0보다 클 때까지 반복
            while (num > 0) {
                // num % 10이 digit랑 같을 때 count + 1
                if (num % 10 == digit) {
                    count++;
                }
                num /= 10;
            }
        }
        // 결과 출력
        System.out.println("등장 횟수: " + count);
    }
}