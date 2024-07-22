package ch04_1;

import java.util.Scanner;

// 머리가 둘인 int형 고정 길이 스택 사용(DoubleHeadIntStackTester 클래스의 모든 메서드 사용)
public class Ex04_doubleHeadIntStackTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DoubleHeadIntStack s = new DoubleHeadIntStack(64); // 최대 64개 푸시할 수 있는 머리 둘 스택

        while (true) {
            System.out.println("현재 데이터 개수: A -" + s.size(DoubleHeadIntStack.AorB.StackA) + " / B -" + s.size(DoubleHeadIntStack.AorB.StackB));
            System.out.print("( 1) A 푸시 ( 2) A 팝 ( 3) A 피크 ( 4) A 덤프 ( 5) A 검색 ( 6) A 비움\n" +
                    "( 7) B 푸시 ( 8) B 팝 ( 9) B 피크 (10) B 덤프 (11) B 검색 (12) B 비움\n" +
                    "(13)   출력 ( 0) 종료 : ");

            int menu = scanner.nextInt();
            if(menu == 0) break;

            int n, x = 0;
            switch (menu) {
                case 1 -> { // A에 푸시
                    System.out.print("데이터: ");
                    x = scanner.nextInt();
                    try {
                        s.push(DoubleHeadIntStack.AorB.StackA, x);
                    } catch (DoubleHeadIntStack.EmptyDoubleHeadIntStackException e) {
                        System.out.println("스택이 가득 찼습니다.");
                    }
                }

                case 2 -> { // A에서 팝
                    try {
                        x = s.pop(DoubleHeadIntStack.AorB.StackA);
                        System.out.println("팝한 데이터는 " + x + "입니다.");
                    } catch (DoubleHeadIntStack.EmptyDoubleHeadIntStackException e) {
                        System.out.println("스택이 비어 있습니다.");
                    }
                }

                case 3 -> { // A에서 피크
                    try {
                        x = s.peek(DoubleHeadIntStack.AorB.StackA);
                        System.out.println("피크한 데이터는 " + x + "입니다.");
                    } catch (DoubleHeadIntStack.EmptyDoubleHeadIntStackException e) {
                        System.out.println("스택이 비어 있습니다.");
                    }
                }

                case 4 -> { // A를 덤프
                    s.dump(DoubleHeadIntStack.AorB.StackA);
                }

                case 5 -> { // A에서 검색
                    System.out.print("검색할 데이터: ");
                    x = scanner.nextInt();
                    n = s.indexOf(DoubleHeadIntStack.AorB.StackA, x);
                    if(n >= 0)
                        System.out.println("꼭대기에서 " + (s.size(DoubleHeadIntStack.AorB.StackA) - n) + "번째에 있습니다.");
                    else
                        System.out.println("그 데이터가 없습니다.");
                }

                case 6 -> { // A 비우기
                    s.clear(DoubleHeadIntStack.AorB.StackA);
                }

                case 7 -> { // B에 푸시
                    System.out.print("데이터: ");
                    x = scanner.nextInt();
                    try {
                        s.push(DoubleHeadIntStack.AorB.StackB, x);
                    } catch (DoubleHeadIntStack.OverflowDoubleHeadIntStackException e) {
                        System.out.println("스택이 가득 찼습니다.");
                    }
                }

                case 8 -> { // B에서 팝
                    try {
                        x = s.pop(DoubleHeadIntStack.AorB.StackB);
                        System.out.println("팝한 데이터는 " + x + "입니다.");
                    } catch (DoubleHeadIntStack.EmptyDoubleHeadIntStackException e) {
                        System.out.println("스택이 비어 있습니다.");
                    }
                }

                case 9 -> { // B에서 피크
                    try {
                        x = s.peek(DoubleHeadIntStack.AorB.StackB);
                        System.out.println("피크한 데이터는 " + x + "입니다.");
                    } catch (DoubleHeadIntStack.EmptyDoubleHeadIntStackException e) {
                        System.out.println("스택이 비어 있습니다.");
                    }
                }

                case 10 -> { // B를 덤프
                    s.dump(DoubleHeadIntStack.AorB.StackB);
                }

                case 11 -> { // B에서 검색
                    System.out.print("검색할 데이터: ");
                    x = scanner.nextInt();
                    n = s.indexOf(DoubleHeadIntStack.AorB.StackB, x);
                    if(n >= 0)
                        System.out.println("꼭대기에서 " + (s.size(DoubleHeadIntStack.AorB.StackB) - (s.getCapacity() - n) + 1) + "번째에 있습니다.");
                    else
                        System.out.println("그 데이터가 없습니다.");
                }

                case 12 -> { // B 비우기
                    s.clear(DoubleHeadIntStack.AorB.StackB);
                }

                case 13 -> { // 데이터 출력
                    System.out.println("용량: " + s.getCapacity());
                    System.out.println("A의 데이터수: " + s.size(DoubleHeadIntStack.AorB.StackA));
                    System.out.println("B의 데이터수: " + s.size(DoubleHeadIntStack.AorB.StackB));
                    System.out.println("A는 비어 " + (s.isEmpty(DoubleHeadIntStack.AorB.StackA) ? "있습니다." : "있지 않습니다."));
                    System.out.println("B는 비어 " + (s.isEmpty(DoubleHeadIntStack.AorB.StackB) ? "있습니다." : "있지 않습니다."));
                    System.out.println("가득 차 " + (s.isFull() ? "있습니다" : "있지 않습니다."));
                }
            }
        }
    }
}
/*
현재 데이터 개수: A -0 / B -0
( 1) A 푸시 ( 2) A 팝 ( 3) A 피크 ( 4) A 덤프 ( 5) A 검색 ( 6) A 비움
( 7) B 푸시 ( 8) B 팝 ( 9) B 피크 (10) B 덤프 (11) B 검색 (12) B 비움
(13)   출력 ( 0) 종료 : 1
데이터: 1
현재 데이터 개수: A -1 / B -0
데이터: 3
현재 데이터 개수: A -2 / B -0
데이터: 5

현재 데이터 개수: A -3 / B -0
( 1) A 푸시 ( 2) A 팝 ( 3) A 피크 ( 4) A 덤프 ( 5) A 검색 ( 6) A 비움
( 7) B 푸시 ( 8) B 팝 ( 9) B 피크 (10) B 덤프 (11) B 검색 (12) B 비움
(13)   출력 ( 0) 종료 : 7
데이터: 0
현재 데이터 개수: A -3 / B -1
데이터: 8
현재 데이터 개수: A -3 / B -2
데이터: 6

현재 데이터 개수: A -3 / B -3
( 1) A 푸시 ( 2) A 팝 ( 3) A 피크 ( 4) A 덤프 ( 5) A 검색 ( 6) A 비움
( 7) B 푸시 ( 8) B 팝 ( 9) B 피크 (10) B 덤프 (11) B 검색 (12) B 비움
(13)   출력 ( 0) 종료 : 2
팝한 데이터는 5입니다.
현재 데이터 개수: A -2 / B -3
( 1) A 푸시 ( 2) A 팝 ( 3) A 피크 ( 4) A 덤프 ( 5) A 검색 ( 6) A 비움
( 7) B 푸시 ( 8) B 팝 ( 9) B 피크 (10) B 덤프 (11) B 검색 (12) B 비움
(13)   출력 ( 0) 종료 : 8
팝한 데이터는 6입니다.

현재 데이터 개수: A -2 / B -2
( 1) A 푸시 ( 2) A 팝 ( 3) A 피크 ( 4) A 덤프 ( 5) A 검색 ( 6) A 비움
( 7) B 푸시 ( 8) B 팝 ( 9) B 피크 (10) B 덤프 (11) B 검색 (12) B 비움
(13)   출력 ( 0) 종료 : 3
피크한 데이터는 3입니다.
현재 데이터 개수: A -2 / B -2
( 1) A 푸시 ( 2) A 팝 ( 3) A 피크 ( 4) A 덤프 ( 5) A 검색 ( 6) A 비움
( 7) B 푸시 ( 8) B 팝 ( 9) B 피크 (10) B 덤프 (11) B 검색 (12) B 비움
(13)   출력 ( 0) 종료 : 9
피크한 데이터는 8입니다.

현재 데이터 개수: A -2 / B -2
( 1) A 푸시 ( 2) A 팝 ( 3) A 피크 ( 4) A 덤프 ( 5) A 검색 ( 6) A 비움
( 7) B 푸시 ( 8) B 팝 ( 9) B 피크 (10) B 덤프 (11) B 검색 (12) B 비움
(13)   출력 ( 0) 종료 : 4
1 3
현재 데이터 개수: A -2 / B -2
( 1) A 푸시 ( 2) A 팝 ( 3) A 피크 ( 4) A 덤프 ( 5) A 검색 ( 6) A 비움
( 7) B 푸시 ( 8) B 팝 ( 9) B 피크 (10) B 덤프 (11) B 검색 (12) B 비움
(13)   출력 ( 0) 종료 : 10
0 8

현재 데이터 개수: A -2 / B -2
( 1) A 푸시 ( 2) A 팝 ( 3) A 피크 ( 4) A 덤프 ( 5) A 검색 ( 6) A 비움
( 7) B 푸시 ( 8) B 팝 ( 9) B 피크 (10) B 덤프 (11) B 검색 (12) B 비움
(13)   출력 ( 0) 종료 : 5
검색할 데이터: 3
꼭대기에서 1번째에 있습니다.
현재 데이터 개수: A -2 / B -2
( 1) A 푸시 ( 2) A 팝 ( 3) A 피크 ( 4) A 덤프 ( 5) A 검색 ( 6) A 비움
( 7) B 푸시 ( 8) B 팝 ( 9) B 피크 (10) B 덤프 (11) B 검색 (12) B 비움
(13)   출력 ( 0) 종료 : 11
검색할 데이터: 0
꼭대기에서 2번째에 있습니다.

현재 데이터 개수: A -2 / B -2
( 1) A 푸시 ( 2) A 팝 ( 3) A 피크 ( 4) A 덤프 ( 5) A 검색 ( 6) A 비움
( 7) B 푸시 ( 8) B 팝 ( 9) B 피크 (10) B 덤프 (11) B 검색 (12) B 비움
(13)   출력 ( 0) 종료 : 6
현재 데이터 개수: A -0 / B -2
( 1) A 푸시 ( 2) A 팝 ( 3) A 피크 ( 4) A 덤프 ( 5) A 검색 ( 6) A 비움
( 7) B 푸시 ( 8) B 팝 ( 9) B 피크 (10) B 덤프 (11) B 검색 (12) B 비움
(13)   출력 ( 0) 종료 : 13
용량: 64
A의 데이터수: 0
B의 데이터수: 2
A는 비어 있습니다.
B는 비어 있지 않습니다.
가득 차 있지 않습니다.
현재 데이터 개수: A -0 / B -2
( 1) A 푸시 ( 2) A 팝 ( 3) A 피크 ( 4) A 덤프 ( 5) A 검색 ( 6) A 비움
( 7) B 푸시 ( 8) B 팝 ( 9) B 피크 (10) B 덤프 (11) B 검색 (12) B 비움
(13)   출력 ( 0) 종료 : 12
현재 데이터 개수: A -0 / B -0
 */