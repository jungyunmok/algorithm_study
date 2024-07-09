package ch04_1;

// int형 고정 길이 스택
public class Ex01_intStack {
    private int[] stk; // 스택용 배열
    private int capacity; // 스택 용량
    private int ptr; // 스택 포인터 - 스택에 쌓여있는 데이터 수

    // 실행 시 예외 - 스택이 비어 있음
    public class EmptyIntStackException extends RuntimeException {
        public EmptyIntStackException() {}
    }

    // 실행 시 예외 - 스택이 가득 참
    public class OverflowStackException extends RuntimeException {
        public OverflowStackException() {}
    }

    // 생성자
    public Ex01_intStack(int maxlen) {
        ptr = 0;
        capacity = maxlen;
        try {
            // 스택 본체용 배열 생성
            stk = new int[capacity];
        } catch (OutOfMemoryError e) {
            // 배열을 생성할 수 없음
            capacity = 0;
        }
    }

    // 스택에 x를 푸시
    public int push(int x) throws OverflowStackException {
        // ptr == capacity와 같지만 안정성 향상을 위해 ptr >= capacity 사용
        if(ptr >= capacity) {
            // 스택이 가득 참
            throw new OverflowStackException();
        }
        return stk[ptr++] = x;
    }

    // 스택에서 데이터를 팝(가장 최근 데이터를 꺼냄)
    public int pop() throws EmptyIntStackException {
        if(ptr <= 0) {
            // 스택이 비어 있음
            throw new EmptyIntStackException();
        }
        return stk[--ptr];
    }

    // 스택에서 데이터를 피크(가장 최근 데이터 조회)
    public int peek() throws EmptyIntStackException {
        // ptr == 0 과 같지만 안정성 향상을 위해 ptr <= 0 사용
        if(ptr <= 0) {
            throw new EmptyIntStackException();
        }
        return stk[ptr - 1];
    }

    // 스택을 비움 - 스택포인터로 푸시, 팝 과정이 이루어지기에 배열 요솟값 변경 필요없음
    public void clear() {
        ptr = 0;
    }

    // 스택에서 x를 찾아 인덱스(없으면 -1)를 반환
    public int indexOf(int x) {
        // 가장 최근부터 선형 검색
        for (int i = ptr - 1; i >= 0; i--) {
            if(stk[i] == x) {
                return i; // 검색 성공
            }
        }
        return -1; // 검색 실패
    }

    // 스택의 용량을 반환
    public int getCapacity() {
        return capacity;
    }

    // 스택에 쌓여 있는 데이터 개수를 반환
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

    // 스택 안의 모든 데이터를 바닥 -> 꼭대기(과거->최근) 순서로 출력
    public void dump() {
        if(ptr <= 0) {
            System.out.println("스택이 비어 있습니다.");
        } else {
            for (int i = 0; i < ptr; i++) {
                System.out.print(stk[i] + " ");
            }
            System.out.println();
        }
    }
}
