package ch02_2;

import java.util.Scanner;

// 날짜 클래스
public class Ex03_YMD {
    static class YMD {
        int y; // 년
        int m; // 월(1~12)
        int d; // 일(1~31)

        // 각 월의 일수
        static int[][] mdays = {
                {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, // 평년
                {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, // 윤년
        };

        // year년의 윤년 여부 - 평년: 0 / 윤년: 1
        static int isLeap(int year) {
            return (year % 4 == 0 && year % 10 != 00 || year % 400 == 0) ? 1 : 0;
        }

        // 생성자
        YMD(int y, int m, int d) {
            this.y = y;
            this.m = m;
            this.d = d;
        }

        // n일 후의 날짜 반환
        YMD after(int n) {
            YMD temp = new YMD(this.y, this.m, this.d);

            if (n < 0) {
                return before(-n);
            }

            temp.d += n;

            while (temp.d > mdays[isLeap(temp.y)][temp.m - 1]) {
                temp.d -= mdays[isLeap(temp.y)][temp.m - 1];
                if (++temp.m > 12) {
                    temp.y++;
                    temp.m = 1;
                }
            }

            return temp;
        }

        // n일 전의 날짜 반환
        YMD before(int n) {
            YMD temp = new YMD(this.y, this.m, this.d);

            if (n < 0) {
                return after(-n);
            }

            temp.d -= n;

            while (temp.d < 1) {
                if (--temp.m < 1) {
                    temp.y--;
                    temp.m = 12;
                }
                temp.d += mdays[isLeap(temp.y)][temp.m - 1];
            }

            return temp;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("날짜를 입력하세요");
        System.out.print("년: ");
        int y = scanner.nextInt();
        System.out.print("월: ");
        int m = scanner.nextInt();
        System.out.print("일: ");
        int d = scanner.nextInt();

        YMD date = new YMD(y, m, d);

        System.out.print("며칠 전/후의 날짜를 구할까요?: ");
        int n = scanner.nextInt();

        YMD d1 = date.after(n);
        System.out.printf("%d일 후의 날짜는 %d년 %d월 %d일입니다.\n", n, d1.y, d1.m, d1.d);

        YMD d2 = date.before(n);
        System.out.printf("%d일 전의 날짜는 %d년 %d월 %d일입니다.\n", n, d2.y, d2.m, d2.d);
    }
}

/*
날짜를 입력하세요
년: 2024
월: 6
일: 22
며칠 전/후의 날짜를 구할까요?: 28
28일 후의 날짜는 2024년 7월 20일입니다.
28일 전의 날짜는 2024년 5월 25일입니다.
 */