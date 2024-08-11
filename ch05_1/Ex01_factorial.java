package ch05_1;

import java.util.Scanner;

// 팩토리얼값을 재귀적으로 구함
public class Ex01_factorial {
    // 음이 아닌 정수 n의 팩토리얼 값 반환
    static int factorial(int n) {
        if(n > 0) {
            return n * factorial(n - 1);
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 입력하세요.: ");
        int x = scanner.nextInt();

        System.out.println(x + "의 팩토리얼은 " + factorial(x) + "입니다.");
    }
}

/*
정수를 입력하세요.: 3
3의 팩토리얼은 6입니다.
 */