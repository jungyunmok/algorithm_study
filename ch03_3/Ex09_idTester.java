package ch03_3;

// 아이디를 부여하는 클래스
class Id{
    // 클래스 변수 - 인스턴스와 관계없이 1개만 만들어짐
    private static int counter = 0; // 아이디를 몇 개 부여했는지 저장

    // 인스턴스 변수 - 인스턴스마다 각각 1개씩 할당됨
    private int id; // 아이디

    // 생성자
    public Id() {
        id = ++counter;
    }

    // counter를 반환하는 클래스 메서드 - 클래스 메서드(마지막 부여한 아이디 반환)
    public static int getCounter() {
        return counter;
    }

    // 아이디를 반환하는 인스턴스 메서드 - 인스턴스 메서드(개별 인스턴스의 아이디 반환)
    public int getId() {
        return id;
    }
}

public class Ex09_idTester {
    public static void main(String[] args) {
        Id a = new Id(); // 아이디 1
        Id b = new Id(); // 아이디 2

        // 인스턴스 메서드 호출 - 클래스형변수.메서드이름()
        System.out.println("a의 아이디: " + a.getId());
        System.out.println("b의 아이디: " + b.getId());

        // 클래스 메서드 호출 - 클래스이름.메서드이름()
        System.out.println("부여한 아이디의 개수: " + Id.getCounter());
    }
}

/*
a의 아이디: 1
b의 아이디: 2
부여한 아이디의 개수: 2
 */