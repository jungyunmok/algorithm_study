package ch03_2;

import java.util.Scanner;

// 선형 검색 for문
public class Ex02_seqSearchFor {
    // 요솟수가 n인 배열 a에서 key와 값이 같은 요소를 선형 검색
    static int seqSearch(int[] a, int n, int key) {
        for (int i = 0; i < n; i++) {
            if(a[i] == key)
                return i; // 검색 성공(인덱스 반환)
        }
        return -1; // 검색 실패(-1 반환)
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

        System.out.print("검색할 값: "); // 키 값
        int key = scanner.nextInt();

        int index = seqSearch(x, num, key);

        if(index == -1) {
            System.out.println("그 값의 요소가 없습니다.");
        } else {
            System.out.println("그 값은 x[" + index + "]에 있습니다.");
        }
    }
}

/*
요솟수: 3
x[0]: 1
x[1]: 2
x[2]: 3
검색할 값: 5
그 값의 요소가 없습니다.
 */