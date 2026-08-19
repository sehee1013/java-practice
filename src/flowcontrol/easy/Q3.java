package easy;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        // 1. 정수 입력
        // 2. 짝수, 홀수 판별 후 출력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close(); // 리소스 해제

        if (n % 2 == 0) {
            System.out.println("짝수");
        }
        else {
            System.out.println("홀수");
        }   
    }
}