package easy;

import java.util.Scanner;

public class Q87 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        sc.close();

        // 1시간 = 3600초 기준으로 시간, 분, 초 분리
        int h = total / 3600;
        int rem = total % 3600;
        int m = rem / 60;
        int s = rem % 60;
        
        // 결과 출력
        System.out.print(h + "시간 " + m + "분 " + s +"초");
    }
}