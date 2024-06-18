package ch02_1;

import java.util.Scanner;

// 배열b의 모든 요소를 배열a에 복사하는 메서드
public class Ex09_copy {
    // 배열 b의 모든 요소를 배열 a에 복사
    static void copy(int[] a, int[] b) {
        int num = a.length <= b.length ? a.length : b.length;
        for (int i = 0; i < num; i++) {
            a[i] = b[i];
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("a의 요솟수는 : ");
        int numA = scanner.nextInt(); // 요솟수
        int[] a = new int[numA]; // 요솟수가 num인 배열

        for (int i = 0; i < numA; i++) {
            System.out.print("a[" + i + "]: ");
            a[i] = scanner.nextInt();
        }

        System.out.print("b의 요솟수는 : ");
        int numB = scanner.nextInt(); // 요솟수
        int[] b = new int[numB]; // 요솟수가 num인 배열

        for (int i = 0; i < numB; i++) {
            System.out.print("b[" + i + "]: ");
            b[i] = scanner.nextInt();
        }

        copy(a, b);

        System.out.println("배열 b의 모든 요소를 배열 a에 copy 하였습니다.");
        for (int i = 0; i < numA; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }
    }
}

/*
a의 요솟수는 : 2
a[0]: 1
a[1]: 2
b의 요솟수는 : 3
b[0]: 5
b[1]: 4
b[2]: 3
배열 b의 모든 요소를 배열 a에 copy 하였습니다.
a[0] = 5
a[1] = 4
 */