package easy;

import java.util.Scanner;

public class Q44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // 홀수 카운트 변수 선언
        int count = 0;
        
        // 정수 n개 입력 받을 때까지 반복
        for (int i = 0; i < n; i++) {
            
            // 정수 입력 받기
            int num = sc.nextInt();
            
            // 입력값 홀수 판별 후 카운트
            if (num % 2 != 0) {
                count++;
            }
        }
        sc.close();
        // 결과 출력
        System.out.println("홀수 개수: " + count);
    }
}