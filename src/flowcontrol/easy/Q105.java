package easy;

import java.util.Scanner;

public class Q105 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0, count = 0;

        // count가 num보다 커질때까지 반복
        while(count < num){

            // 정수 val 입력받기
            int val = sc.nextInt();

            // 0이 아닌 경우면 합하기
            if(val != 0){
                sum += val;
                count++;
            }
        }
        // 누적 합 출력
        System.out.println("합계: " + sum);
        sc.close();
    }
}
