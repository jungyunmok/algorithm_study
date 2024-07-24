package ch04_2;

// int형 고정 길이 큐
public class IntQueue {
    private int[] que; // 큐용 배열
    private int capacity; // 큐의 용량
    private int front; // 맨 앞의 요소 커서
    private int rear; // 맨 뒤의 요소 커서
    private int num; // 현재 데이터 개수

    // 실행시 예외 - 큐가 비어 있음
    public class EmptyIntQueueException extends RuntimeException {
        public EmptyIntQueueException() {
        }
    }

    // 실행시 예외 - 큐가 가득 참
    public class OverflowIntQueueException extends RuntimeException {
        public OverflowIntQueueException() {
        }
    }

    // 생성자
    public IntQueue(int maxlen) {
        num = front = rear = 0;
        capacity = maxlen;
        try {
            que = new int[capacity]; // 큐 본체용 배열 생성
        } catch (OutOfMemoryError e) { // 생성할 수 없음
            capacity = 0;
        }
    }

    // 큐에 데이터를 인큐
    public int enque(int x) throws OverflowIntQueueException {
        if (num >= capacity) throw new OverflowIntQueueException(); // 큐가 가득 참
        que[rear++] = x;
        num++;
        if (rear == capacity) {
            // 배열 용량(마지막 인덱스)과 같아지면 첫 인덱스로 변경
            rear = 0;
        }
        return x;
    }

    // 큐에 데이터를 디큐
    public int deque() throws EmptyIntQueueException {
        if (num <= 0) throw new EmptyIntQueueException(); // 큐가 비어 있음
        int x = que[front++];
        num--;
        if (front == capacity) {
            // 배열 용량(마지막 인덱스)과 같아지면 첫 인덱스로 변경
            front = 0;
        }
        return x;
    }

    // 큐 데이터 피크(프런트 데이터 들여다봄)
    public int peek() throws EmptyIntQueueException {
        if (num <= 0) throw new EmptyIntQueueException(); // 큐가 비어 있음
        return que[front];
    }

    // 큐를 비움
    public void clear() {
        num = front = rear = 0;
    }

    // 큐에서 x 검색하여 인덱스(없으면 -1) 반환
    public int indexOf(int x) {
        for (int i = 0; i < num; i++) {
            int idx = (i + front) % capacity;
            if (que[idx] == x) return idx; // 검색 성공
        }
        return -1; // 검색 실패
    }

    // 큐 용량 반환
    public int getCapacity() {
        return capacity;
    }

    // 큐 데이터 개수 반환
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

    // 큐 안의 모든 데이터를 프런트->리어 순으로 출력
    public void dump() {
        if (num <= 0) {
            System.out.println("큐가 비어 있습니다.");
        } else {
            for (int i = 0; i < num; i++) {
                System.out.print(que[(i + front) % capacity] + " ");
            }
            System.out.println();
        }
    }
}