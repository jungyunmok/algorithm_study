package ch05_3;

import java.util.Scanner;

// 하노이의 탑
public class Ex01_hanoi {
    // no개의 원반을 x번 기둥에서 y번 기둥으로 옮김
    static void move(int no, int x, int y) {
        if (no > 1) {
            move(no - 1, x, 6 - x - y);
        }

        System.out.printf("원반[%d]을(를) %d번 기둥에서 %d번 기둥으로 옮김\n", no, x, y);

        if (no > 1) {
            move(no - 1, 6 - x - y, y);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("하노이의 탑");
        System.out.print("원반의 개수: ");
        int n = scanner.nextInt();

        move(n , 1, 3); // 1번 기둥에 쌓인 n개의 원반을 3번 기둥으로 옮김
    }
}
/*
하노이의 탑
원반의 개수: 3
원반[1]을(를) 1번 기둥에서 3번 기둥으로 옮김
원반[2]을(를) 1번 기둥에서 2번 기둥으로 옮김
원반[1]을(를) 3번 기둥에서 2번 기둥으로 옮김
원반[3]을(를) 1번 기둥에서 3번 기둥으로 옮김
원반[1]을(를) 2번 기둥에서 1번 기둥으로 옮김
원반[2]을(를) 2번 기둥에서 3번 기둥으로 옮김
원반[1]을(를) 1번 기둥에서 3번 기둥으로 옮김
 */