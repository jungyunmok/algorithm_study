package ch06_2;

import java.util.Scanner;

// 버블 정렬(버전 1)
public class Ex01_bubbleSort {
    // a[idx1]과 a[idx2]의 값을 교환
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    // 버블 정렬
    static void bubbleSort(int[] a, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = n - 1; j > i; j--) { // 패스
                // 뒷 숫자보다 앞 숫자가 크면 값 교환
                if (a[j - 1] > a[j]) {
                    swap(a, j - 1, j);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("버블 정렬(버전 1)");
        System.out.print("요솟수: ");
        int nx = scanner.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = scanner.nextInt();
        }

        bubbleSort(x, nx); // 배열 x를 버블 정렬

        System.out.println("오름차 순으로 정렬했습니다.");
        for (int i = 0; i < nx; i++) {
            System.out.println("x[" + i + "] = " + x[i]);
        }
    }
}
/*
버블 정렬(버전 1)
요솟수: 5
x[0]: 6
x[1]: 4
x[2]: 3
x[3]: 1
x[4]: 8
오름차 순으로 정렬했습니다.
x[0] = 1
x[1] = 3
x[2] = 4
x[3] = 6
x[4] = 8
 */