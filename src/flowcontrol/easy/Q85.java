package easy;

import java.util.Scanner;

public class Q85 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        // num 범위 안에서 제곱하며 반복
        for(int i = 1; i * i <= num; i++){

            // 제곱값 출력 후 공백을 기준으로 나누기
            System.out.print(i * i + " ");
        }
    }
}
