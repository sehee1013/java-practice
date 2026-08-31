package easy;

import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputValue;
        sc.close();
        
        do {
            // inputValue 입력 받기 
            inputValue = sc.nextInt();
        // inputValue < 1 또는 inputValue >100인 동안 반복
        // 조건 충족 못할 시 입력값 출력 후 종료
        } while (1 > inputValue || inputValue > 100);
        System.out.println("입력값: " + inputValue);
    }
}