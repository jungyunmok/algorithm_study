package ch05_3;

import java.util.Scanner;

// 하노이의 탑(기둥 이름을 문자열로 출력)
public class Ex03_hanoiEx {
    static String[] name = {"A 기둥", "B 기둥", "C 기둥"};
    // 원반을 x기둥에서 y기둥으로 옮김
    static void move(int no, int x, int y) {
        if (no > 1) {
            move(no - 1, x, 6 - x - y);
        }

        System.out.println("원반[" + no + "]을(를) " + name[x - 1] + "에서 " + name[y - 1] + "으로 옮김");

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
원반[1]을(를) A 기둥에서 C 기둥으로 옮김
원반[2]을(를) A 기둥에서 B 기둥으로 옮김
원반[1]을(를) C 기둥에서 B 기둥으로 옮김
원반[3]을(를) A 기둥에서 C 기둥으로 옮김
원반[1]을(를) B 기둥에서 A 기둥으로 옮김
원반[2]을(를) B 기둥에서 C 기둥으로 옮김
원반[1]을(를) A 기둥에서 C 기둥으로 옮김
 */