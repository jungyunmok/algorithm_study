package ch05_4;

// 8퀸 문제 비재귀적 풀이(배치 상황을 □와 ■으로 출력)
public class Ex05_eightQueenN {
    static boolean[] flag_a = new boolean[8]; // 각 행에 퀸을 배치했는지 체크
    static boolean[] flag_b = new boolean[15]; // /대각선 방향으로 퀸을 배치했는지 체크
    static boolean[] flag_c = new boolean[15]; // \대각선 방향으로 퀸을 배치했는지 체크
    static int[] pos = new int[8]; // 각 열에 있는 퀸의 위치

    // 각 열에 있는 퀸의 위치 출력
    static void print() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.printf("%s", j == pos[i] ? "■" : "□");
            }
            System.out.println();
        }
        System.out.println();
    }

    // i열의 알맞은 위치에 퀸을 배치
    static void set(int i) {
        int j;
        int[] jStk = new int[8];

        Start : while(true) {
            j = 0;
            while (true) {
                while (j < 8) {
                    if (!flag_a[j] && !flag_b[i + j] && !flag_c[i - j + 7]) {
                        pos[i] = j; // 가로, /대각선, \대각선에 배치되지 않았을 경우 해당 위치에 배치
                        if (i == 7) {
                            print(); // 모든 열 배치 완료하면 출력
                        } else {
                            flag_a[j] = flag_b[i + j] = flag_c[i - j + 7] = true;
                            jStk[i++] = j; // i열의 행을 push
                            continue Start; // Start 부분부터 실행
                        }
                    }
                    j++; // if문 조건에 걸리지 않았을 경우(가로, 대각선에 배치되어 있을 경우) j증가
                }
                // 모든 열 배치 완료 후 j가 8이되면 while문 빠져나와 아래 실행 - 배치판단 초기화
                if(--i == -1) return;
                j = jStk[i]; // i열의 행을 pop
                flag_a[j] = flag_b[i + j] = flag_c[i - j + 7] = false;
                j++; // if문 flag 판단 위해 증가 - 모든 가로, 대각선 초기화 될때까지
            }
        }

        /*for (int j = 0; j < 8; j++) {
            if (flag_a[j] == false && // 가로(j)에 아직 배치하지 않음
                    flag_b[i + j] == false && // /대각선에 아직 배치하지 않음
                    flag_c[i - j + 7] == false) { // \대각선에 아직 배치하지 않음
                pos[i] = j; // 퀸을 j행에 배치
                if (i == 7) {
                    print(); // 모든 열 배치되면 출력
                } else {
                    flag_a[j] = flag_b[i + j] = flag_c[i - j + 7] = true;
                    set(i + 1);
                    flag_a[j] = flag_b[i + j] = flag_c[i - j + 7] = false;
                }
            }
        }*/
    }

    public static void main(String[] args) {
        set(0);
    }
}
