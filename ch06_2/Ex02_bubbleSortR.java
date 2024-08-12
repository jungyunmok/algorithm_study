package ch06_2;

import java.util.Scanner;

// 단순 교환 정렬(각 패스를 앞 -> 뒤 순서로 수행)
public class Ex02_bubbleSortR {
    // a[idx1]과 a[idx2]의 값을 교환
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    // 단순 교환 정렬
    static void bubbleSort(int[] a, int n) {
        for (int i = n-1; i > 0; i--) {
            for (int j = 0; j < i; j++) { // 맨앞 -> 맨끝 순서로 스캔
                // 뒷 숫자보다 앞 숫자가 크면 값 교환
                if (a[j] > a[j + 1]) {
                    swap(a, j, j + 1);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("단순 교환 정렬(버블 정렬)");
        System.out.print("요솟수: ");
        int nx = scanner.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = scanner.nextInt();
        }

        bubbleSort(x, nx); // 배열 x를 단순 교환 정렬

        System.out.println("오름차 순으로 정렬했습니다.");
        for (int i = 0; i < nx; i++) {
            System.out.println("x[" + i + "] = " + x[i]);
        }
    }
}
/*
단순 교환 정렬(버블 정렬)
요솟수: 5
x[0]: 2
x[1]: 8
x[2]: 4
x[3]: 6
x[4]: 9
오름차 순으로 정렬했습니다.
x[0] = 2
x[1] = 4
x[2] = 6
x[3] = 8
x[4] = 9
 */