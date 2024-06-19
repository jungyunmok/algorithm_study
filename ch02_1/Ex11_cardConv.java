package ch02_1;

import java.util.Scanner;

// 입력받은 10진수를 2진수~36진수로 기수 변환 출력
public class Ex11_cardConv {
    // 정숫값 x를 r진수로 변환하여 배열 d에 아랫자리부터 넣어두고 자릿수 반환
    static int cardConv(int x, int r, char[] d) {
        int digits = 0; // 변환 후 자릿수
        String dChar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do {
            d[digits++] = dChar.charAt(x % r); // r로 나눈 나머지 저장
            x /= r;
        } while (x != 0);

        // 배열 d를 역순으로 정렬
        for (int i = 0; i < digits / 2; i++) {
            char t = d[i];
            d[i] = d[digits - i - 1];
            d[digits - i - 1] = t;
        }

        return digits;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int no; // 변환하는 정수
        int cd; // 기수
        int dno; // 변환 후의 자릿수
        int retry; // 재시도 변수
        char[] cno = new char[32]; // 변환 후 각 자리 숫자 넣어두는 배열

        System.out.println("10진수를 기수 변환합니다.");
        do {
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
2진수로 111011입니다.
한 번 더 할까요? (1. 예 / 0. 아니요): 0
 */