package ch04_1;

// 머리가 둘인 int형 고정 길이 스택
public class DoubleHeadIntStack {
    private int[] stk; // 스택 본체
    private int capacity; // 스택 용량(A, B의 합계)
    private int ptrA; // 스택포인터 A
    private int ptrB; // 스택포인터 B

    public enum AorB {StackA, StackB};

    // 실행 시 예외 - 스택이 비어 있음
    public class EmptyDoubleHeadIntStackException extends RuntimeException {
        public EmptyDoubleHeadIntStackException() {
        }
    }

    // 실행 시 예외 - 스택이 가득 참
    public class OverflowDoubleHeadIntStackException extends RuntimeException {
        public OverflowDoubleHeadIntStackException() {
        }
    }

    // 생성자
    public DoubleHeadIntStack(int maxlen) {
        ptrA = 0;
        ptrB = maxlen - 1;
        capacity = maxlen;
        try {
            stk = new int[capacity]; // 스택 본체용 배열 생성
        } catch (OutOfMemoryError e) {
            // 생성할 수 없음
            capacity = 0;
        }
    }

    // 스택에 x를 푸시
    public int push(AorB sw, int x) throws OverflowDoubleHeadIntStackException {
        if (ptrA >= ptrB + 1) {
            throw new OverflowDoubleHeadIntStackException();
        }
        switch (sw) {
            case StackA -> stk[ptrA++] = x;
            case StackB -> stk[ptrB--] = x;
        }
        return x;
    }

    // 스택에서 데이터를 팝(꼭대기 데이터 꺼냄)
    public int pop(AorB sw) throws EmptyDoubleHeadIntStackException {
        int x = 0;
        switch (sw) {
            case StackA -> {
                if (ptrA <= 0) throw new EmptyDoubleHeadIntStackException(); // 스택 A가 비어있음
                x = stk[--ptrA];
            }
            case StackB -> {
                if (ptrB >= capacity - 1) throw new EmptyDoubleHeadIntStackException(); // 스택 B가 비어있음
                x = stk[++ptrB];
            }
        }
        return x;
    }

    // 스택에서 데이터를 피크(꼭대기 데이터 들여다봄)
    public int peek(AorB sw) throws EmptyDoubleHeadIntStackException {
        int x = 0;
        switch (sw) {
            case StackA -> {
                if (ptrA <= 0) throw new EmptyDoubleHeadIntStackException(); // 스택 A가 비어있음
                x = stk[ptrA - 1];
            }
            case StackB -> {
                if (ptrB >= capacity - 1) throw new EmptyDoubleHeadIntStackException(); // 스택 B가 비어있음
                x = stk[ptrB + 1];
            }
        }
        return x;
    }

    // 스택에서 x 검색하여 인덱스(없으면 -1) 반환
    public int indexOf(AorB sw, int x) {
        switch (sw) {
            case StackA -> {
                // 꼭대기부터 선형검색
                for (int i = ptrA - 1; i >= 0; i--) {
                    if (stk[i] == x) return i; // 검색 성공
                }
            }
            case StackB -> {
                // 꼭대기부터 선형검색
                for (int i = ptrB + 1; i < capacity; i++) {
                    if (stk[i] == x) return i; // 검색 성공
                }
            }
        }
        return -1; // 검색 실패
    }

    // 스택 비우기
    public void clear(AorB sw) {
        switch (sw) {
            case StackA -> ptrA = 0;
            case StackB -> ptrB = capacity - 1;
        }
    }

    // 스택 용량 반환(A와 B의 합계)
    public int getCapacity() {
        return capacity;
    }

    // 스택의 데이터 수 반환
    public int size(AorB sw) {
        switch (sw) {
            case StackA -> {
                return ptrA;
            }
            case StackB -> {
                return capacity - ptrB - 1;
            }
        }
        return 0;
    }

    // 스택이 비어 있는가
    public boolean isEmpty(AorB sw) {
        switch (sw) {
            case StackA -> {
                return ptrA <= 0;
            }
            case StackB -> {
                return ptrB >= capacity - 1;
            }
        }
        return true;
    }

    // 스택이 가득 찼는가
    public boolean isFull() {
        return ptrA >= ptrB + 1;
    }

    // 스택 안 모든 데이터를 바닥에서 꼭대기 순서로 출력
    public void dump(AorB sw) {
        switch (sw) {
            case StackA -> {
                if (ptrA <= 0)
                    System.out.println("스택이 비어 있습니다.");
                else
                    for (int i = 0; i < ptrA; i++) {
                        System.out.print(stk[i] + " ");
                    }
                System.out.println();
            }
            case StackB -> {
                if (ptrB >= capacity - 1)
                    System.out.println("스택이 비어 있습니다.");
                else
                    for (int i = capacity - 1; i > ptrB; i--) {
                        System.out.print(stk[i] + " ");
                    }
                System.out.println();
            }
        }
    }
}
