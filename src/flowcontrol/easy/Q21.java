package easy;

import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        sc.close();
        
        // 바깥 for : rows 번, 안쪽 for : cols 번 print("*"). 행 끝에 줄바꿈.
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("*");
            }
            // 줄 바꿈
            System.out.println();
        }
    }
}

