package easy;

import java.util.Scanner;

public class Q38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int divisorCount = 0;
        sc.close();

        // 1부터 n까지 반복
        for (int i = 1; i <= n; i++) {
            // n을 나눴을 때 나머지가 0이면 divisorCount + 1
            if (n % i == 0) {
                divisorCount++;
            }
        }
        // 결과 출력
        System.out.println("약수 개수: " + divisorCount);
    }
}
