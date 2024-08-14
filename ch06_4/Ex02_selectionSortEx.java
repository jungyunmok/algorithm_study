package ch06_4;

import java.util.Scanner;

// 단순 선택 정렬(교환 과정을 자세히 출력)
public class Ex02_selectionSortEx {
    // a[idx1]과 a[idx2]의 값을 교환
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    // 단순 선택 정렬
    static void selectionSort(int[] a, int n) {
        for (int i = 0; i < n - 1; i++) {
            int min = i; // 아직 정렬되지 않은 부분에서 가장 작은 요소의 인덱스를 저장
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            for (int j = 0; j < n; j++) {
                // 바꿀 요소는 +, 위치는 *
                System.out.print((j == i) ? "  * " : (j == min) ? "  + " : "    ");
            }
            System.out.println();
            for (int j = 0; j < n; j++) {
                System.out.printf("%3d ", a[j]);
            }
            System.out.println("\n");
            swap(a, i, min); // 아직 정렬되지 않은 부분의 첫 요소와 가장 작은 요소를 교환
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("단순 선택 정렬");
        System.out.print("요솟수: ");
        int nx = scanner.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = scanner.nextInt();
        }

        selectionSort(x, nx); // 배열 x를 단순 선택 정렬

        System.out.println("오름차 순으로 정렬했습니다.");
        for (int i = 0; i < nx; i++) {
            System.out.println("x[" + i + "] = " + x[i]);
        }
    }
}
/*
단순 선택 정렬
요솟수: 4
x[0]: 2
x[1]: 9
x[2]: 6
x[3]: 1
  *           +
  2   9   6   1

      *       +
  1   9   6   2

          *
  1   2   6   9

오름차 순으로 정렬했습니다.
x[0] = 1
x[1] = 2
x[2] = 6
x[3] = 9
 */