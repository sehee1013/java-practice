package easy;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        sc.close(); // 리소스 해제

        switch (day) {
            // 1 ~ 5일: 평일
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("평일");
                break;
            // 6 ~ 7일: 주말
            case 6:
            case 7:
                System.out.println("주말");
                break;
            // 그 외: 잘못된 입력
            default:
                System.out.println("잘못된 입력");
                break;
        }
    }
}

