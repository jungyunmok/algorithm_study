package ch05_01;

import java.util.Scanner;

// 유클리드 호제법 최대공약수를 비재귀적으로 구하기
public class Ex04_euclidGCDEx {
    // 정수 x, y의 최대공약수를 비재귀적으로 구하여 반환
    static int gcd(int x, int y) {
        while(y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("두 정수의 최대공약수를 구합니다.");

        System.out.print("정수를 입력하세요: ");
        int x = scanner.nextInt();
        System.out.print("정수를 입력하세요: ");
        int y = scanner.nextInt();

        System.out.println("최대공약수는 " + gcd(x, y) + " 입니다.");
    }
}
/*
두 정수의 최대공약수를 구합니다.
정수를 입력하세요: 3
정수를 입력하세요: 18
최대공약수는 3 입니다.
 */