package easy;

import java.util.Scanner;

public class Q74 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.close();
        
        // 자릿수 d 꺼내서 max, min 비교하기
        int max = 0;
        int min = 9;

        do {
            int d = (int)(n % 10);
            // max보다 크면 d를 max 값으로 갱신
            if (d > max) {
                max = d;
            }
            // min보다 작으면 d를 min 값으로 갱신
            if (d < min) {
                min = d;
            }
            n /= 10;
        }

        // n > 0인 동안 반복
        while (n > 0);
        
        // max - min 출력
        System.out.println("범위: " + (max - min));
    }
}