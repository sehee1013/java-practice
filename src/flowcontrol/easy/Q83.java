package easy;

import java.util.Scanner;

public class Q83 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        // num 범위 반복
        for(int i = 1; i <= num; i++){
 
            // i 값이 num과 같아지면 마지막에 "," 붙여 출력
            if(i == num){
                System.out.print(i + ".");
            }
            else{
                System.out.print(i + ", ");
            }
        }
    }
}