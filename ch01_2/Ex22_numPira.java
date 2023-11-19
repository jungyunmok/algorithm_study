package ch01_2;

import java.util.Scanner;

// n단의 숫자 피라미드 출력하는 메서드
public class Ex22_numPira {
    static void npira(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (i - 1) * 2 + 1; j++) {
                System.out.print(i % 10);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.println("숫자 피라미드를 출력합니다.");

        do {
            System.out.print("단수는: ");
            n = scanner.nextInt();
        } while (n <= 0);

        npira(n);
    }
}

/*
숫자 피라미드를 출력합니다.
단수는: 4
   1
  222
 33333
4444444
 */