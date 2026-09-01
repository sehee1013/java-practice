package easy;

import java.util.Scanner;

public class Q30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        // 자릿수 합 변수 선언
        int sum = 0;

        // n이 0보다 크면 반복
        while (n > 0) {
            // n을 10으로 나누었을 때의 나머지를 sum에 더하기
            sum += n % 10;
            n /= 10;
        }
        
        // 결과 출력
        System.out.println("자릿수 합: " + sum);
    }
}

