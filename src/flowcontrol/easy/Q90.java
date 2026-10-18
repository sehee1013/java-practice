package easy;

import java.util.Scanner;

public class Q90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double inch = sc.nextDouble();
        sc.close();

        // inch 를 cm 단위로 바꾸기
        double cm = inch * 2.54;

        // 바꾼 단위 출력
        System.out.printf("%.2f cm", cm);
    }
}