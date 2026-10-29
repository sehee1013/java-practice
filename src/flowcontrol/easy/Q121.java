package easy;

import java.util.Scanner;

public class Q121 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int total = 0;
        
        // num 범위 반복
        for (int i = 1; i <= num; i++){

            // 정수 입력받기
            int inputVal = sc.nextInt();

            // i가 짝수인 경우 총 합에서 빼기
            if (i % 2 == 0){
                total -= inputVal;
            }

            // i가 홀수인 경우 합 누적하기
            else{
                total += inputVal;
            }
        }
        // 전체 누적 값 출력
        System.out.println("결과: " + total);
        sc.close();
    }
}
