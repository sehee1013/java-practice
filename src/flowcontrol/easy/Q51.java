package easy;

import java.util.Scanner;

public class Q51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 첫 입력 best로 받기
        int best = sc.nextInt();
        
        // 이후 n - 1번 동안 정수 입력 받기
        for (int i = 0; i < n - 1; i++) {
            int currentNum = sc.nextInt();
            // 절대값 작으면 best에 저장
            if (Math.abs(currentNum) < Math.abs(best)) {
                best = currentNum;
            }
        }
        sc.close();
        // 결과 출력
        System.out.printf("0에 가장 가까운 값: %d", best);
    }
}
