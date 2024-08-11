package ch05_2;

import java.util.Scanner;

// 재귀 함수 이해 - 호출한 횟수 카운트
public class Ex05_recurCount {
    static int count;

    // 재귀 함수
    static void recur(int n) {
        count++;
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

        System.out.println("메서드 호출 횟수: " + count);
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
메서드 호출 횟수: 15
 */