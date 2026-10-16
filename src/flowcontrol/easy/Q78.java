package easy;

import java.util.Scanner;

public class Q78 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minVal = sc.nextInt();
        int maxVal = sc.nextInt();
        sc.close();

        // maxVal부터 minVal가 될 때까지 1씩 감소 반복
        for (int i = maxVal; i >= minVal; i--) {
            if (i > minVal) {
                System.out.print(i + " ");
            }
            else {
                System.out.print(i);
            }
        }
    }
}