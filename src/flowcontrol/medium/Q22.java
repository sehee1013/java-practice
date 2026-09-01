package medium;

import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        sc.close();
        
        // 바깥 for: 단 반복 출력, 안쪽 for: 1~9까지 출력
        for (int dan = start; dan <= end;dan++ ) {
            for (int i = 1; i <= 9; i++) {
                System.out.printf("%d x %d = %d%n", dan, i, dan * i);
            }
            // 빈 줄 출력으로 시각적 구분
            System.out.println();
        }
    }
}

