package ch01_1;

import java.util.Scanner;

public class Ex04_min3Method {
  // 세 값의 최솟값을 구하는 메서드
  static int min(int a, int b, int c) {
    int min = a;
    if (min > b)
      min = b;
    if (min > c)
      min = c;
    return min;
  }

  public static void main(String[] args) {
    System.out.println("1, 2, 3 => " + min(1, 2, 3));
    System.out.println("2, 3, 1 => " + min(2, 3, 1));
    System.out.println("3, 2, 1 => " + min(3, 2, 1));
    System.out.println("1, 1, 3 => " + min(1, 1, 3));
    System.out.println("2, 3, 3 => " + min(2, 3, 3));

    // 직접 입력받기
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();
    int c = scan.nextInt();
    System.out.println(a + ", " + b + ", " + c + " => " + min(a, b, c));

  }
}
