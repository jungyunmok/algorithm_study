package ch01_1;

// 아래의 메소드가 Ex06_median보다 효율이 떨어지는 이유
public class Ex08_median {
  static int med(int a, int b, int c) {
    /*
     * if ((b >= a && c<= a) || (b <= a && c >= a)
     * 여기서 b >= a 및 b <= a의 판단을 뒤집은 판단 (실질적으로 동일한 판단)이
     * 계속하여 else if ((a > b && c < b) || (b <= a && c > b) 로 수행됨
     * 즉, 처음 if가 성립하지 않는 경우 2번째 if에서도 같은 판단을 수행하므로 효율이 나빠짐
     */
    if ((b >= a && c <= a) || (b <= a && c >= a)) {
      return a;
    } else if ((a > b && c < b) || (a < b && c > b)) {
      return b;
    } else {
      return c;
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
