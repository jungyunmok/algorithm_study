package ch04_2;

// 제네릭 큐
public class Queue<E> {
    // 실행 시 예외 - 큐가 비어 있음
    public static class EmptyGqueueException extends RuntimeException {
        public EmptyGqueueException() {}
    }

    // 실행 시 예외 - 큐가 가득 참
    public static class OverflowGqueueException extends RuntimeException {
        public OverflowGqueueException() {}
    }

    private E[] que; // 큐 본체
    private int capacity; // 큐 용량
    private int num; // 현재 데이터 개수
    private int front; // 맨앞 요소 커서
    private int rear; // 맨끝 요소 커서

    // 생성자
    public Queue(int maxlen) {
        num = front = rear = 0;
        capacity = maxlen;
        try {
            que = (E[]) new Object[capacity]; // 큐 본체용 배열 생성
        } catch (OutOfMemoryError e) { // 생성할 수 없음
            capacity = 0;
        }
    }

    // 큐에 데이터를 인큐
    public E enque(E x) throws OverflowGqueueException {
        if(num >= capacity) throw new OverflowGqueueException(); // 큐가 가득 참
        que[rear++] = x;
        num ++;
        if(rear == capacity) rear = 0;
        return x;
    }

    // 큐에서 데이터를 디큐
    public E deque() throws EmptyGqueueException {
        if(num <= 0) throw new EmptyGqueueException(); // 큐가 비어 있음
        E x = que[front++];
        num--;
        if(front == capacity) front = 0;
        return x;
    }

    // 큐에서 데이터 피크(맨 앞 데이터 들여다봄)
    public E peek() throws EmptyGqueueException {
        if(num <= 0) throw new EmptyGqueueException(); // 큐가 비어 있음
        return que[front];
    }

    // 큐에서 x 검색하여 인덱스(없으면 -1) 반환
    public int indexOf(E x) {
        for (int i = 0; i < num; i++) {
            if (que[(i + front) % capacity].equals(x)) {
                return (i + front) % capacity; // 검색 성공
            }
        }
        return -1; // 검색 실패
    }

    // 큐에서 x 검색하여 맨앞에서 몇번째인지(없으면 -1) 반환
    public int search(E x) {
        for (int i = 0; i < num; i++) {
            if(que[(i + front) % capacity].equals(x)) {
                return i + 1; // 검색 성공
            }
        }
        return -1; // 검섹 실패
    }

    // 큐 비우기
    public void clear() {
        num = front = rear = 0;
    }

    // 큐 용량 반환
    public int getCapacity() {
        return capacity;
    }

    // 큐 데이터 수 반환
    public int size() {
        return num;
    }

    // 큐가 비어 있는가
    public boolean isEmpty() {
        return num <= 0;
    }

    // 큐가 가득 찼는가
    public boolean isFull() {
        return num >= capacity;
    }

    // 큐의 모든 데이터를 맨앞부터 맨끝까지 출력
    public void dump() {
        if(num <= 0) {
            System.out.println("큐가 비어 있습니다.");
        } else {
            for (int i = 0; i < num; i++) {
                System.out.print(que[(i + front) % capacity].toString() + " ");
            }
            System.out.println();
        }
    }
}
