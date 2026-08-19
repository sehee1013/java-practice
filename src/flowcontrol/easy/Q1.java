package easy;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close(); // 리소스 해제
        
        //if 한 개로 n 이 양수일 때만 "양수입니다" 를 출력하세요.
        if (n > 0) {
            System.out.println("양수입니다");
        }
    }
}
