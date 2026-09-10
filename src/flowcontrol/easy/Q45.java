package easy;

import java.util.Scanner;

public class Q45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        // 1부터 N까지 반복
        for (int num = 1; num <= n; num++) {
            
            // num이 3과 5의 공배수이면 count + 1
            if (num % 3 == 0 && num % 5 == 0) {
                count++;
            }
        }
        sc.close();
        // 결과 출력
        System.out.println("공배수 개수: " + count);
    }
}