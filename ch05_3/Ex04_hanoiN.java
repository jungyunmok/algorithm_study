package ch05_3;

import java.util.Scanner;

// 하노이의 탑(비재귀적 구현)
public class Ex04_hanoiN {
    // 원반을 x기둥에서 y기둥으로 이동
    static void move(int no, int x, int y) {
        int[] xStk = new int[100];
        int[] yStk = new int[100];
        int[] sStk = new int[100];
        int ptr = 0; // 스택 포인터
        int sw = 0;

        while (true) {
            if (sw == 0 && no > 1) {
                xStk[ptr] = x; // x 값 푸시
                yStk[ptr] = y; // y값 푸시
                sStk[ptr] = sw; // sw값 푸시
                ptr++;
                no -= 1;
                y = 6 - x - y;
                continue;
            }

            System.out.printf("원반[%d]을 %d 기둥에서 %d 기둥으로 이동\n", no, x, y);

            if (sw == 1 && no > 1) {
                xStk[ptr] = x;
                yStk[ptr] = y;
                sStk[ptr] = sw;
                ptr++;
                no -= 1;
                x = 6 - x - y;
                if(++sw == 2) sw = 0;
                continue;
            }

            do {
                if (ptr-- == 0) return; // 스택이 비어 있으면
                x = xStk[ptr]; // 값을 저장하고 있는 x를 팝
                y = yStk[ptr]; // 값을 저장하고 있는 y를 팝
                sw = sStk[ptr] + 1; // 값을 저장하고 있는 sw을 팝
                no++;
            } while (sw == 2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("하노이의 탑");
        System.out.print("원반의 개수: ");
        int n = scanner.nextInt();

        move(n, 1, 3); // 제1기둥에 쌓인 n개를 제3기둥으로 이동
    }
}
/*
하노이의 탑
원반의 개수: 3
원반[1]을 1 기둥에서 3 기둥으로 이동
원반[2]을 1 기둥에서 2 기둥으로 이동
원반[1]을 3 기둥에서 2 기둥으로 이동
원반[3]을 1 기둥에서 3 기둥으로 이동
원반[1]을 2 기둥에서 1 기둥으로 이동
원반[2]을 2 기둥에서 3 기둥으로 이동
원반[1]을 1 기둥에서 3 기둥으로 이동
 */