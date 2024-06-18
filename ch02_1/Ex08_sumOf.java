package ch02_1;

import java.util.Scanner;

// 배열의 모든 요소의 합계를 구하여 반환
public class Ex08_sumOf {
    // 배열의 요솟값을 출력
    static int sumOf(int[] a) {
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            result += a[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("요솟수는 : ");
        int num = scanner.nextInt(); // 요솟수
        int[] a = new int[num]; // 요솟수가 num인 배열

        for (int i = 0; i < num; i++) {
            System.out.print("a[" + i + "]: ");
            a[i] = scanner.nextInt();
        }

        System.out.println("모든 요소의 합계는 " + sumOf(a) + "입니다.");
    }
}

/*
요솟수는 : 3
a[0]: 1
a[1]: 2
a[2]: 3
모든 요소의 합계는 6입니다.
 */
