package ch02_1;

import java.util.Scanner;

// 기수 변환 과정 출력 프로그램
public class Ex12_cardConv {
    // 정숫값 no를 cd진수로 변환하여 배열 cno에 역순으로 저장하고 자릿수 반환
    static int cardConv(int no, int cd, char[] cno) {
        int n = ((Integer) no).toString().length(); // 변환 전 자릿수
        int dno = 0; // 변환 후 자릿수
        String dChar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        System.out.printf(String.format("%%2d | %%%dd\n", n), cd, no);

        do {
            System.out.printf("   +");
            System.out.print("-".repeat(n + 2));
            System.out.println();

            if (no / cd != 0) {
                System.out.printf(String.format("%%2d | %%%dd    ... %%d\n", n), cd, no / cd, no % cd);
            } else {
                System.out.printf(String.format("     %%%dd    ... %%d\n", n), no / cd, no % cd);
            }

            cno[dno++] = dChar.charAt(no % cd); // cd로 나눈 나머지를 저장
            no /= cd;
        } while (no != 0);

        // 역순으로 정렬
        for (int i = 0; i < dno / 2; i++) {
            char temp = cno[i];
            cno[i] = cno[dno - i - 1];
            cno[dno - i - 1] = temp;
        }

        return dno;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int no; // 변환하는 정수
        int cd; // 기수
        int dno; // 변환 후의 자릿수
        int retry; // 재시작
        char[] cno = new char[32]; // 변환 후 각 자리 숫자 넣어두는 배열

        do {
            System.out.println("10진수를 기수 변환합니다.");
            do {
                System.out.print("변환하는 음이 아닌 정수: ");
                no = scanner.nextInt();
            } while (no < 0);

            do {
                System.out.print("변환하고자 하는 진수(2~36): ");
                cd = scanner.nextInt();
            } while (cd < 2 || cd > 36);

            dno = cardConv(no, cd, cno); // no를 cd진수로 변환

            System.out.print(cd + "진수로 ");
            for (int i = 0; i < dno; i++) {
                System.out.print(cno[i]);
            }
            System.out.println("입니다.");
            System.out.print("한 번 더 할까요? (1. 예 / 0. 아니요): ");
            retry = scanner.nextInt();
        } while (retry == 1);
    }
}

/*
10진수를 기수 변환합니다.
변환하는 음이 아닌 정수: 59
변환하고자 하는 진수(2~36): 2
 2 | 59
   +----
 2 | 29    ... 1
   +----
 2 | 14    ... 1
   +----
 2 |  7    ... 0
   +----
 2 |  3    ... 1
   +----
 2 |  1    ... 1
   +----
      0    ... 1
2진수로 111011입니다.
한 번 더 할까요? (1. 예 / 0. 아니요): 0
 */