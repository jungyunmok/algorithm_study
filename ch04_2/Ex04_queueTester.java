package ch04_2;

import java.util.Scanner;

// 제네릭 큐 테스트 프로그램
public class Ex04_queueTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<String> s = new Queue<>(4); // 최대 64개 넣을 수 있는 큐

        while (true) {
            System.out.printf("현재 데이터 개수: %d / %d\n", s.size(), s.getCapacity());
            System.out.print("(1) 인큐　(2) 디큐　(3) 피크　(4) 덤프　(5) 검색 (0) 종료 : ");

            int menu = scanner.nextInt();
            if(menu == 0) break;

            int idx;
            String x;

            switch (menu) {
                case 1 -> { // 인큐
                    System.out.print("데이터: ");
                    x = scanner.next();
                    try {
                        s.enque(x);
                    } catch (Queue.OverflowGqueueException e) {
                        System.out.println("큐가 가득 찼습니다.");
                    }
                }

                case 2 -> { // 디큐
                    try {
                        x = s.deque();
                        System.out.println("디큐한 데이터는 " + x + "입니다.");
                    }catch (Queue.EmptyGqueueException e) {
                        System.out.println("큐가 비어 있습니다.");
                    }
                }

                case 3 -> { // 피크
                    try {
                        x = s.peek();
                        System.out.println("피크한 데이터는 " + x + "입니다.");
                    } catch (Queue.EmptyGqueueException e) {
                        System.out.println("큐가 비어 있습니다.");
                    }
                }

                case 4 -> { // 덤프
                    s.dump();
                }

                case 5 -> { // 검색
                    System.out.print("데이터: ");
                    String str = scanner.next();
                    int n = s.search(str);
                    if(n != 0) {
                        System.out.printf("%d번째 데이터로, 인덱스 %d의 위치에 저장되어 있습니다.\n", n, s.indexOf(str));
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
(1) 인큐　(2) 디큐　(3) 피크　(4) 덤프　(5) 검색 (0) 종료 : 1
데이터: Q
현재 데이터 개수: 1 / 64
(1) 인큐　(2) 디큐　(3) 피크　(4) 덤프　(5) 검색 (0) 종료 : 1
데이터: W
현재 데이터 개수: 2 / 64
(1) 인큐　(2) 디큐　(3) 피크　(4) 덤프　(5) 검색 (0) 종료 : 1
데이터: E
현재 데이터 개수: 3 / 64
(1) 인큐　(2) 디큐　(3) 피크　(4) 덤프　(5) 검색 (0) 종료 : 1
데이터: R

현재 데이터 개수: 4 / 64
(1) 인큐　(2) 디큐　(3) 피크　(4) 덤프　(5) 검색 (0) 종료 : 3
피크한 데이터는 Q입니다.

현재 데이터 개수: 4 / 64
(1) 인큐　(2) 디큐　(3) 피크　(4) 덤프　(5) 검색 (0) 종료 : 2
디큐한 데이터는 Q입니다.

현재 데이터 개수: 3 / 64
(1) 인큐　(2) 디큐　(3) 피크　(4) 덤프　(5) 검색 (0) 종료 : 4
W E R

현재 데이터 개수: 3 / 64
(1) 인큐　(2) 디큐　(3) 피크　(4) 덤프　(5) 검색 (0) 종료 : 5
데이터: E
2번째 데이터로, 인덱스 2의 위치에 저장되어 있습니다.
 */