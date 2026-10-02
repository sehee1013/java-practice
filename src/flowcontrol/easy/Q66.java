package easy;

import java.util.Scanner;

public class Q66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        
        // 1부터 min(a, b)까지 순회
        for (int divisor = 1; divisor <= Math.min(a, b); divisor++) {
            // a, b 둘 다 나누어 떨어지면 출력
            if (a % divisor == 0 && b % divisor == 0) {
                System.out.print(divisor + " ");
            }
        }
    }
}