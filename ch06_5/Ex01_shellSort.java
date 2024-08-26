package ch06_5;

import java.util.Scanner;

// 셀 정렬(버전 1)
public class Ex01_shellSort {
    // 셀 정렬
    static void shellSort(int[] a, int n) {
        // h의 초기값은 n/2 -> 반복할때마다 h를 2로 나눔
        for (int h = n / 2; h > 0; h /= 2) {
            for (int i = h; i < n; i++) {
                int j;
                int temp = a[i];
                // 선택 요소와 비교 요소가 서로 이웃하지 않고 h칸만큼 떨어져 있음
                for (j = i - h; j >= 0 && a[j] > temp; j -= h) {
                    a[j + h] = a[j];
                }
                a[j + h] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("셀 정렬(버전 1)");
        System.out.print("요솟수: ");
        int nx = scanner.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = scanner.nextInt();
        }

        shellSort(x, nx); // 배열 x를 셀 정렬
        System.out.println("오름차순으로 정렬했습니다.");
        for (int i = 0; i < nx; i++) {
            System.out.println("x[" + i + "] = " + x[i]);
        }
    }
}
/*
셀 정렬(버전 1)
요솟수: 7
x[0]: 6
x[1]: 4
x[2]: 3
x[3]: 7
x[4]: 1
x[5]: 9
x[6]: 8
오름차순으로 정렬했습니다.
x[0] = 1
x[1] = 3
x[2] = 4
x[3] = 6
x[4] = 7
x[5] = 8
x[6] = 9
 */