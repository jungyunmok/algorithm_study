package ch04_1;

// 제네릭 스택
public class Stack<E> {
    private E[] stk; // 스텍용 베열
    private int capacity; // 스택 용량
    private int ptr; // 스택 포인터

    // 실헬 시 예외: 스택이 비어있음
    public static class EmptyGstackException extends RuntimeException {
        public EmptyGstackException() {
        }
    }

    // 실행 시 예외: 스택이 가득 참
    public static class OverflowGstackException extends RuntimeException {
        public OverflowGstackException() {
        }
    }

    // 생성자
    public Stack(int maxlen) {
        this.ptr = 0;
        this.capacity = maxlen;
        try {
            this.stk = (E[]) new Object[capacity]; // 스택 본체용 배열 생성
        } catch (OutOfMemoryError e) {
            // 생성할 수 없음
            capacity = 0;
        }
    }

    // 스택에 x를 푸시
    public E push(E x) throws OverflowGstackException {
        // 스택이 가득 찼을 경우
        if (ptr >= capacity) throw new OverflowGstackException();
        return stk[ptr++] = x;
    }

    // 스택에서 데이터를 팝(꼭대기 데이터 꺼냄)
    public E pop() throws EmptyGstackException {
        // 스택이 비어있을 경우
        if (ptr <= 0) throw new EmptyGstackException();
        return stk[--ptr];
    }

    // 스택에서 데이터를 피크(꼭대기 데이터 들여다봄)
    public E peak() throws EmptyGstackException {
        // 스택이 비어있을 경우
        if (ptr <= 0) throw new EmptyGstackException();
        return stk[ptr - 1];
    }

    // 스택 비우기
    public void clear() {
        ptr = 0;
    }

    // 스택에서 x를 검색해 인덱스 반환(없으면 -1)
    public int indexOf(E x) {
        // 꼭대기부터 선형검색
        for (int i = ptr - 1; i >= 0; i--) {
            if (stk[i].equals(x)) return i; // 검색 성공
        }
        return -1; // 검색 실패
    }

    // 스택 용량 반환
    public int getCapacity() {
        return capacity;
    }

    // 스택에 쌓여있는 데이터 수 반환
    public int size() {
        return ptr;
    }

    // 스택이 비어 있는가?
    public boolean isEmpty() {
        return ptr <= 0;
    }

    // 스택이 가득 찼는가?
    public boolean isFull() {
        return ptr >= capacity;
    }

    // 스택 안의 모든 데이터를 바닥부터 꼭대기까지 순서대로 출력
    public void dump() {
        if (ptr <= 0) {
            System.out.println("스택이 비어 있습니다.");
        } else {
            for (int i = 0; i < ptr; i++) {
                System.out.print(stk[i] + " ");
            }
            System.out.println();
        }
    }
}
