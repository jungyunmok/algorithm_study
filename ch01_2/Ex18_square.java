package ch01_2;

import java.util.Scanner;

// 정사각형 출력
public class Ex18_square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("정사각형을 출력합니다.");

        // do while로 올바른 n의 값 받을때까지 반복
        do {
            System.out.print("변의 길이: ");
            n = scanner.nextInt();
        } while(n <= 0);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}