package ch05_3;

import java.util.Scanner;

// 메서드 recur3의 비재귀적 표현
public class Ex02_recur3 {
    // 메서드 recur의 비재귀적 표현
    static void recur3(int n) {
        int[] nStk = new int[100];
        int[] sStk = new int[100];
        int ptr = -1;
        int sw = 0;

        while (true) {
            if (n > 0) {
                ptr++;
                nStk[ptr] = n;
                sStk[ptr] = sw;

                if (sw == 0) {
                    n = n - 1;
                } else if (sw == 1) {
                    n = n - 2;
                    sw = 0;
                }
                continue;
            }
            do {
                n = nStk[ptr];
                sw = sStk[ptr--] + 1;

                if (sw == 2) {
                    System.out.println(n);
                    if (ptr < 0) return;
                }
            } while (sw == 2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 입력하세요: ");
        int x = scanner.nextInt();

        recur3(x);
    }
}
/*
정수를 입력하세요: 3
1
2
1
3
 */