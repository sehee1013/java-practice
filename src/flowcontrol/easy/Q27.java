package easy;

import java.util.Scanner;

public class Q27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        sc.close();
        // start부터 end 사이의 숫자들의 합 구하기
        // start 이상, end 이하인 정수 i를 sum에 더하기 반복 후 결과 출력  
        int sum = 0;

        for (int i = start; i <= end;i++) {
            sum += i;
        }
        System.out.println("합계: " + sum);
    }
}

