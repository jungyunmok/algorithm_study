package ch04_2;

import java.util.Scanner;

// 원하는 개수만큼 값 입력받고, 요솟수가 N인 배열에 마지막 N개 저장
public class Ex06_lastNElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int N = 10;
        int[] a = new int[N]; // 입력받은 값을 저장
        int cnt = 0; // 입력받은 개수
        int retry; // 다시시작

        System.out.println("정수를 입력하세요.");

        do {
            System.out.printf("%d번째 정수: ", cnt + 1);
            a[cnt++ % N] = scanner.nextInt();

            System.out.print("계속 할까요? (예.1 / 아니요.0): ");
            retry = scanner.nextInt();
        } while (retry == 1);

        int i = cnt - N;
        if(i < 0) i = 0;

        for (; i < cnt; i++) {
            System.out.printf("%2d번째 정수 = %d\n", i + 1, a[i % N]);
        }
    }
}
/*
정수를 입력하세요.
1번째 정수: 15
2번째 정수: 17
3번째 정수: 64
4번째 정수: 57
5번째 정수: 99
6번째 정수: 21
7번째 정수: 0
8번째 정수: 23
9번째 정수: 44
10번째 정수: 55
11번째 정수: 97
12번째 정수: 85

 3번째 정수 = 64
 4번째 정수 = 57
 5번째 정수 = 99
 6번째 정수 = 21
 7번째 정수 = 0
 8번째 정수 = 23
 9번째 정수 = 44
10번째 정수 = 55
11번째 정수 = 97
12번째 정수 = 85
 */
