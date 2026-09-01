package easy;

import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        // while (true) 로 열고, num == 0 이면 break.
        // 그렇지 않으면 sum += num.
        // 종료 후 "합계: <sum>" 출력.
        while (true) {
            int num = sc.nextInt();
            
            if (num == 0) {
                break;
            }
            sum += num;
        }
        sc.close();
        System.out.println("합계: " + sum);
    }
}

