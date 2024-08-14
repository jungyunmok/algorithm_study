package ch06_4;

import java.util.Scanner;

// 단순 삽입 정렬(삽입 과정을 자세히 출력)
public class Ex03_insertionSortEx {
    // 단순 삽입 정렬
    static void insertionSort(int[] a, int n) {
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%3d ", a[j]);
            }
            System.out.println();

            int j;
            int temp = a[i];
            for (j = i; j > 0 && a[j - 1] > temp; j--) {
                a[j] = a[j - 1];
            }
            a[j] = temp;

            System.out.print(" ".repeat(4 * j));
            System.out.print(i != j ? "^-" : "  ");
            System.out.print("-".repeat(4 * (i - j)));
            System.out.println("+");
            System.out.printf("a[%d]의 %d을/를 a[%d]의 위치에 삽입하였습니다.\n\n", i, temp, j);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("단순 삽입 정렬");
        System.out.print("요솟수: ");
        int nx = scanner.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = scanner.nextInt();
        }

        insertionSort(x, nx); // 배열 x를 단순 삽입 정렬

        System.out.println("오름차순으로 정렬했습니다.");
        for (int i = 0; i < nx; i++) {
            System.out.println("x[" + i + "] = " + x[i]);
        }
    }
}
/*
단순 삽입 정렬
요솟수: 4
x[0]: 6
x[1]: 4
x[2]: 8
x[3]: 2
  6   4   8   2
^-----+
a[1]의 4을/를 a[0]의 위치에 삽입하였습니다.

  4   6   8   2
          +
a[2]의 8을/를 a[2]의 위치에 삽입하였습니다.

  4   6   8   2
^-------------+
a[3]의 2을/를 a[0]의 위치에 삽입하였습니다.

오름차순으로 정렬했습니다.
x[0] = 2
x[1] = 4
x[2] = 6
x[3] = 8
 */