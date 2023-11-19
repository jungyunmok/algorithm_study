package ch01_2;

import java.util.Scanner;

// 왼쪽 아래가 직각인 이등변삼각형 출력
public class Ex19_triangleLB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.println("왼쪽 아래가 직각인 이등변삼각형을 출력합니다.");

        // 직각이등변삼각형의 단수 입력
        do {
            System.out.print("몇 단 삼각형입니까? ");
            n = scanner.nextInt();
        } while (n <= 0);

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
