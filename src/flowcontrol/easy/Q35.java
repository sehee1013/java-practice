package easy;

import java.util.Scanner;

public class Q35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;

        // 점수 n 번 입력 받기
        for (int i = 0; i < n; i++) {
            int score = sc.nextInt();

            // 입력 받은 점수 sum에 누적
            sum += score; 
        }
        // 평균 계산 후 출력
        double average = (double) sum / n;
        
        sc.close();

        // 결과 출력
        System.out.printf("평균: %.2f%n", average);
    }
}