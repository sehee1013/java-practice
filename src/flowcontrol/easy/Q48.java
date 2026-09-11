package easy;

import java.util.Scanner;

public class Q48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int minValue = Integer.MAX_VALUE;

        // 정수 n개 입력받을 때까지 반복 
        for (int i = 0; i < n; i++) {
            // 정수 입력 받기
            int num = sc.nextInt();

            // num과 minValue 중 작은 값을 대입
            minValue = Math.min(num, minValue);
        }
        sc.close();
        // 결과 출력
        System.out.printf("최솟값: %d\n", minValue);
    }
}