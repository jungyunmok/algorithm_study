package ch05_1;

import java.util.Scanner;

// 배열의 모든 요소의 최대 공약수를 구하기
public class Ex05_GCDArray {
    // 정숫값 x, y의 최대공약수를 비재귀적으로 구하여 반환
    static int gcd(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }

    // 요솟수가 n인 배열 a의 모든 요소의 최대 공약수 구하기
    static int gcdArray(int a[], int start, int no) {
        if (no == 1) {
            return a[start];
        } else if (no == 2) {
            return gcd(a[start], a[start + 1]);
        } else {
            return gcd(a[start], gcdArray(a, start + 1, no - 1));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("몇 개 정수의 최대 공약수를 구할까요?: ");
        int num;
        do {
            num = scanner.nextInt();
        } while (num <= 1);

        int[] x = new int[num]; // 길이가 num인 배열

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = scanner.nextInt();
        }

        System.out.println("최대 공약수는 " + gcdArray(x, 0, num) + "입니다.");
    }
}
/*
몇 개 정수의 최대 공약수를 구할까요?: 3
x[0] : 12
x[1] : 24
x[2] : 36
최대 공약수는 12입니다.
 */