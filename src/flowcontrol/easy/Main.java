package easy;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        // n이하의 2의 거듭제곱을 모두 공백 구분 한 줄 출력
        int current = 1;
        while (current <= n) {
            System.out.print(current + " ");
            current *= 2;
        }
    }
}

