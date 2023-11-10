package ch01_2;

import java.util.Scanner;

// +와 - 번갈아 n번 출력하기
public class Ex10_alternative1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.println("+와 -를 번갈아 n개 출력합니다.");
        System.out.print("n값: ");
        n = scanner.nextInt();

        // for문, 나눗셈, if문 판단을 n번씩 실행함
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.print("+");
            } else {
                System.out.print("-");
            }
        }
        System.out.println();

        // i값을 1부터 시작시키려면 for문 전체를 수정해야함
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print("-");
            } else {
                System.out.print("+");
            }
        }
    }
}
