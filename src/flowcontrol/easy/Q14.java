package easy;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int isMember = sc.nextInt();
        int amount = sc.nextInt();
        sc.close();
        // 회원 여부, 1만원 이상 순으로 판별
        if (isMember == 1) {
            if (amount >= 10000) {
                System.out.println("10% 할인 대상");
            }
            else {
                System.out.println("할인 대상 아님");
            }

        }
        else {
            System.out.println("회원만 할인 가능");
        }
    }
}
