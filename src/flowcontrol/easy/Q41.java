package easy;

import java.util.Scanner;

public class Q41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        // 점수 N번 입력 받을 때까지 반복
        for (int i = 0; i < n; i++) {
            // 점수 입력 받기
            int score = sc.nextInt();
            // 입력 받은 점수가 60점 이상인 경우
            if (score >= 60) {
            
                // count + 1
                count++;

            }
        }
        sc.close();
        // 결과 출력
        System.out.printf("합격자 수: %d", count);
    }
}