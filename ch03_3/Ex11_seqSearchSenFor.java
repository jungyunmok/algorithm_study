package ch03_3;

import java.util.Scanner;

// 선형 검색(보초법 - for문)
public class Ex11_seqSearchSenFor {
    // 배열 a의 앞쪽 n개의 요소에서 key와 일치하는 요소 선형검색(보초법)
    static int seqSearchSen(int[] a, int n, int key) {
        int i;

        a[n] = key; // 보초를 추가

        for (i = 0; a[i] != key; i++)
            ;

        return i == n ? -1 : i;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("요솟수: ");
        int num = scanner.nextInt();
        int[] x = new int[num + 1]; // 요솟수가 num + 1 인 배열

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = scanner.nextInt();
        }

        System.out.print("검색할 값: "); // 키값
        int key = scanner.nextInt();

        int index = seqSearchSen(x, num, key); // 배열 x에서 값이 key인 요소 검색

        if (index == -1) {
            System.out.println("그 값의 요소가 없습니다.");
        } else {
            System.out.println("그 값은 x[" + index + "]에 있습니다.");
        }
    }
}