package ch01_1;

import java.util.Scanner;

public class Ex11_judgeABC2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("정수를 입력하세요 => ");
        int n = scan.nextInt();

        if(n == 1) {
            System.out.println("A");
        } else if(n == 2) {
            System.out.println("B");
        } else if(n == 3) {
            System.out.println("C");
        }
        // 아무 작업도 하지 않는 else가 숨어있음
        else;
    }
}
