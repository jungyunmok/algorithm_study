package ch01_1;

// 세 값의 대소관계인 13가지 조합의 중앙값 구하여 출력
public class Ex07_median13 {
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
    System.out.println("3,2,1 => " + med(3, 2, 1)); // a＞b＞c
    System.out.println("3,2,2 => " + med(3, 2, 2)); // a＞b＝c
    System.out.println("3,1,2 => " + med(3, 1, 2)); // a＞c＞b
    System.out.println("3,2,3 => " + med(3, 2, 3)); // a＝c＞b
    System.out.println("2,1,3 => " + med(2, 1, 3)); // c＞a＞b
    System.out.println("3,3,2 => " + med(3, 3, 2)); // a＝b＞c
    System.out.println("3,3,3 => " + med(3, 3, 3)); // a＝b＝c
    System.out.println("2,2,3 => " + med(2, 2, 3)); // c＞a＝b
    System.out.println("2,3,1 => " + med(2, 3, 1)); // b＞a＞c
    System.out.println("2,3,2 => " + med(2, 3, 2)); // b＞a＝c
    System.out.println("1,3,2 => " + med(1, 3, 2)); // b＞c＞a
    System.out.println("2,3,3 => " + med(2, 3, 3)); // b＝c＞a
    System.out.println("1,2,3 => " + med(1, 2, 3)); // c＞b＞a
  }
}
