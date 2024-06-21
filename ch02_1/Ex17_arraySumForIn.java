package ch02_1;

// 배열의 모든 요소의 합을 구하여 출력(확장 for문)
public class Ex17_arraySumForIn {
    public static void main(String[] args) {
        double[] a = {1.0, 2.0, 3.0, 4.0, 5.0};

        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }

        double sum = 0; // 합계
        for(double i : a) {
            sum += i;
        }

        System.out.println("모든 요소의 합은 " + sum + "입니다.");
    }
}

/*
a[0] = 1.0
a[1] = 2.0
a[2] = 3.0
a[3] = 4.0
a[4] = 5.0
모든 요소의 합은 15.0입니다.
 */