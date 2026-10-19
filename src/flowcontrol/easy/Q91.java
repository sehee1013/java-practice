package easy;

import java.util.Scanner;

public class Q91 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mode = sc.nextInt();
        double temp = sc.nextDouble();
        sc.close();

        // 모드가 1인 경우 섭씨 -> 화씨로 변환 출력
        if(mode == 1){
            double f = temp * 9 / 5 + 32;
            System.out.printf("%.1f°C = %.1f°F%n", temp, f);
        }

        // 모드가 2인 경우 화씨 -> 섭씨로 변환 출력
        else{
            double c = (temp - 32) * 5 / 9;
            System.out.printf("%.1f°F = %.1f°C%n", temp, c);
        }
    }
}
