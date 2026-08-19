package easy;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        // 1. 점수 입력
        // 2. 60점 이상이면 합격, 아니면 불합격
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        sc.close(); // 리소스 해제

        // 60점 이상이면 "합격" 출력
        if (score >= 60) {
            System.out.println("합격");
        }
        // 60점 미만이면 "불합격" 출력
        else {
            System.out.println("불합격");
        }     
    }
}
