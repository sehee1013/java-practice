package medium;

import java.util.Scanner;

public class Q42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int startYear = sc.nextInt();
        int endYear = sc.nextInt();
        sc.close();
        
        int count = 0;
        // startYear ~ endYear 범위의 연도를 순회
        for (int year = startYear; year <= endYear; year++) {
            // 4 의 배수이면서 100 의 배수가 아닌 해, 또는 400 의 배수인 경우
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                // count + 1
                count++;
            }
        }
        // 결과 출력
        System.out.println("윤년 개수: " + count);
    }
}