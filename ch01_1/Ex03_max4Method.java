package ch01_1;

import java.util.Scanner;

public class Ex03_max4Method {
  // 네 값의 최대값 구하는 메서드
  static int max(int a, int b, int c, int d) {
    int max = a;
    if (b > max)
      max = b;
    if (c > max)
      max = c;
    if (d > max)
      max = d;
    return max;
  }

  public static void main(String[] args) {
    System.out.println("1, 2, 3, 4 => " + max(1, 2, 3, 4));
    System.out.println("5, 7, 3, 2 => " + max(5, 7, 3, 2));
    System.out.println("2, 9, 3, 7 => " + max(2, 9, 3, 7));
    System.out.println("3, 2, 4, 4 => " + max(3, 2, 4, 4));
    System.out.println("5, 7, 6, 4 => " + max(5, 7, 6, 4));

    // 직접 입력받기
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();
    int c = scan.nextInt();
    int d = scan.nextInt();
    System.out.println(a + ", " + b + ", " + c + ", " + d + " => " + max(a, b, c, d));
  }
}