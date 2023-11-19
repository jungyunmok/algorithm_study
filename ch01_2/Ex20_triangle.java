package ch01_2;

import java.util.Scanner;

// 직각이등변삼각형 출력하는 메서드
public class Ex20_triangle {
    // 왼쪽 아래가 직각인 이등변삼각형
    static void triangleLB(int n) {
        System.out.println("왼쪽 아래가 직각인 이등변삼각형");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 왼쪽 위가 직각인 이등변삼각형
    static void triangleLU(int n) {
        System.out.println("왼쪽 위가 직각인 이등변삼각형");
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 오른쪽 위가 직각인 이등변삼각형
    static void triangleRU(int n) {
        System.out.println("오른쪽 위가 직각인 이등변삼각형");
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 오른쪽 아래가 직각인 이등변삼각형
    static void triangleRB(int n) {
        System.out.println("오른쪽 아래가 직각인 이등변삼각형");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("삼각형을 출력합니다.");

        do {
            System.out.print("단수는: ");
            n = scanner.nextInt();
        } while (n <= 0);
        triangleLB(5);
        triangleLU(5);
        triangleRU(5);
        triangleRB(5);
    }
}
