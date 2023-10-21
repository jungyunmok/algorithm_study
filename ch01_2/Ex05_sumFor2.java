package ch01_2;

import java.util.Scanner;

// 양수만 입력하여 1부터 n까지 합 구하기
public class Ex05_sumFor2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;

        System.out.println("1부터 n까지의 합을 구합니다.");

        // n이 0보다 클 때까지 반복
        do {
            System.out.print("n값 => ");
            n = scan.nextInt();
        } while (n <= 0);
        // do while문은 while, for문과 달리 끝에 세미콜론(;)을 붙임

        // 합
        int sum = 0;

        for (int i = 1; i <= n; i++)
            sum += i; // sum에 i를 더함

        System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
    }
}
