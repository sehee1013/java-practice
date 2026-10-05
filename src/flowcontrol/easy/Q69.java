package easy;

import java.util.Scanner;

public class Q69 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.close();
        
        // 변수 선언
        long reversed = 0;
        // n 복사
        long temp = n;

        // temp의 값이 0 이상인 경우 반복
        while (temp > 0){
            // temp % 10 을 reversed에 더하고 reversed * 10
            reversed = reversed * 10 + temp % 10;
            temp /= 10;
        }
        // 결과 출력
        System.out.println("뒤집은 수: " + reversed);
    }
}