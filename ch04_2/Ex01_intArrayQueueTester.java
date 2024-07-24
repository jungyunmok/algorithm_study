package ch04_2;

import java.util.Scanner;

// int형 고징 길이 큐(링 버퍼를 사용하지 않고 구현)의 사용 예
public class Ex01_intArrayQueueTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IntArrayQueue s = new IntArrayQueue(64); // 최대 64개를 푸시할 수 있는 큐

        while (true) {
            System.out.println("현재 데이터 개수: " + s.size() + " / " + s.capacity());
            System.out.print("(1) 인큐　(2) 디큐　(3) 피크　(4) 덤프　(0) 종료: ");

            int menu = scanner.nextInt();
            if(menu == 0) break;

            int x = 0;
            switch (menu) {
                case 1 -> { // 인큐
                    System.out.print("데이터: ");
                    x = scanner.nextInt();
                    try {
                        s.enque(x);
                    } catch (IntArrayQueue.OverflowIntArrayQueueException e) {
                        System.out.println("큐가 가득 찼습니다.");
                    }
                }

                case 2 -> { // 디큐
                    try {
                        x = s.deque();
                        System.out.println("디큐한 데이터는 " + x + "입니다.");
                    } catch (IntArrayQueue.EmptyIntArrayQueueException e) {
                        System.out.println("큐가 비어 있습니다.");
                    }
                }

                case 3 -> { // 피크
                    try {
                        x = s.peek();
                        System.out.println("피크한 데이터는 " + x + "입니다.");
                    } catch (IntArrayQueue.EmptyIntArrayQueueException e) {
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
(1) 인큐　(2) 디큐　(3) 피크　(4) 덤프　(0) 종료: 1
데이터: 10
현재 데이터 개수: 1 / 64
(1) 인큐　(2) 디큐　(3) 피크　(4) 덤프　(0) 종료: 1
데이터: 5
현재 데이터 개수: 2 / 64
(1) 인큐　(2) 디큐　(3) 피크　(4) 덤프　(0) 종료: 1
데이터: 92

현재 데이터 개수: 3 / 64
(1) 인큐　(2) 디큐　(3) 피크　(4) 덤프　(0) 종료: 2
디큐한 데이터는 10입니다.

현재 데이터 개수: 2 / 64
(1) 인큐　(2) 디큐　(3) 피크　(4) 덤프　(0) 종료: 3
피크한 데이터는 92입니다.

현재 데이터 개수: 2 / 64
(1) 인큐　(2) 디큐　(3) 피크　(4) 덤프　(0) 종료: 4
5 92
 */