package ch01_1;

import java.util.Scanner;

public class Ex10_judgeABC1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("정수를 입력하세요 => ");
        int n = scan.nextInt();

        if(n == 1) {
            System.out.println("A");
        } else if(n == 2) {
            System.out.println("B");
        } else {
            System.out.println("C");
        }
    }
}
