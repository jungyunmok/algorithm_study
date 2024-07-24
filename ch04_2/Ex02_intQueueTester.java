package ch04_2;

import java.util.Scanner;

// int형 고정 길이 큐의 사용 예
public class Ex02_intQueueTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IntQueue s = new IntQueue(64); // 최데 64개를 인큐할 수 있는 큐

        while (true) {
            System.out.println();
            System.out.printf("현재 데이터 개수: %d / %d\n", s.size(), s.getCapacity());
            System.out.print("(1)인큐 (2)디큐 (3)피크 (4)덤프 (0)종료: ");

            int menu = scanner.nextInt();
            if (menu == 0) break;

            int x;
            switch (menu) {
                case 1 -> { // 인큐
                    System.out.print("데이터: ");
                    x = scanner.nextInt();
                    try {
                        s.enque(x);
                    } catch (IntQueue.OverflowIntQueueException e) {
                        System.out.println("큐가 가득 찼습니다.");
                    }
                }

                case 2 -> { // 디큐
                    try {
                        x = s.deque();
                        System.out.println("디큐한 데이터는 " + x + "입니다.");
                    } catch (IntQueue.EmptyIntQueueException e) {
                        System.out.println("큐가 비어 있습니다.");
                    }
                }

                case 3 -> { // 피크
                    try {
                        x = s.peek();
                        System.out.println("피크한 데이터는 " + x + "입니다.");
                    } catch (IntQueue.EmptyIntQueueException e) {
                        System.out.println("큐가 비어 있습니다.");
                    }
                }

                case 4 -> { // 덤프
                    s.dump();
                }
            }
        }
    }
}
/*
현재 데이터 개수: 0 / 64
(1)인큐 (2)디큐 (3)피크 (4)덤프 (0)종료: 1
데이터: 1
현재 데이터 개수: 1 / 64
(1)인큐 (2)디큐 (3)피크 (4)덤프 (0)종료: 1
데이터: 2

현재 데이터 개수: 2 / 64
(1)인큐 (2)디큐 (3)피크 (4)덤프 (0)종료: 4
1 2

현재 데이터 개수: 2 / 64
(1)인큐 (2)디큐 (3)피크 (4)덤프 (0)종료: 2
디큐한 데이터는 1입니다.

현재 데이터 개수: 1 / 64
(1)인큐 (2)디큐 (3)피크 (4)덤프 (0)종료: 3
피크한 데이터는 2입니다.
 */