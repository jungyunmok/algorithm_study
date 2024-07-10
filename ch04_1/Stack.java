package ch04_1;

public class Stack<E> {
    private E[] stk; // 스텍용 베열
    private int capacity; // 스택 용량
    private int ptr; // 스택 포인터

    // 생성자
    public Stack (E[] stk, int capacity) {
        this.stk = stk;
        this.capacity = capacity;
        this.ptr = 0;
    }



}
