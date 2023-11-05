package ch01_2;

import java.util.Scanner;

// 1부터 n까지의 합 1
public class Ex08_sumVerbose1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;

        System.out.println("1부터 n까지의 합을 구합니다.");

        do {
            System.out.print("n값: ");
            n = scan.nextInt();
        } while (n <= 0);

        int sum = 0; // 합

        for (int i = 1; i <= n; i++) {
            // 실제 else로 빠지는 경우는 단 한번이지만 판단을 계속하기에 비효율적
            if (i < n) {
                // 중간 과정
                System.out.print(i + " + ");
            } else {
                // 마지막 과정
                System.out.print(i + " = ");
            }
            sum += i; // sum에 i를 더함
        }

        System.out.println(sum);
    }
}
