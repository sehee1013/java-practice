package easy;

import java.util.Scanner;

public class Q26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // i가 1이상 N 이하일 때 반복
        for (int i = 1; i <= n; i++) {
            // 짝수면 continue, 홀수면 공백 구분으로 출력
            if (i % 2 == 0) {
                continue;
            }
            // 맨 앞 공백 출력 차단
            if (i > 1){
                System.out.print(" ");
            }
            System.out.print(i);
        }
        sc.close();
    }
}
