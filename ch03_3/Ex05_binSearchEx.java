package ch03_3;

import java.util.Scanner;

// 이진검색(검색 과정 출력)
public class Ex05_binSearchEx {
    // 배열 a의 앞쪽 n개의 요소에서 key와 일치하는 요소를 이진검색(검색 과정 출력)
    static int binSearchEx(int[] a, int n, int key) {
        System.out.print("   |");

        for (int i = 0; i < n; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();

        System.out.print("---+");
        for (int i = 0; i < 4 * n + 2; i++) {
            System.out.print("-");
        }
        System.out.println();

        int pl = 0; // 검색 범위 맨 앞 인덱스
        int pr = n - 1; // 검색 범위 맨 끝 인덱스

        do {
            int pc = (pl + pr) / 2; // 중앙 요소의 인덱스
            System.out.print("   |");

            if (pl != pc) {
                System.out.printf(String.format("%%%ds<-%%%ds+",
                        (pl * 4) + 1, (pc - pl) * 4), "", "");
            } else {
                System.out.printf(String.format("%%%ds<-+", pc * 4 + 1), "");
            }

            if (pc != pr) {
                System.out.printf(String.format("%%%ds->\n", (pr - pc) * 4 - 2), "");
            } else {
                System.out.println("->");
            }

            System.out.printf("%3d|", pc);

            for (int i = 0; i < n; i++) {
                System.out.printf("%4d", a[i]);
            }
            System.out.println("\n   |");

            if (a[pc] == key) {
                return pc; // 검색 성공
            } else if (a[pc] < key) {
                pl = pc + 1; // 검색 범위를 뒤쪽 절반으로 좁힘
            } else {
                pr = pc - 1; // 검색 범위를 앞쪽 절반으로 좁힘
            }
        } while (pl <= pr);

        return -1; // 검색 실패
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("요솟수: ");
        int num = scanner.nextInt();
        int[] a = new int[num];

        System.out.println("오름차순으로 입력하세요.");

        System.out.print("a[0]: ");
        a[0] = scanner.nextInt();

        for (int i = 1; i < num; i++) {
            do {
                System.out.print("a[" + i + "]: ");
                a[i] = scanner.nextInt();
            } while (a[i] < a[i - 1]); // 바로 앞 요소보다 작으면 다시 입력
        }

        System.out.print("검색 값: ");
        int key = scanner.nextInt();

        int idx = binSearchEx(a, num, key);

        if(idx == -1) {
            System.out.println("그 값의 요소는 존재하지 않습니다.");
        } else {
            System.out.println("그 값은 a[" + idx + "]에 있습니다.");
        }
    }
}

/*
검색 값: 2
   |   0   1   2   3   4   5   6
---+------------------------------
   | <-            +          ->
  3|   1   2   3   5   6   8   9
   |
   | <-    +  ->
  1|   1   2   3   5   6   8   9
   |
그 값은 a[1]에 있습니다.
 */