package ch01_2;

import java.util.Scanner;

// *를 n개 출력하며 w개마다 줄바꿈1
public class Ex13_printStars2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, w;

        System.out.println("*를 n개 출력하되 w개마다 줄을 바꿔서 출력합니다.");

        do {
            System.out.print("n값: ");
            n = scanner.nextInt();
        } while (n <= 0);

        do {
            System.out.print("w값: ");
            w = scanner.nextInt();
        } while ((w <= 0 || w > n));

        // for문을 n/w번, if문 판단을 한번 실행
        for (int i = 0; i < n / w; i++) {
            System.out.println("*".repeat(w));
        }

        int rest = n % w;
        if (rest != 0) {
            System.out.println("*".repeat(rest));
        }
    }
}