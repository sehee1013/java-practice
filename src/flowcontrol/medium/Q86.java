package medium;

import java.util.Scanner;

public class Q86 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        // 1~2n-1 구간을 순회하며 Math.min으로 산 모양 수열 생성
        for (int i = 1; i <= 2*n - 1; i++) {
            System.out.print(Math.min(i,2*n - i));
            // 마지막 요소가 아닌 경우에만 뒤에 " " 출력
            if (i < 2*n - 1) {
                System.out.print(" ");
            }
        }
    }
}