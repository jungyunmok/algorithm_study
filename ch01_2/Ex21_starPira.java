package ch01_2;

import java.util.Scanner;

// n단의 피라미드 출력하는 메서드
public class Ex21_starPira {
    static void spira(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (i - 1) * 2 + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.println("피라미드를 출력합니다.");

        do {
            System.out.print("단수는: ");
            n = scanner.nextInt();
        } while (n <= 0);

        spira(n);
    }
}

/*
피라미드를 출력합니다.
단수는: 4
   *
  ***
 *****
*******
 */