package ch06_2;

import java.util.Scanner;

// 단순 교환 정렬(교환 과정을 자세히 출력)
public class Ex03_bubbleSortEx {
    // 배열 요소 a[idx1]과 a[idx2]를 교환
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
            System.out.printf("패스%d : \n", i + 1);
            for (int j = n - 1; j > i; j--) {
                for (int k = 0; k < n - 1; k++) {
                    // 배열 가장 마지막 바로 앞까지 출력 - 앞, 뒤 비교해서 앞숫자 크다면 +, 작다면 - 출력
                    System.out.printf("%3d %c", a[k], (k != j - 1) ? ' ' : (a[j - 1] > a[j] ? '+' : '-'));
                }
                System.out.printf("%3d\n", a[n - 1]); // 배열 가장 마지막 숫자 출력

                cCnt++; // 비교 횟수수 증가
                if (a[j - 1] > a[j]) {
                    // 앞 숫자가 뒷 숫자보다 크다면 교환
                    sCnt++; // 교환 횟수 증가
                    swap(a, j - 1, j);
                }
            }
            // swqp으로 바뀐 배열 출력
            for (int j = 0; j < n; j++) {
                System.out.printf("%3d ", a[j]);
            }
            System.out.println();
        }
        System.out.println("비교를 " + cCnt + "회 했습니다.");
        System.out.println("교환을 " + sCnt + "회 했습니다.");
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

        System.out.println("오름차순으로 정렬하였습니다.");
        for (int i = 0; i < nx; i++) {
            System.out.println("x[" + i + "] = " + x[i]);
        }
    }
}