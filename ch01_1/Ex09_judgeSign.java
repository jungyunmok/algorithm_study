package ch01_1;

import java.util.Scanner;

// 정숫값 부호 판단
public class Ex09_judgeSign {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("정수를 입력하세요 => ");
        int n = scan.nextInt();

        if(n>0) {
            System.out.println("이 수는 양수입니다.");
        } else if(n<0) {
            System.out.println("이 수는 음수입니다.");
        } else {
            System.out.println("이 수는 0입니다.");
        }
    }
}
