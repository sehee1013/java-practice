package easy;

import java.util.Scanner;

public class Q67 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = Integer.MAX_VALUE;
        sc.close();
        
        // n 복사하기
        int copy_num = n;
        // copy_num 이 0보다 작아질 때까지 min 갱신 
        while (copy_num > 0) {
            min = Math.min(copy_num % 10, min);
            copy_num /= 10;
        }
        // 결과 출력
        System.out.println("자릿수 최솟값: " + min);
    }
}
