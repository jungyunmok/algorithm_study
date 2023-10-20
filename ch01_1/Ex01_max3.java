package ch01_1;

import java.util.Scanner;

// 3개의 정숫값 입력하고 최댓값 출력하기
public class Ex01_max3 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();
    int c = scan.nextInt();
    int max = a;
    if (b > max)
      max = b;
    if (c > max)
      max = c;
    System.out.println("최댓값 => " + max);
  }
}
