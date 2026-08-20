package easy;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        // 요일 입력 받기
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        sc.close();
        // 요일 배열 선언
        String[] days = {
            "월요일 / Monday", "화요일 / Tuesday", "수요일 / Wednesday", 
            "목요일 / Thursday", "금요일 / Friday", "토요일 / Saturday", "일요일 / Sunday"
            };
        
        switch(day) {
            case 1:
                System.out.println(days[0]);
                break;
            case 2:
                System.out.println(days[1]);
                break;
            case 3:
                System.out.println(days[2]);
                break;
            case 4:
                System.out.println(days[3]);
                break;
            case 5:
                System.out.println(days[4]);
                break;
            case 6:
                System.out.println(days[5]);
                break;
            case 7:
                System.out.println(days[6]);
                break;
            default:
                System.out.println("잘못된 입력");
                break;
        }
    }
}

