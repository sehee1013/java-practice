package easy;

import java.util.Scanner;

public class Q49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        // maxValue와 minValue 변수 선언
        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;

        // 정수 n번 입력 받을 때까지 반복
        for (int i = 0; i < n; i++) {
            
            // 정수 입력 받기
            int num = sc.nextInt();
            // 단일 순회로 최댓값과 최솟값 동시에 구함
            maxValue = Math.max(num, maxValue);
            minValue = Math.min(num, minValue);
        }
        sc.close();
        // 결과 출력
        System.out.printf("최댓값: %d\n", maxValue);
        System.out.printf("최솟값: %d\n", minValue);
    }

}