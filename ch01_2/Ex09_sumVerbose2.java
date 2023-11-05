package ch01_2;

import java.util.Scanner;

// 1부터 n까지의 합 2
public class Ex09_sumVerbose2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;

        System.out.println("1부터 n까지의 합을 구합니다.");

        do {
            System.out.print("n값: ");
            n = scan.nextInt();
        } while (n <= 0);

        int sum = 0; // 합

        for (int i = 1; i < n; i++) {
            System.out.print(i + " + ");
            sum += i; // sum에 i를 더함
        }

        /*
        System.out.print(n + " = ");
        sum += n; // sum에 n을 더함
        System.out.println(sum);
         */
        // 위의 코드 한 줄로
        System.out.println(n + " = " + (sum += n));
    }
}
