package easy;

import java.util.Scanner;

public class Q75 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.close();
        
        boolean hasZero = false;
        do {
            int d = (int)(n % 10);
            // 0이면 true
            if (d == 0) {
                hasZero=true;
            }
            // n 갱신
            n /= 10;
        }

        // n > 0 일 때까지 반복
        while (n > 0);

        // 결과 출력
        if (hasZero) {
            System.out.println("있음");
        }
        else {
            System.out.println("없음");
        }
    }
}