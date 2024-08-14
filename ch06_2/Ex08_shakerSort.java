package ch06_2;

import java.util.Scanner;

// 양방향 버블 정렬(셰이커 정렬)
public class Ex08_shakerSort {
    // a[idx1]과 a[idx2]의 값을 교환
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    // 양방향 버블 정렬(셰이커 정렬)
    static void shakerSort(int[] a, int n) {
        int left = 0; // a[left]보다 앞쪽은 정렬을 마친 상태
        int right = n - 1; // a[right]보다 뒤쪽은 정렬을 마친 상태
        int last = right; // 마지막으로 요소를 교환한 위치
        while (left < right) {
            // 뒤에서부터 작은 요소 맨 앞으로 옮기기
            for (int i = right; i > left; i--) {
                if (a[i - 1] > a[i]) {
                    swap(a, i - 1, i);
                    last = i;
                }
            }
            left = last;

            // 앞에서부터 큰 요소 맨 뒤로 옮기기
            for (int i = left; i < right; i++) {
                if (a[i] > a[i + 1]) {
                    swap(a, i, i + 1);
                    last = i;
                }
            }
            right = last;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("양방향 버블 정렬(셰이커 정렬)");
        System.out.print("요솟수: ");
        int nx = scanner.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = scanner.nextInt();
        }

        shakerSort(x, nx); // 배열 x를 양방향 버블 정렬

        System.out.println("오름차 순으로 정렬했습니다.");
        for (int i = 0; i < nx; i++) {
            System.out.println("x[" + i + "] = " + x[i]);
        }
    }
}
/*
양방향 버블 정렬(셰이커 정렬)
요솟수: 5
x[0]: 2
x[1]: 9
x[2]: 7
x[3]: 3
x[4]: 5
오름차 순으로 정렬했습니다.
x[0] = 2
x[1] = 3
x[2] = 5
x[3] = 7
x[4] = 9
 */