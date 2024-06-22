package ch02_2;

import java.util.Scanner;

// 평균 키와 시력 분포(그래프 출력)
public class Ex02_physicalExaminationEx {
    static final int VMAX = 21; // 시력 분포(0.0부터 0.1간격으로 21개)

    static class PhyscData {
        String name; // 이름
        int height; // 키
        double vision; // 시력

        // 생성자
        public PhyscData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }
    }

    // 평균 키 구하기
    static double avgHeight(PhyscData[] dat) {
        double sum = 0;

        for (int i = 0; i < dat.length; i++) {
            sum += dat[i].height;
        }

        return sum / dat.length;
    }

    // 시력 분포 구하기
    static void distVision(PhyscData[] dat, int[] dist) {
        int i = 0;

        dist[i] = 0;
        for (i = 0; i < dat.length; i++) {
            if (dat[i].vision >= 0.0 && dat[i].vision <= VMAX / 10.0) {
                dist[(int) (dat[i].vision * 10)]++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PhyscData[] x = {
                new PhyscData("강민하", 162, 0.3),
                new PhyscData("김찬우", 173, 0.7),
                new PhyscData("박준서", 175, 2.0),
                new PhyscData("유서범", 171, 1.5),
                new PhyscData("이수연", 168, 0.4),
                new PhyscData("장경오", 174, 1.2),
                new PhyscData("황지안", 169, 0.8),
        };

        int[] vdist = new int[VMAX]; // 시력의 분포

        System.out.println("<< 신체 검사 리스트 >>");
        System.out.println("이름     키     시력");
        System.out.println("------------------");
        for (int i = 0; i < x.length; i++) {
            System.out.printf("%-8s%3d%5.1f\n", x[i].name, x[i].height, x[i].vision);
        }
        System.out.printf("\n평균키: %5.1fcm\n", avgHeight(x));

        distVision(x, vdist);
        System.out.println("\n시력의 분포");
        for (int i = 0; i < VMAX; i++) {
            System.out.printf("%3.1f~: ", i / 10.0);
            for (int j = 0; j < vdist[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*
<< 신체 검사 리스트 >>
이름     키     시력
------------------
강민하     162  0.3
김찬우     173  0.7
박준서     175  2.0
유서범     171  1.5
이수연     168  0.4
장경오     174  1.2
황지안     169  0.8

평균키: 170.3cm

시력의 분포
0.0~:
0.1~:
0.2~:
0.3~: *
0.4~: *
(...생략...)
 */