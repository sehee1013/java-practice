package easy;

public class Q23 {
    public static void main(String[] args) {
        // k를 1씩 증가하면서 total에 더하기
        // total 합이 100 초과 순간 break.
        // 그때의 k 와 합 출력
        int total = 0;
        int k;
        for (k = 1; ; k++) {
            total += k;
            if (total > 100) {
                break;
            }
        }
        System.out.printf("1 + 2 + ... + k 가 100을 넘는 최초의 k = %d%n", k);
        System.out.printf("(그때의 합 = %d)", total);
    }
}