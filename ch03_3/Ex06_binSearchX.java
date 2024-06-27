package ch03_3;

import java.util.Scanner;

// 이진 검색(일치하는 맨앞 요소 찾기)
public class Ex06_binSearchX {
    // 배열 a의 앞쪽 n개의 요소에서 key와 일치하는 요소 이진검색
    static int binSearchX(int[] a, int n, int key) {

        int start = 0; // 검색 시작 인덱스
        int end = n - 1; // 검색 끝 인덱스

        do {
            int index = (start + end) / 2;

            if (a[index] == key) {
                // key와 같은 맨앞의 요소 검색
                for (; index > start; index--) {
                    if (a[index - 1] < key) break;
                }
                return index;
            } else if (a[index] < key) {
                start = index + 1; // 검색 범위 앞쪽 절반으로 좁힘
            } else {
                end = index - 1; // 검색 범위 뒤쪽 절반으로 좁힘
            }
        } while (start <= end);

        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("요솟수: ");
        int num = scanner.nextInt();
        int[] a = new int[num];

        System.out.println("오름차순으로 입력하세요.");

        System.out.print("a[0] : ");
        a[0] = scanner.nextInt();

        for (int i = 1; i < num; i++) {
            do {
                System.out.print("a[" + i + "]: ");
                a[i] = scanner.nextInt();
            } while (a[i] < a[i - 1]); // 바로 앞 요소보다 작으면 다시 입력
        }

        System.out.print("검색 값: ");
        int key = scanner.nextInt();

        int index = binSearchX(a, num, key);

        if(index == -1) {
            System.out.println("그 값의 요소는 존재하지 않습니다.");
        } else {
            System.out.println("그 값은 a[" + index + "]에 있습니다.");
        }
    }
}

/*
요솟수: 5
오름차순으로 입력하세요.
a[0] : 1
a[1]: 2
a[2]: 2
a[3]: 4
a[4]: 6
검색 값: 2
그 값은 a[1]에 있습니다.
 */