package ch05_2;

import ch04_1.IntStack;

import java.util.Scanner;

// 재귀 알고리즘의 비재귀적 표현
/*
1. 꼬리 재귀를 제거 -> n값을 n-2로 업데이트하고 메서드 시작점으로 돌아감
2. 현재 n값을 잠시 저장하고 처리 후 저장했던 n값을 꺼내 출력
 */
public class Ex03_recurX1 {
    static void recur(int n) {
        IntStack s = new IntStack(n);

        while (true) {
            if (n > 0) {
                s.push(n); // n값을 푸시
                n -= 1;
                continue;
            }
            if (s.isEmpty() != true) {
                n = s.pop(); // 저장했던 스택값 팝
                System.out.println(n);
                n -= 2; // 꼬리 재귀를 제거
                continue;
            }
            break;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 입력하세요.: ");
        int x = scanner.nextInt();

        recur(x);
    }
}