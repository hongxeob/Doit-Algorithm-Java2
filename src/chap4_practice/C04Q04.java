package chap4_practice;

import java.text.Format;

public class C04Q04 {
    private int[] que; // 큐의 본체
    private int capacity; // 큐의 용량
    private int num; // 현재 데이터 수
    private int front;
    private int rear;

    //예외 : 빈 큐
    public class EmptyInStackException extends RuntimeException {
        public EmptyInStackException() {
        }
    }

    //예외 : 가득 찬 큐
    public class OverflowInStackException extends RuntimeException {
        public OverflowInStackException() {
        }
    }

    public C04Q04(int maxlen) {
        num = 0;
        capacity = maxlen;
        try {
            que = new int[capacity];
        } catch (OutOfMemoryError error) {
            capacity = 0;
        }
    }

    // 인큐 메서드
    public int enque(int x) throws OverflowInStackException {
        if (num >= capacity) {
            throw new OverflowInStackException();
        }
        que[rear++] = x;
        num++;
        if (rear == capacity) {
            rear = 0;
        }

        return x;
    }

    // 디큐 메서드
    public int deque() throws EmptyInStackException {
        if (num <= 0) {
            throw new EmptyInStackException();
        }
        int x = que[front++];
        num--;
        if (front == capacity) {
            front = 0;
        }
        return x;
    }

    //큐에서 데이터를 peek(들여다본다)
    public int peek() throws EmptyInStackException {
        if (num <= 0) {
            throw new EmptyInStackException();
        }
        return que[front];
    }

    //큐의 데이터를 초기화
    public void clear() {
        num = front = rear = 0;
    }

    //큐에서 x를 검색하여 인덱스(찾지 못하면-1)반환
    public int inndexOf(int x) {
        for (int i = 0; i < num; i++) {
            int idx = (i + front) % capacity;
            if (que[idx] == x) {
                return idx;
            }
        }
        return -1;
    }

    //큐의 용량을 반환
    public int getCapacity() {
        return capacity;
    }

    //큐에 쌓여있는 데이터 개수를 반환
    public int size() {
        return num;
    }

    //큐가 비어있나요 ?
    public boolean isEmpty() {
        return num <= 0;
    }

    //큐가 가득 찼나요?
    public boolean isFull() {
        return num >= capacity;
    }

    //큐 안의 모든 데이터를 프론트->리어순 출력
    public void dump() {
        if (num <= 0) {
            System.out.println("큐가 비어있습니다");
        } else {
            for (int i = 0; i < num; i++) {
                System.out.println((que[i + front % capacity]) + "");
            }
            System.out.println();
        }
    }


}
