package ch03_3;

import java.util.Scanner;

// 선형 검색(검색 과정 출력)
public class Ex12_seqSearchEx {
    // 배열 a의 앞쪽 n개의 요소에서 key와 일치하는 요소 선형검색(보초법)
    static int seqSearchEx(int[] a, int n, int key) {
        System.out.print("   |");
        for (int i = 0; i < n; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();

        System.out.print("---+");
        for (int i = 0; i < 4 * n + 2; i++) {
            System.out.print("-");
        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.print("   |");
            System.out.printf(String.format("%%%ds*\n", (i*4) + 3), "");
            System.out.printf("%3d|", i);

            for (int j = 0; j < n; j++) {
                System.out.printf("%4d", a[j]);
            }
            System.out.println("\n   |");

            if(a[i] == key) return i; // 검색 성공
        }
        return -1; // 검색 실패
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("요솟수: ");
        int num = scanner.nextInt();
        int[] x = new int[num]; // 요솟수가 num인 배열

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = scanner.nextInt();
        }

        System.out.print("검색할 값: "); // 키값
        int key = scanner.nextInt();

        int index = seqSearchEx(x, num, key); // 배열 x에서 값이 key인 요소 검색

        if (index == -1) {
            System.out.println("그 값의 요소가 없습니다.");
        } else {
            System.out.println("그 값은 x[" + index + "]에 있습니다.");
        }
    }
}

/*
   |   0   1   2   3   4   5   6
---+------------------------------
   |   *
  0|   6   4   3   2   1   9   8
   |
   |       *
  1|   6   4   3   2   1   9   8
   |
   |           *
  2|   6   4   3   2   1   9   8
   |
그 값은 x[2]에 있습니다.
 */