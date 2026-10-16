package easy;

import java.util.Scanner;

public class Q77 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minVal = sc.nextInt();
        int maxVal = sc.nextInt();
        sc.close();

        // minVal부터 maxVal까지 1씩 증가 반복
        for (int i = minVal; i <= maxVal; i++) {
            if (i < maxVal) {
                System.out.print(i + " ");
            }
            else {
                System.out.print(i);
            }
        }
    }
}