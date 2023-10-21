package ch01_2;

import java.util.Scanner;

// a, b를 포함해 그 사이 모든 정수의 합을 구해 반환하는 메소드
public class Ex04_sum2 {
    static int minof(int a, int b) {
        int min = 0;
        int max = 0;

        if (a > b) {
            min = b;
            max = a;
        } else {
            min = a;
            max = b;
        }

        int sum = 0;

        for (int i = min; i <= max; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("a의 값 => ");
        int a = scan.nextInt();
        System.out.print("b의 값 => ");
        int b = scan.nextInt();

        System.out.println("a,b 사이 모든 정수의 합 => " + minof(a, b));
    }
}
