package ch01_2;

import java.util.Scanner;

// while문으로 1부터 n까지 합 구하기
public class Ex01_sumWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.print("n값 => ");
        int n = scan.nextInt();

        int sum = 0; // 합
        int i = 1;

        // i가 n 이하면 반복(n까지 더함)
        while (i <= n) {
            sum += i; // sum에 i를 더함
            i++; // i값을 1만큼 증가시킴
        }
        System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
        System.out.println("i값 => " + i); // n+1이 됨
    }
}
