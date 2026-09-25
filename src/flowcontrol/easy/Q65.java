package easy;

import java.util.Scanner;

public class Q65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // 약수 쌍 개수 변수
        int count = 0;

        // 1부터 divisor*divisor <= num까지 반복
        for (int divisor = 1; divisor * divisor <= num; divisor++) {
            // n % divisor == 0이면 count + 1
            if (num % divisor == 0) {
                count++;
            }
        }
        sc.close();
        // 결과 출력
        System.out.println("약수 쌍 개수: " + count);
    }
}