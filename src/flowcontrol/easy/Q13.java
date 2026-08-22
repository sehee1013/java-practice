package easy;

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close(); // 리소스 해제

        // 양수, 짝수 순으로 판별
        // 양수가 아니면 양수 아님 메시지 출력'
        if (n > 0) {
            // 짝수면 양의 짝수 출력
            if (n % 2 == 0) {
                System.out.println("양의 짝수");
            }
            // 홀수면 양의 홀수 출력
            else {
                System.out.println("양의 홀수");
            }
        }
        else {
            System.out.println("양수 아님");
        }
    }
}
