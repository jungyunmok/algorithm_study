package ch06_4;

import java.util.Scanner;

// 이진 삽입 정렬
public class Ex05_binInsertionSort {
    // 이진 삽입 정렬
    static void binInsertionSort(int[] a, int n) {
        for (int i = 1; i < n; i++) {
            int key = a[i];
            int first = 0; // 검색범위 맨 앞의 인덱스
            int last = i - 1; // 검색번위 맨 끝의 인덱스
            int center; // 검색범위 중앙의 인덱스
            int insertion; // 삽입하는 위치의 인덱스

            do {
                center = (first + last) / 2;
                // 검색 성공
                if (a[center] == key) {
                    break;
                } else if (a[center] < key) {
                    first = center + 1;
                } else {
                    last = center - 1;
                }
            } while (first <= last);

            insertion = (first <= last) ? center + 1 : last + 1;

            for (int j = i; j > insertion; j--) {
                a[j] = a[j - 1];
            }
            a[insertion] = key;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("이진 삽입 정렬");
        System.out.print("요솟수: ");
        int nx = scanner.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = scanner.nextInt();
        }

        binInsertionSort(x, nx);			// 배열 x를 이진삽입정렬

        System.out.println("오름차순으로 정렬하였습니다.");
        for (int i = 0; i < nx; i++)
            System.out.println("x[" + i + "] ＝ " + x[i]);
    }
}
