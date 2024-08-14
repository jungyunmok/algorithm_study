package ch06_2;

import java.util.Scanner;

// 단순 교환 정렬(버전 2: 교환 과정을 자세히 출력)
public class Ex05_bubbleSortEx2 {
    // 배열의 요소 a[idx1]과 a[idx2]를 교환
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    // 단순 교환 정렬
    static void bubbleSort(int[] a, int n) {
        int cCnt = 0; // 비교 횟수
        int sCnt = 0; // 교환 횟수

        for (int i = 0; i < n - 1; i++) {
            int exchg = 0; // 패스에 의한 교환 횟수
            System.out.printf("패스%d: \n", i+1);

            // 맨 끝부터 맨 앞+1까지 비교하며 반복
            for (int j = n-1; j > i; j--) {
                for (int k = 0; k < n - 1; k++) {
                    // 비교할 뒷숫자와 앞숫자, 앞숫자가 크면 교환해야하니 + 작으면 비교만 한거니 -
                    System.out.printf("%3d %c", a[k], (k != j - 1) ? ' ' : (a[j - 1] > a[j] ? '+' : '-'));
                    }
                System.out.printf("%3d\n", a[n-1]); // 가장 마지막 숫자 출력

                cCnt++;
                if (a[j - 1] > a[j]) {
                    swap(a, j - 1, j);
                    exchg++;
                    sCnt++;
                }
            }
            for (int k = 0; k < n; k++) {
                System.out.printf("%3d ", a[k]);
            }
            System.out.println();
            if(exchg == 0) break; // 교환이 이루어지지 않으므로 멈춤
        }
        System.out.println("비교를 " + cCnt + "회 했습니다.");
        System.out.println("교환를 " + sCnt + "회 했습니다.");
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

        System.out.println("오름차순으로 정렬했습니다.");
        for (int i = 0; i < nx; i++) {
            System.out.println("x[" + i + "] = " + x[i]);
        }
    }
}
/*
단순 교환 정렬(버블 정렬)
요솟수: 4
x[0]: 2
x[1]: 7
x[2]: 5
x[3]: 9
패스1:
  2    7    5 -  9
  2    7 +  5    9
  2 -  5    7    9
  2   5   7   9
패스2:
  2    5    7 -  9
  2    5 -  7    9
  2   5   7   9
비교를 5회 했습니다.
교환를 1회 했습니다.
오름차순으로 정렬했습니다.
x[0] = 2
x[1] = 5
x[2] = 7
x[3] = 9
 */