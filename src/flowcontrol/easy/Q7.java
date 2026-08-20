package easy;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        // 1. 월 입력
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        sc.close(); // 리소스 해제

        // 1 ~ 12 사이 아니면 잘못된 월
        if (!(0 < month && month <= 12)) {
            System.out.println("잘못된 월");
        }
        // 1, 2, 12: 겨울
        else if (month <= 2 || month == 12) {
            System.out.println("겨울");
        }
        // 3, 4, 5: 봄
        else if (month <= 5) {
            System.out.println("봄");
        }
        // 6, 7, 8: 여름
        else if (month <= 8) {
            System.out.println("여름");
        }
        // 9, 10, 11: 가을
        else {
            System.out.println("가을");
        }

    }
}
