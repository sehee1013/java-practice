package easy;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        // 1. 점수 입력
        // 2. 점수 구간 별 장학금 지급 
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        sc.close(); // 리소스 해제

        // 95점 이상: 전액 장학금
        if (score >= 95) {
            System.out.println("전액 장학금");
        }
        // 85점 이상 95점 미만: 반액 장학금
        else if (score >= 85) {
            System.out.println("반액 장학금");
        }
        // 75점 이상 85점 미만: 기숙사 장학금
        else if (score >= 75) {
            System.out.println("기숙사 장학금");
        }
        // 그 외: 장학금 없음, 출력 X
    }
}
