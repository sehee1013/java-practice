package easy;

import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close(); // 리소스 해제
        
        // 자릿수 변수 선언
        int digits = 0;

        // 입력받은 값 n을 10씩 나누어 자릿수 +1 하여 구하기.
        while (n > 0) {
            n /= 10;
            digits++;
        }
        System.out.println(digits + "자리");
    }
}
