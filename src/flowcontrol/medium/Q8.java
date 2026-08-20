package medium;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        // 키, 몸무게 입력
        Scanner sc = new Scanner(System.in);
        double heightCm = sc.nextDouble();
        double weightKg = sc.nextDouble();
        sc.close(); // 리소스 해제

        // 키를 m 로 환산해 BMI 계산.
        double heightM = heightCm / 100;
        double bmi = weightKg / (heightM * heightM);

        String bmiGrade; // 문자열 비만도 등급 변수 선언

        // bmi 구간 별 비만도 분류 후 출력
        if (bmi < 18.5) {
            bmiGrade = "저체중";
        }
        else if (bmi < 23) {
            bmiGrade = "정상";
        }
        else if (bmi < 25) {
            bmiGrade = "과체중";
        }
        else {
            bmiGrade = "비만";
        }
        System.out.printf("BMI: %.2f → %s", bmi, bmiGrade);
    }
}

