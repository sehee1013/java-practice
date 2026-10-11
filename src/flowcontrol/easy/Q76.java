package easy;

import java.util.Scanner;

public class Q76 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        // 자릿수가 홀수면 false
        boolean allEven = true;

        do {
            // 자릿수 추출
            int d = n % 10;
            // 홀수 판별
            if (d % 2 != 0) {
                allEven = false;
            }
            // n 갱신
            n /= 10;
        }
        // n > 0 일 때까지 반복
        while (n > 0);
        
        // allEven == true인 경우
        if (allEven) {
            System.out.println("모두 짝수");
        } 
        // allEven == false인 경우 
        else {
            System.out.println("홀수 포함");
        }
        sc.close();
    }
}