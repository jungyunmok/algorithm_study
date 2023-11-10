package ch01_2;

import java.util.Scanner;

public class Ex11_alternative2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.println("+와 -를 번갈아 n개 출력합니다.");
        System.out.print("n값: ");
        n = scanner.nextInt();

        // for문을 n/2번, 나눗셈 2번, if문 판단을 1번 함
        for (int i = 0; i < n / 2; i++) {
            System.out.print("+-");
        }
        if (n % 2 != 0) {
            System.out.print("+");
        }
        System.out.println();

        // i값을 1부터 시작시켜도 초기화 부분만 변경하면 됨
        for (int i = 1; i <= n / 2; i++) {
            System.out.print("+-");
        }
        if (n % 2 != 0) {
            System.out.print("+");
        }
    }
}
