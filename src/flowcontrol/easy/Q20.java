package easy;

import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputValue;
        int sum = 0;
        
        // inputValue 값 입력 받고, sum에 inputValue 더하기
        do {
            inputValue = sc.nextInt();
            sum += inputValue;
        
        } 
        // inputValue가 0이 아닌 동안 반복
        while (inputValue != 0);

        // 0 입력 시 합계 출력 후 종료
        System.out.printf("합계: %d", sum);
        sc.close();
    }
}