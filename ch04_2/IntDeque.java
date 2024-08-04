package ch04_2;

// int형 고정 길이 덱
public class IntDeque {

    // 실행 시 예외 - 큐가 비어 있음
    public class EmptyIntDequeException extends RuntimeException {
        public EmptyIntDequeException() {
        }
    }

    // 실행 시 예외 - 큐가 가득 참
    public class OverflowIntDequeException extends RuntimeException {
        public OverflowIntDequeException() {
        }
    }

    private int[] que; // 덱 본체
    private int capacity; // 덱 용량
    private int num; // 현재 데이터 개수
    private int front; // 맨 앞 요소 커서
    private int rear; // 맨 끝 요소 커서

    // 생성자
    public IntDeque(int maxlen) {
        num = front = rear = 0;
        capacity = maxlen;
        try {
            que = new int[capacity]; // 덱 본체용 배열 생성
        } catch (OutOfMemoryError error) { // 생성할 수 없음
            capacity = 0;
        }
    }

    // 덱 맨앞에 데이터 인큐
    public int enqueFront(int x) throws OverflowIntDequeException {
        if (num >= capacity) throw new OverflowIntDequeException(); // 덱이 가득 참
        num++;
        if (--front < 0) {
            front = capacity - 1;
        }
        que[front] = x;
        return x;
    }

    // 덱 맨끝에 데이터 인큐
    public int enqueRear(int x) throws OverflowIntDequeException {
        if (num >= capacity) throw new OverflowIntDequeException(); // 덱이 가득 참
        que[rear++] = x;
        num++;
        if (rear == capacity) {
            rear = 0;
        }
        return x;
    }

    // 덱의 맨앞 데이터 디큐
    public int dequeFront() throws EmptyIntDequeException {
        if (num <= 0) throw new EmptyIntDequeException(); // 덱이 비어있음
        int x = que[front++];
        num--;
        if (front == capacity) {
            front = 0;
        }
        return x;
    }

    // 덱의 맨끝 데이터 디큐
    public int dequeRear() throws EmptyIntDequeException {
        if (num <= 0) throw new EmptyIntDequeException(); // 덱이 비어있음
        num--;
        if (--rear < 0) {
            rear = capacity - 1;
        }
        return que[rear];
    }

    // 맨앞 데이터 들여다봄
    public int peekFront() throws EmptyIntDequeException {
        if (num <= 0) throw new EmptyIntDequeException(); // 덱이 비어있음
        return que[front];
    }

    // 맨끝 데이터 들여다봄
    public int peekRear() throws EmptyIntDequeException {
        if (num <= 0) throw new EmptyIntDequeException(); // 덱이 비어있음
        return que[rear == 0 ? capacity - 1 : rear - 1];
    }

    // 덱에서 x 검색해 인덱스(없으면 -1) 반환
    public int indexOf(int x) {
        for (int i = 0; i < num; i++) {
            int idx = (i + front) % capacity;
            if (que[idx] == x) return idx; // 검색 성공
        }
        return -1; // 검색 실패
    }

    // 덱에서 x 검색해 맨앞에서 몇번째인지(없으면 0) 반환
    public int search(int x) {
        for (int i = 0; i < num; i++) {
            if (que[(i + front) % capacity] == x) return i + 1; // 검색 성공
        }
        return 0; // 검색 실패
    }

    // 덱 비우기
    public void clear() {
        num = front = rear = 0;
    }

    // 덱 용량 반환
    public int getCapacity() {
        return capacity;
    }

    // 덱에 쌓여있는 데이터 수 반환
    public int size() {
        return num;
    }

    // 덱이 비어 있는가
    public boolean isEmpty() {
        return num <= 0;
    }

    // 덱이 가득 찼는가
    public boolean isFull() {
        return num >= capacity;
    }

    // 덱 안의 모든 데이터를 맨앞부터 맨끝까지 출력
    public void dump() {
        if(num <= 0) {
            System.out.println("덱이 비어 있습니다.");
        } else {
            for (int i = 0; i < num; i++) {
                System.out.println(que[(i + front) % capacity] + " ");
            }
            System.out.println();
        }
    }
}
