package easy;

import java.util.Scanner;

public class Q53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // max 변수 선언
        int max = Integer.MIN_VALUE;
        // maxIndex 변수 선언
        int maxIndex = 0;
        // 정수 n번 입력 받기
        for (int i = 1; i < n + 1; i++) {
            int num = sc.nextInt();

            // max보다 num이 더 크면 갱신
            if (num > max) {
                // 그 때의 i값을 maxIndex로 갱신
                max = num;
                maxIndex = i;
            }
        }
        sc.close();
        // 결과 출력
        System.out.printf("최댓값의 위치: %d", maxIndex);
    }
}