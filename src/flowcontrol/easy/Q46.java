package easy;

import java.util.Scanner;

public class Q46 { // 채점 환경 호환을 위해 클래스명을 Main으로 통일
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long m = sc.nextLong(); // int 대신 long: 큰 입력값 오버플로우 방지

        // 누적합 변수 선언
        long sum = 0;
        // 항 개수 카운트 변수 선언
        long count = 0;

        // 누적합이 m보다 작은 동안 반복
        while (sum <= m) {
            sum += ++count;
        }
        sc.close();
        // 결과 출력하기
        System.out.println("필요한 항 수: " + count);
    }
}