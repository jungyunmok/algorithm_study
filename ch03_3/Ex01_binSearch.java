package ch03_3;

import java.util.Scanner;

// 이진 검색
public class Ex01_binSearch {
    // 요솟수가 n개인 배열 a에서 key와 같은 요소를 이진 검색
    static int binSearch(int[] a, int n, int key) {
        int pl = 0; // 검색 범위의 첫 인덱스
        int pr = n - 1; // 검색 범위의 끝 인덱스

        do {
            int pc = (pl + pr) / 2; // 중앙 요소의 인덱스
            if(a[pc] == key) {
                return pc; // 검색 성공
            }
            else if (a[pc] < key) {
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
        int[] x = new int[num]; // 요솟수가 num인 배열

        System.out.println("오름차순으로 입력하세요.");

        System.out.print("x[0]: ");
        x[0] = scanner.nextInt();

        for (int i = 1; i < num; i++) {
            do{
                System.out.print("x[" + i + "]: ");
                x[i] = scanner.nextInt();
            } while (x[i] < x[i - 1]); // 바로 앞 요소보다 작으면 다시 입력
        }

        System.out.print("검색할 값: ");
        int key = scanner.nextInt();

        int index = binSearch(x, num, key); // 배열 x에서 값이 key인 요소 검색

        if(index == -1) {
            System.out.println("그 값의 요소가 없습니다.");
        } else {
            System.out.println("그 값은 x[" + index + "]에 있습니다.");
        }
    }
}

/*
요솟수: 5
오름차순으로 입력하세요.
x[0]: 1
x[1]: 3
x[2]: 5
x[3]: 7
x[4]: 9
검색할 값: 3
그 값은 x[1]에 있습니다.
 */