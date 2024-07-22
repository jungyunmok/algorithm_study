package ch04_1;

import java.util.Scanner;

// 제네릭 스택 사용(Gstack 클래스의 모든 메서드 사용)
public class Ex03_stackTesterEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> s = new Stack<>(64); // 최대 64개 푸시할 수 있는 스택

        while(true) {
            System.out.printf("현재 데이터 개수: %d / %d\n", s.size(), s.getCapacity());
            System.out.print("(1) 푸시 (2) 팝 (3) 피크 (4) 덤프 (5) 검색 (6) 비움 (7) 출력 (0) 종료 : ");

            int menu = scanner.nextInt();
            if(menu == 0) break;

            String x;

            switch (menu) {
                case 1: // 푸시
                    System.out.print("데이터: ");
                    x = scanner.next();
                    try {
                        s.push(x);
                    } catch (Stack.OverflowGstackException e) {
                        System.out.println("스택이 가득 찼습니다.");
                    }
                    break;

                case 2: // 팝
                    try {
                        x = s.pop();
                        System.out.println("팝한 데이터는 " + x + "입니다.");
                    } catch (Stack.EmptyGstackException e) {
                        System.out.println("스택이 비어 있습니다.");
                    }
                    break;

                case 3: // 피크
                    try {
                        x = s.peak();
                        System.out.println("피크한 데이터는 " + x + "입니다.");
                    } catch (Stack.EmptyGstackException e) {
                        System.out.println("스택이 비어 있습니다.");
                    }
                    break;

                case 4: // 덤프
                    s.dump();
                    break;

                case 5: // 검색
                    System.out.print("검색할 데이터: ");
                    x = scanner.next();
                    int n = s.indexOf(x);
                    if(n >= 0) {
                        System.out.println("꼭대기에서 " + (s.size() - n) + "번째에 있습니다.");
                    } else {
                        System.out.println("해당 데이터가 없습ㄴ디ㅏ.");
                    }
                    break;

                case 6: // 비웁니다
                    s.clear();
                    break;

                case 7: // 데이터 출력
                    System.out.println("용량: " + s.getCapacity());
                    System.out.println("데이터수: " + s.size());
                    System.out.println("비어 " + (s.isEmpty() ? "있습니다." : "있지 않습니다."));
                    System.out.println("가득차 " + (s.isFull() ? "있습니다." : "있지 않습니다."));
                    break;
            }
        }
    }
}
/*
현재 데이터 개수: 0 / 64
(1) 푸시 (2) 팝 (3) 피크 (4) 덤프 (5) 검색 (6) 비움 (7) 출력 (0) 종료 : 1
데이터: 1
현재 데이터 개수: 1 / 64
(1) 푸시 (2) 팝 (3) 피크 (4) 덤프 (5) 검색 (6) 비움 (7) 출력 (0) 종료 : 1
데이터: 3
현재 데이터 개수: 2 / 64
(1) 푸시 (2) 팝 (3) 피크 (4) 덤프 (5) 검색 (6) 비움 (7) 출력 (0) 종료 : 1
데이터: 5

현재 데이터 개수: 3 / 64
(1) 푸시 (2) 팝 (3) 피크 (4) 덤프 (5) 검색 (6) 비움 (7) 출력 (0) 종료 : 2
팝한 데이터는 5입니다.
현재 데이터 개수: 2 / 64
(1) 푸시 (2) 팝 (3) 피크 (4) 덤프 (5) 검색 (6) 비움 (7) 출력 (0) 종료 : 3
피크한 데이터는 3입니다.
현재 데이터 개수: 2 / 64
(1) 푸시 (2) 팝 (3) 피크 (4) 덤프 (5) 검색 (6) 비움 (7) 출력 (0) 종료 : 4
1 3

현재 데이터 개수: 2 / 64
(1) 푸시 (2) 팝 (3) 피크 (4) 덤프 (5) 검색 (6) 비움 (7) 출력 (0) 종료 : 5
검색할 데이터: 1
꼭대기에서 2번째에 있습니다.
현재 데이터 개수: 2 / 64
(1) 푸시 (2) 팝 (3) 피크 (4) 덤프 (5) 검색 (6) 비움 (7) 출력 (0) 종료 : 6
현재 데이터 개수: 0 / 64
(1) 푸시 (2) 팝 (3) 피크 (4) 덤프 (5) 검색 (6) 비움 (7) 출력 (0) 종료 : 7
용량: 64
데이터수: 0
비어 있습니다.
가득차 있지 않습니다.
현재 데이터 개수: 0 / 64
 */