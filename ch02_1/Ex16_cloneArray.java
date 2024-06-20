package ch02_1;

import java.util.Arrays;

// 배열 복제
public class Ex16_cloneArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = a.clone(); // b는 a의 복제를 참조

        b[3] = 0; // 한 요소에만 0 대입

        System.out.println("a = " + Arrays.toString(a));
        System.out.println("b = " + Arrays.toString(b));
    }
}

/*
a = [1, 2, 3, 4, 5]
b = [1, 2, 3, 0, 5]
 */