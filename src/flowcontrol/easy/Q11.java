package easy;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        sc.close(); // 리소스 해제
       
        switch (month) {
            // 31일까지인 월 모두 같은 동작
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31일");
                break;
            
            // 30일까지인 월 모두 같은 동작
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30일");
                break;
            
            // 2월은 28일까지
            case 2:
                System.out.println("28일");
                break;
            // 그 외: 잘못된 월
            default:
                System.out.println("잘못된 월");
        }
    }
}

