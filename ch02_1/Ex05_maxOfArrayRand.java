package ch02_1;

import java.util.Random;

// 배열 요소의 최댓값을 출력(값을 난수로 생성)
public class Ex05_maxOfArrayRand {
    // 배열 a의 최댓값을 구하여 반환
    static int maxOf(int[] a) {
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) max = a[i];
        }
        return max;
    }

    public static void maiㅎㅑn(String[] args) {
        Random random = new Random();

        System.out.println("키의 최댓값을 구합니다.");

        int num = random.nextInt(10) + 1;
        System.out.println("사람 수: " + num);

        int[] height = new int[num];

        System.out.println("킷값은 아래와 같습니다.");
        for (int i = 0; i < num; i++) {
            height[i] = 100 + random.nextInt(90);
            System.out.println("height[" + i + "]: " + height[i]);
        }

        System.out.println("최댓값은 " + maxOf(height) + "입니다");
    }
}
