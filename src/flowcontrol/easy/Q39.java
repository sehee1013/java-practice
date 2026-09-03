package easy;

import java.util.Scanner;

public class Q39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int start = sc.nextInt();
        int end = sc.nextInt();
        int count = 0;

        // 정수 N번 입력 받기
        for (int i = 0; i < n; i++) {

            int numValue = sc.nextInt();
            
            // 입력 받은 정수가 start와 end 사이인 경우 count + 1
            if (start <= numValue && numValue <= end) {
                count++;
            }
        }
        sc.close();
        // 결과 출력
        System.out.printf("구간 내 개수: %d%n", count);

    }
}