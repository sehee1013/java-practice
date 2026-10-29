package easy;

import java.util.Scanner;

public class Q122 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int evenNum = 0;
        int oddNum = 0;
        // num 범위 반복
        for (int i = 0; i < num; i++){

            // 정수 입력받기
            int inputVal = sc.nextInt();

            // 홀수, 짝수 나누어 값 누적하기
            if (inputVal % 2 == 0){
                evenNum += inputVal;
            }
            else {
                oddNum += inputVal;
            }
        }
        // 누적 합이 더 큰 쪽 출력하기
        if (oddNum > evenNum){
            System.out.println("홀수 합이 큼");
        }
        else if (evenNum > oddNum){
            System.out.println("짝수 합이 큼");
        }
        else{
            System.out.println("같음");
        }
        sc.close();
    }
}
