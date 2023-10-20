package ch01_1;

import java.util.Scanner;

public class Ex05_min4Method {
  // 네 값의 최솟값을 구하는 메서드
  static int min(int a, int b, int c, int d) {
    int min = a;
    if (min > b)
      min = b;
    if (min > c)
      min = c;
    return min;
  }

  public static void main(String[] args) {
    System.out.println("1, 2, 3, 4 => " + min(1, 2, 3, 4));
    System.out.println("2, 3, 1, 5 => " + min(2, 3, 1, 5));
    System.out.println("3, 2, 1, 4 => " + min(3, 2, 1, 4));
    System.out.println("1, 1, 3, 2 => " + min(1, 1, 3, 2));
    System.out.println("2, 3, 3, 1 => " + min(2, 3, 3, 1));

    // 직접 입력받기
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();
    int c = scan.nextInt();
    int d = scan.nextInt();
    System.out.println(a + ", " + b + ", " + c + ", " + d + " => " + min(a, b, c, d));
  }
}
