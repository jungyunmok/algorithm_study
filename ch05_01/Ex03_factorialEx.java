package ch05_01;

import java.util.Scanner;

// 비재귀적 팩토리얼
public class Ex03_factorialEx {
    // 음이 아닌 정수 n의 팩토리얼 값 반환
    static int factorial(int n) {
        int temp = 1;
        while(n > 0) {
            temp *= n--;
        }
         return temp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 입력하세요: ");
        int x = scanner.nextInt();

        System.out.println(x + "의 팩토리얼은 " + factorial(x) + "입니다.");
    }
}
/*
정수를 입력하세요: 4
4의 팩토리얼은 24입니다.
 */