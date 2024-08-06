package ch05_01;

import java.util.Scanner;

// 재귀 메서드 recur2 분석
public class Ex07_recur2 {
    // 재귀 메서드
    static void recur(int n) {
        if (n > 0) {
            recur(n - 2);
            System.out.println(n);
            recur(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 입력하세요.: ");
        int x = scanner.nextInt();

        recur(x);
    }
}
/*
상향식 분석
recur(1) -> recur(-1) 1 recur(0) -> 1
recur(2) -> recur(0) 2 recur(1) -> 2 1
recur(3) -> recur(1) 3 recur(2) -> 1 3 21
recur(4) -> recur(2) 4 recur(3) -> 21 4 1321

하향식 분석
recur(4) -> recur(2) 4 recur(3)
    recur(2) -> recur(0) 2 recur(1) -> 2
        recur(1) -> recur(-1) 1 recur(0) -> 1
    -> 4
    recur(3) -> recur(1) 3 recur(2)
        recur(1) -> recur(-1) 1 recur(0) -> 1
        -> 3
        recur(2) -> recur(0) 2 recur(1) -> 2
            recur(1) -> recur(-1) 1 recur(0) -> 1
 */