package easy;

import java.util.Scanner;

public class Q68 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int product = 1;
 
        // n 복사하기
        int copyNum = n;
        // copy_num이 0보다 크면 반복
        while (copyNum > 0) {
            // 자릿수 뒤에서부터 차례대로 곱하기
            int digit = copyNum % 10;
            product *= digit;

            // copyNum값 갱신
            copyNum /= 10;
        }
        // 결과 출력
        System.out.println("자릿수 곱: " + product);
    }
}