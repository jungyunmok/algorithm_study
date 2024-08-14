package ch06_4;

import java.util.Scanner;

// 단순 삽입 정렬(보초법: 배열의 맨 앞 요소는 비어있음)
public class Ex04_insertionSortCen {
    // 단순 삽입 정렬
    static void insertionSort(int[] a, int n) {
        for (int i = 2; i < n; i++) {
            int temp = a[0] = a[i];
            int j = i;
            for (; a[j - 1] > temp; j--) {
                a[j] = a[j - 1];
            }
            if (j > 0) {
                a[j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("단순 삽입 정렬");
        System.out.print("요솟수: ");
        int nx = scanner.nextInt();
        int[] x = new int[nx + 1]; // 여분으로 1개 더 생성

        for (int i = 1; i <= nx; i++) { // x[1] ~ x[nx]에 입력받음
            System.out.print("x[" + i + "]: ");
            x[i] = scanner.nextInt();
        }

        insertionSort(x, nx + 1); // 배열 x를 단순 삽입 정렬

        System.out.println("오름차순으로 정렬하였습니다.");
        for (int i = 1; i <= nx; i++) {
            System.out.println("x[" + i + "] = " + x[i]);
        }
    }
}
