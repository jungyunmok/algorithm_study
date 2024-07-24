package ch04_2;

import java.util.Scanner;

// int형 고정 길이 큐의 사용 예(메서드 search 추가)
public class Ex03_intQueueTester2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IntQueue2 s = new IntQueue2(64); // 최데 64개를 인큐할 수 있는 큐

        while (true) {
            System.out.println();
            System.out.printf("현재 데이터 개수: %d / %d\n", s.size(), s.getCapacity());
            System.out.print("(1)인큐 (2)디큐 (3)피크 (4)덤프 (5)검색 (0)종료: ");

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

                case 5 -> { // 검색
                    System.out.print("데이터: ");
                    x = scanner.nextInt();
                    int n = s.search(x);
                    if(n != 0) {
                        System.out.printf("%d번째 데이터로 인덱스%d의 위치에 저장되어 있습니다.\n", n, s.indexOf(x));
                    } else {
                        System.out.println("그 데이터는 등록되어 있지 않습니다.");
                    }
                }
            }
        }
    }
}
/*
현재 데이터 개수: 0 / 64
(1)인큐 (2)디큐 (3)피크 (4)덤프 (5)검색 (0)종료: 1
데이터: 1
현재 데이터 개수: 1 / 64
(1)인큐 (2)디큐 (3)피크 (4)덤프 (5)검색 (0)종료: 1
데이터: 6
현재 데이터 개수: 2 / 64
(1)인큐 (2)디큐 (3)피크 (4)덤프 (5)검색 (0)종료: 1
데이터: 9

현재 데이터 개수: 3 / 64
(1)인큐 (2)디큐 (3)피크 (4)덤프 (5)검색 (0)종료: 4
1 6 9

현재 데이터 개수: 3 / 64
(1)인큐 (2)디큐 (3)피크 (4)덤프 (5)검색 (0)종료: 2
디큐한 데이터는 1입니다.

현재 데이터 개수: 2 / 64
(1)인큐 (2)디큐 (3)피크 (4)덤프 (5)검색 (0)종료: 3
피크한 데이터는 6입니다.

현재 데이터 개수: 2 / 64
(1)인큐 (2)디큐 (3)피크 (4)덤프 (5)검색 (0)종료: 5
데이터: 9
2번째 데이터로 인덱스2의 위치에 저장되어 있습니다.
 */