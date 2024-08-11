package ch05_4;

// 각 열에 퀸 1개를 배치하는 조합을 재귀적으로 나열
public class Ex01_queenB {
    static int[] pos = new int[8]; // 각 열에 있는 퀸의 위치

    // 각 열에 있는 퀸의 위치 출력
    static void print() {
        for (int i = 0; i < 8; i++) {
            System.out.printf("%2d", pos[i]);
        }
        System.out.println();
    }

    // i열에 퀸 배치 - i는 열, j는 행
    static void set(int i) {
        for (int j = 0; j < 8; j++) {
            pos[i] = j; // 퀸을 j행에 배치
            if (i == 7) { // 모든 열에 배치
                print();
            }
        }
    }

    public static void main(String[] args) {
        set(0); // 0열에 퀸 배치
    }
}
