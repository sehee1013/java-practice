package easy;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        // 1. 월 입력 받기
        // 특정 월 메시지 출력
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        sc.close(); // 리소스 해제

        // 3월: 새 학기
        if (month == 3) {
            System.out.println("새 학기");
        }
        // 6월: 여름 방학
        else if (month == 6) {
            System.out.println("여름 방학");
        }
        // 9월: 2학기
        else if (month == 9) {
            System.out.println("2학기");
        }
        // 12월: 겨울 방학
        else if (month == 12) {
            System.out.println("겨울 방학");
        }
    }
}
