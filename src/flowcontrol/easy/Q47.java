package easy;

import java.util.Scanner;

public class Q47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = Integer.MIN_VALUE;

        // 정수 n개 받을 때까지 반복
        for (int i = 0; i < n; i++) {
            
            // 정수 입력 받기
            int num = sc.nextInt();

            // max와 num 중 더 큰 값을 반환
            max = Math.max(max, num);
        }
        // 결과 출력
        System.out.printf("최댓값: %d", max); 
        
        sc.close();
    }
}