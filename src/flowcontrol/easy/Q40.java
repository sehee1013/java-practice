package easy;

import java.util.Scanner;

public class Q40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // 양수, 음수 카운터 변수 선언
        int posCount = 0;
        int negCount = 0;
        
        // N번 입력 받을 때까지 반복
        int i = 0;
        while (i < n) {

            // 정수 입력 받기
            int num = sc.nextInt();

            // 양수인 경우 양수 카운터 + 1
            if (num > 0) {
                posCount += 1;
            }
            // 음수인 경우 음수 카운터 + 1
            else if (num < 0) {
                negCount += 1;
            }
            i++;
        }
        sc.close();

        // 결과 출력
        System.out.println("양수: " + posCount);   
        System.out.println("음수: " + negCount);   
    }
}