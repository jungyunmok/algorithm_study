package ch01_1;

import java.util.Scanner;

// 3개의 정숫값을 입력하고 중앙값 출력
public class Ex06_median {
  static int med(int a, int b, int c) {
    if (a >= b) {
      if (b >= c) {
        return b;
      } else if (a <= c) {
        return a;
      } else {
        return c;
      }
    } else if (a > c) {
      return a;
    } else if (b > c) {
      return c;
    } else {
      return b;
    }
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();
    int c = scan.nextInt();
    System.out.println(a + "," + b + "," + c + " => " + med(a, b, c));
  }
}
