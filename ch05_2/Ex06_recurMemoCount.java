package ch05_2;

import java.util.Scanner;

// 재귀 함수를 메모화로 구현 - 호출한 횟수 카운트
public class Ex06_recurMemoCount {
    static int count;
    static String[] memo;

    // 메모화를 도입한 recur 메서드
    static void recur(int n) {
        count++;
        if (memo[n + 1] != null) {
            System.out.print(memo[n + 1]); // 메모가 있는 경우 메모를 출력
        } else {
            if (n > 0) {
                recur(n - 1);
                System.out.println(n);
                recur(n - 2);
                memo[n + 1] = memo[n] + n + "\n" + memo[n - 1]; // 메모가 없는 경우 메모화
            } else {
                memo[n + 1] = ""; // recur(0)과 recur(-1)은 빈 문자열
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수를 입력하세요.: ");
        int x = scanner.nextInt();

        memo = new String[x + 2];
        recur(x);

        System.out.println("메서드 호출 횟수: " + count);
    }
}
/*
1
2
3
1
4
1
2
메서드 호출 횟수: 9
 */