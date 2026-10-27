package easy;

import java.util.Scanner;

public class Q97 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        // num 값으로 1 이상이 들어올 때 까지 반복 입력
        do{
            num = sc.nextInt();
        }
        while(num <= 0);
        // 최종 입력값 출력
        System.out.println("입력값: " + num);
        sc.close();
    }
}
