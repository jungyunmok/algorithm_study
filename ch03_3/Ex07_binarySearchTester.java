package ch03_3;

import java.util.Arrays;
import java.util.Scanner;

// Arrays.binarySearch로 이진 검색
public class Ex07_binarySearchTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("요솟수: ");
        int num = scanner.nextInt();
        int[] x = new int[num];

        System.out.println("오름차순으로 입력하세요.");

        System.out.print("x[0]: ");
        x[0] = scanner.nextInt();

        for (int i = 1; i < num; i++) {
            do {
                System.out.print("x[" + i + "]: ");
                x[i] = scanner.nextInt();
            } while (x[i] < x[i - 1]); // 바로 앞 요소보다 작으면 다시 입력
        }

        System.out.print("검색할 값: ");
        int key = scanner.nextInt();

        int idx = Arrays.binarySearch(x, key); // 배열 x에서 값이 key인 요소 검색

        if(idx < 0) {
            System.out.println("그 값의 요소가 없습니다.");
        } else {
            System.out.println("그 값은 x[" + idx + "]에 있습니다.");
        }
    }
}

/*
요솟수: 5
오름차순으로 입력하세요.
x[0]: 18
x[1]: 20
x[2]: 43
x[3]: 65
x[4]: 86
검색할 값: 65
그 값은 x[3]에 있습니다.
 */