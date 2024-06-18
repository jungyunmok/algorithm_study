package ch02_1;

import java.util.Arrays;
import java.util.Scanner;

// 배열 요소 역순 정렬 과정을 출력
public class Ex07_reverseArray {
    static void reverse(int[] a) {
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length / 2; i++) {
            int index = a.length - i - 1;
            System.out.println("a[" + i + "]과 a[" + index + "]을 교환합니다.");
            int temp1 = a[i];
            a[i] = a[index];
            a[index] = temp1;
            System.out.println(Arrays.toString(a));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("요솟수는 : ");
        int num = scanner.nextInt(); // 요솟수

        int[] x = new int[num]; // 요솟수가 num인 배열

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = scanner.nextInt();
        }

        reverse(x); // 배열 a의 요소를 역순으로 정렬

        System.out.println("역순 정렬을 마쳤습니다.");
    }
}

/*
요솟수는 : 7
x[0] : 2
x[1] : 5
x[2] : 1
x[3] : 3
x[4] : 9
x[5] : 6
x[6] : 7
[2, 5, 1, 3, 9, 6, 7]
a[0]과 a[6]을 교환합니다.
[7, 5, 1, 3, 9, 6, 2]
a[1]과 a[5]을 교환합니다.
[7, 6, 1, 3, 9, 5, 2]
a[2]과 a[4]을 교환합니다.
[7, 6, 9, 3, 1, 5, 2]
역순 정렬을 마쳤습니다.
 */