package easy;

import java.util.Scanner;

public class Q71 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.close();
        
        // 10^K 를 for 로 계산. result = n % power.
        // k번 반복
        int power = 1;
        for (int i = 1; i <= k; i++){
            power *= 10;
        }
        // 결과 출력
        int result = n % power;
        System.out.printf("뒤 %d자리: %d", k, result);
    }
}