package ch02_1;

import java.util.Scanner;

// 배열의 모든 요소를 역순으로 복사하는 메서드
public class Ex10_rCopy {
    // 배열 b의 모든 요소를 배열 a에 역순으로 복사
    static void rcopy(int[] a, int[] b) {
        int length = a.length <= b.length ? a.length : b.length;
        for (int i = 0; i < length; i++) {
            a[i] = b[b.length - i - 1];
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

        rcopy(a, b);

        System.out.println("배열 b의 모든 요소를 배열 a에 역순으로 copy 하였습니다.");
        for (int i = 0; i < numA; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }
    }
}

/*
a의 요솟수는 : 2
a[0]: 1
a[1]: 2
b의 요솟수는 : 4
b[0]: 1
b[1]: 2
b[2]: 3
b[3]: 4
배열 b의 모든 요소를 배열 a에 역순으로 copy 하였습니다.
a[0] = 4
a[1] = 3
 */