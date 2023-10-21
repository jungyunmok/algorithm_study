package ch01_2;

import java.util.Scanner;

// 가우스의 덧셈 사용해 1부터 n까지의 합 구하기
public class Ex03_sum1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.print("n값 => ");
        int n = scan.nextInt();

        // 1~10 합은 (1+10)*5
        // 1~11 합은 (1+11)*5+6
        int sum = (n + 1) * (n / 2) + (n % 2 == 0 ? 0 : (n + 1) / 2);

        System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
    }
}
