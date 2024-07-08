package ch03_3;

// 제네릭 클래스의 예
public class Ex13_genericClassTester {
    // 제네릭 클래스의 매개변수를 T라고 작성함
    static class GenericCless<T> {
        private T xyz;

        // 생성자
        GenericCless(T t) {
            this.xyz = t;
        }

        // xyz getter
        T getXyz() {
            return xyz;
        }
    }

    public static void main(String[] args) {
        // 아래와 같이 매개변수에 String을 넘기거나 Integer를 넘길수도 있음
        GenericCless<String> s = new GenericCless<>("ABC");
        GenericCless<Integer> n = new GenericCless<>(123);

        System.out.println(s.getXyz());
        System.out.println(n.getXyz());
    }
}

/*
ABC
123
 */