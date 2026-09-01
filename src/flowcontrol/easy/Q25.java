package easy;

import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        // i가 n 이하이면 반복
        for (int i = 0; i <= n; i++) {
            // i 가 3 의 배수면 continue, 그 외에는 sum 에 i 누적
            if (i % 3 == 0) {
                continue;
            }
            sum += i;
        }
        sc.close();
        // 결과 출력
        System.out.println("합계: " + sum);
    }
}
