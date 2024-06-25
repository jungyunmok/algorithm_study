package ch03_2;

import java.util.Scanner;

// 선형 검색(보초법)
public class Ex03_seqSearchSen {
    // 요솟수가 n인 배열 a에서 key와 값이 같은 요소를 보초법으로 선형 검색
    static int seqSearchSen(int[] a, int n, int key) {
        int i = 0;

        a[n] = key; // 보초를 추가

        while (true) {
            if(a[i] == key) // 검색 성공 - 보초법을 사용해 하나의 if문만 사용
                break;
            i++;
        }
        return i == n ? -1 : i;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("요솟수: ");
        int num = scanner.nextInt();
        int[] x = new int[num + 1]; // 요솟수가 num + 1 인 배열

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = scanner.nextInt();
        }

        System.out.print("검색할 값: "); // 키값
        int key = scanner.nextInt();

        int index = seqSearchSen(x, num, key); // 배열 x에서 값이 key인 요소 검색

        if(index == -1) {
            System.out.println("그 값의 요소가 없습니다.");
        } else {
            System.out.println("그 값은 x[" + index + "]에 있습니다.");
        }
    }
}

/*
요솟수: 5
x[0]: 1
x[1]: 3
x[2]: 2
x[3]: 3
x[4]: 4
검색할 값: 3
그 값은 x[1]에 있습니다.
 */