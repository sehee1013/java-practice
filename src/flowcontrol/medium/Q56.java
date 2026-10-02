package medium;

import java.util.Scanner;

public class Q56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        // 첫 입력 prev에 대입
        int prev = sc.nextInt();
        int maxProduct = Integer.MIN_VALUE;
        
        // n번 정수 입력 받기
        for (int i = 1; i < n; i++) {
            // 이웃한 두 값의 곱으로 최댓값 갱신
            int cur = sc.nextInt(); 
            maxProduct = Math.max(maxProduct, prev * cur);
            prev = cur;
        }
        sc.close();
        System.out.println("연속 두 값의 최대 곱: " + maxProduct);
    }
}