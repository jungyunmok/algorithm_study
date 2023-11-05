package ch01_2;

import java.util.Scanner;

// a와 b값 입력받아 b-a 출력
public class Ex06_difference {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("a값: ");
        int a = scan.nextInt();

        /*
        System.out.print("b값: ");
        int b = scan.nextInt();

        if(b <= a) {
            System.out.println("a보다 큰 값을 입력하세요!");
            System.out.print("b값: ");
            b = scan.nextInt();
        }
        */

        // while문 사용
        int b;
        while(true) {
            System.out.print("b값: ");
            b = scan.nextInt();
            if(b > a) break;
            System.out.println("a보다 큰 값을 입력하세요!");
        }

        System.out.println("b-a는 " + (b-a) + "입니다.");
    }
}
