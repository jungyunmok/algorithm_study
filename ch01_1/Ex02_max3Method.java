package ch01_1;

// 3개의 정숫값 가운데 최댓값 출력하기
public class Ex02_max3Method {
  // a, b, c의 최댓값 반환하는 메서드 max
  static int max(int a, int b, int c) {
    int max = a;
    if (b > max)
      max = b;
    if (c > max)
      max = c;
    return max;
  }

  public static void main(String[] args) {
    System.out.println("3,2,1 => " + max(3, 2, 1));
    System.out.println("3,2,2 => " + max(3, 2, 2));
    System.out.println("3,1,2 => " + max(3, 1, 2));
    System.out.println("3,2,3 => " + max(3, 2, 3));
    System.out.println("2,1,3 => " + max(2, 1, 3));
    System.out.println("3,3,2 => " + max(3, 3, 2));
    System.out.println("3,3,3 => " + max(3, 3, 3));
    System.out.println("2,2,3 => " + max(2, 2, 3));
    System.out.println("2,3,1 => " + max(2, 3, 1));
    System.out.println("2,3,2 => " + max(2, 3, 2));
    System.out.println("1,3,2 => " + max(1, 3, 2));
    System.out.println("2,3,3 => " + max(2, 3, 3));
    System.out.println("1,2,3 => " + max(1, 2, 3));
  }
}
