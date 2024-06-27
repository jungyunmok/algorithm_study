package ch03_3;

import java.util.Scanner;

// 특정 값을 갖는 배열 안의 모든 요소를 다른 배엘에 카피
public class Ex04_searchIndex {
    // 배열 a의 앞쪽 n개 요소에서 key와 일치하는 모든 요소의 인덱스를
    // 배열 idx에 순서대로 저장하고 일치하는 요솟수 반환
    static int searchIdx(int[] a, int n, int key, int[] idx) {
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == key) {
                idx[index++] = i;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = scanner.nextInt();

        int[] a = new int[num];
        int[] idx = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("a[" + i + "]: ");
            a[i] = scanner.nextInt();
        }

        System.out.print("검색값: ");
        int key = scanner.nextInt();

        int count = searchIdx(a, num, key, idx);

        if (count == 0) {
            System.out.println("그 값의 요소는 존재하지 않습니다.");
        } else {
            for (int i = 0; i < count; i++) {
                System.out.println("그 값은 a[" + idx[i] + "]에 있습니다.");
            }
        }
    }
}

/*
요솟수 : 5
a[0]: 2
a[1]: 7
a[2]: 4
a[3]: 2
a[4]: 5
검색값: 2
그 값은 a[0]에 있습니다.
그 값은 a[3]에 있습니다.
 */