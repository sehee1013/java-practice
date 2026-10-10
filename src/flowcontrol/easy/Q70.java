package easy;

import java.util.Scanner;

public class Q70 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        
        // n 복사해서 복사본으로 맨 앞자리 구하기
        int firstDigit = n;

        // 복사본이 10보다 크거나 같을 때까지 반복
        while (firstDigit >= 10) {
            // 10으로 나눈 몫으로 갱신
            firstDigit /= 10;
        }

        // 결과 출력
        System.out.printf("맨 앞 자리: %d", firstDigit);
    }
}