package ch03_3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

// 신체검사 데이터 배열에서 이진 검색(시력)
public class Ex12_physExamSearch {
    // 신체검사 데이터 정의
    static class PhyscData {
        private String name; // 이름
        private int height; // 키
        private double vision; // 시력

        // 생성자
        public PhyscData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }

        // 문자열로 만들어 반환하는 메서드
        public String toString() {
            return name + " " + height + " " + vision;
        }

        // 시력 내림차순 정렬을 위한 comparator
        public static final Comparator<PhyscData> VISION_ORDER = new VisionOrderComparator();

        private static class VisionOrderComparator implements Comparator<PhyscData> {
            public int compare(PhyscData d1, PhyscData d2) {
                return (d1.vision > d2.vision) ? 1 : (d1.vision < d2.vision) ? -1 : 0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhyscData[] x = {
                // 배열 요소는 시력 오름차순으로 정렬
                new PhyscData("강민하", 162, 0.3),
                new PhyscData("이수연", 168, 0.4),
                new PhyscData("김찬우", 173, 0.7),
                new PhyscData("황지안", 169, 0.8),
                new PhyscData("장경오", 174, 1.2),
                new PhyscData("유서범", 171, 1.5),
                new PhyscData("박준서", 175, 2.0),
        };
        System.out.print("검색할 시력: ");
        double vision = scanner.nextDouble();
        int idx = Arrays.binarySearch(
                x, // 배열 x에서
                new PhyscData("", 0, vision), // 시력이 vision인 요소를
                PhyscData.VISION_ORDER // VISION_ORDER에 의해 검색
                );

        if(idx < 0) {
            System.out.println("그 값의 요소가 없습니다.");
        } else {
            System.out.println("그 값은 x[" + idx + "]에 있습니다.");
            System.out.println("찾은 데이터: " + x[idx]); // 묵시적으로, toString 메서드가 호출됨
        }
    }
}

/*
검색할 시력: 0.8
그 값은 x[3]에 있습니다.
찾은 데이터: 황지안 169 0.8
 */