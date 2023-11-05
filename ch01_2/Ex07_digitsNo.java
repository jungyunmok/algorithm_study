package ch01_2;

import java.util.Scanner;

// 양의 정수 자릿수 출력
public class Ex07_digitsNo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a;
        do {
            System.out.println("양의 정수를 입력해주세요");
            a = scan.nextInt();
        }
        while(a <= 0);

        int no = 0;
        while(a > 0) {
            a /= 10;
            no++;
        }

        // System.out.println("그 수는 " + String.valueOf(a).length() +"자리입니다.");
        System.out.println("그 수는 " + no + "자리입니다.");
    }
}
