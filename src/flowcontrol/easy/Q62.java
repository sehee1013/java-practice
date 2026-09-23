package easy;

import java.util.Scanner;

public class Q62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int divisorA = sc.nextInt();
        int divisorB = sc.nextInt();
        sc.close();
        // divisorA 또는 divisorB의 배수 개수
        int count = 0;

        // 1부터 N까지 반복
        for (int num = 1; num <= n; num++) {
            // num이 divisorA 또는 divisorB로 나누어 떨어지면 count + 1
            if (num % divisorA == 0 || num % divisorB == 0) {
                count++;
            }
        }
        
        // 결과 출력
        System.out.println("개수: " + count);
    }
}
