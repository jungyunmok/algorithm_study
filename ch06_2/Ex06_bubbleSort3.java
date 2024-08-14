package ch06_2;

import java.util.Scanner;

// 버블 정렬(버전 3)
public class Ex06_bubbleSort3 {
    // a[idx1]과 a[idx2]의 값을 교환
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    // 버블 정렬
    static void bubbleSort(int[] a, int n) {
        int k = 0; // a[k]보다 앞쪽은 정렬을 마친 상태
        while (k < n - 1) {
            int last = n -1; // 마지막으로 요소를 교환한 위치
            for (int i = n-1; i > k; i--) {
                if (a[i - 1] > a[i]) {
                    swap(a, i-1, i);
                    last = i;
                }
            }
            k = last;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("버블 정렬(버전 3)");
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