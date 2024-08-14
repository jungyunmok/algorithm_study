package ch06_2;

import java.util.Scanner;

// 단순 교환 정렬 정렬(버전 3: 교환 과정을 자세히 출력)
public class Ex07_bubbleSortEx3 {
    // a[idx1]과 a[idx2]의 값을 교환
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    // 단순 교환 정렬
    static void bubbleSort(int[] a, int n) {
        int cCnt = 0; // 비교 횟수
        int sCnt = 0; // 교환 횟수

        int pass = 0;
        int k = 0; // a[k]보다 앞쪽은 정렬을 마친 상태
        while (k < n - 1) {
            System.out.printf("패스%d: \n", ++pass);
            int last = n -1; // 마지막으로 요소를 교환한 위치
            for (int i = n-1; i > k; i--) {
                for (int j = 0; j < n - 1; j++) {
                    System.out.printf("%3d %c", a[j], (j != i - 1) ? ' ' : (a[i - 1] > a[i] ? '+' : '-'));
                }
                System.out.printf("%3d\n", a[n-1]);
                cCnt++;
                if (a[i - 1] > a[i]) {
                    swap(a, i-1, i);
                    last = i;
                    sCnt++;
                }
            }
            k = last;
        }
        System.out.println("비교를 " + cCnt + "회 했습니다.");
        System.out.println("교환을 " + sCnt + "회 했습니다.");
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
/*
버블 정렬(버전 3)
요솟수: 5
x[0]: 2
x[1]: 3
x[2]: 9
x[3]: 6
x[4]: 7
패스1:
  2    3    9    6 -  7
  2    3    9 +  6    7
  2    3 -  6    9    7
  2 -  3    6    9    7
패스2:
  2    3    6    9 +  7
비교를 5회 했습니다.
교환을 2회 했습니다.
오름차 순으로 정렬했습니다.
x[0] = 2
x[1] = 3
x[2] = 6
x[3] = 7
x[4] = 9
 */