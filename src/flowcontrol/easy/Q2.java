package easy;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        // 흐름: 나이 입력 → 18 이상 비교 → 성인 출력
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        sc.close(); // 리소스 해제

        // 18세 이상일 때만 성인 출력
        if (age >= 18) {
            System.out.println("성인입니다");
        }
    }
}

