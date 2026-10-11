package easy;

import java.util.Scanner;

public class Q73 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int count = 0;

        // 자릿수 d 꺼내서 짝수 판별, 짝수면 count + 1
        do {
            int d = n % 10;
            if (d % 2 == 0) {
                count++;
            }
            // n 갱신하기
            n /= 10;
        }
        // n > 0인 동안 반복
        while (n > 0);
        
        // 결과 출력
        System.out.println("짝수 자리 개수: " + count);
    }
}