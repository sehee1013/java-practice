package easy;

import java.util.Scanner;

public class Q55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // maxValue, minValue 변수 선언
        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;

        // 정수 n개 입력 받을 때까지 반복
        for (int i = 0; i < n; i++) {
            
            int currentNum = sc.nextInt(); 

            // currentNum과 비교 후 최댓값, 최솟값 동시 할당
            maxValue = Math.max(currentNum, maxValue);
            minValue = Math.min(currentNum, minValue);
        }
        sc.close();
        // 두 수의 차 출력
        System.out.printf("차이: %d%n", maxValue - minValue);
    }
}