package easy;

import java.util.Scanner;

public class Q72 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        
        // while 로 자릿수 d 꺼내며 sum += d*d.
        int sum = 0;

        do {
            // n을 10으로 나눈 나머지값 제곱하여 sum에 더하기
            int d = n % 10;
            sum += d * d;
            
            // n을 10으로 나눈 몫을 n으로 갱신
            n /= 10;
        }
        // n이 1보다 크거나 같을 때까지 반복
        while (n > 0);

        // 결과 출력
        System.out.println("제곱합: " + sum);
    }
}