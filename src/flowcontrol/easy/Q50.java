package easy;

import java.util.Scanner;

public class Q50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       
        // 첫 입력을 best의 초기값으로 둠
        int best = sc.nextInt();

        // 정수 N-1개 입력 받을 때까지 반복
        for (int i = 0; i < n - 1; i++) {
            // 정수 입력 받기
            int num = sc.nextInt();

            // 절대값 비교해서 갱신
            if (Math.abs(num) > Math.abs(best)) {
                best = num;
            }
        }
        System.out.printf("절댓값 최대의 값: %d\n", best);
        sc.close();
    }
}