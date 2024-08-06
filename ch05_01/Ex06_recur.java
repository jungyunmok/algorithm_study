package ch05_01;

import java.util.Scanner;

// 재귀 함수 이해
public class Ex06_recur {
    // 재귀 함수
    static void recur(int n) {
        if (n > 0) {
            recur(n - 1);
            System.out.println(n);
            recur(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 입력하세요.: ");
        int x = scanner.nextInt();

        recur(x);
    }
}
/*
정수를 입력하세요.: 4
1
2
3
1
4
1
2
 */