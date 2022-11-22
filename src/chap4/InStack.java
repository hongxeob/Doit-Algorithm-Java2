package chap4;

public class InStack {
    private int[] stk;
    private int ptr;
    private int capacity;

    //예외 : 빈 스택
    public class EmptyInStackException extends RuntimeException {
        public EmptyInStackException() {
        }
    }

    //예외 : 가득 찬 스택
    public class OverflowInStackException extends RuntimeException {
        public OverflowInStackException() {
        }
    }

    //생성자
    public InStack(int maxlen) {
        ptr = 0;
        capacity = maxlen;
        try {
            stk = new int[capacity];
        } catch (OutOfMemoryError error) {
            capacity = 0;
        }
    }

    // 스택에 x를 푸쉬
    public int push(int x) throws OverflowInStackException {
        if (ptr >= capacity) {
            throw new OverflowInStackException();
        }
        return stk[ptr++] = x;
    }

    // 스택에서 맨위 데이터를 팝(꺼내다)
    public int pop() throws EmptyInStackException {
        if (ptr <= 0) {
            throw new EmptyInStackException();
        }
        return stk[--ptr];
    }

    //스택에서 데이터를 피크(꼭대기에 있는 데이터를 봄)
    public int peek() throws EmptyInStackException {
        if (ptr <= 0) {
            throw new EmptyInStackException();
        }
        return stk[ptr - 1];
    }

    //스택을 비움
    public void clear() {
        ptr = 0;
    }

    // 스택에서 x를 찾아 인덱스를 반환 (없으면 -1 반환)
    public int indexOf(int x) {
        for (int i = ptr - 1; i >= 0; i--)
            if (stk[i] == x) return i;
        return -1;
    }

    //스택의 용량을 반환
    public int getCapacity() {
        return capacity;
    }

    //스택에 쌓여있는 데이터의 개수 반환
    public int size() {
        return ptr;
    }

    //스택이 비어 있는가?
    public boolean isEmpty() {
        return ptr <= 0;
    }

    //스택이 가득  찼는가?
    public boolean isFull() {
        return ptr >= capacity;
    }

    //스택의 모든 데이터를 바닥부터 꼭대기 순으로 출력
    public void dump() {
        if (ptr <= 0) {
            System.out.println("스택이 비어있습니다.");
        } else {
            for (int i = 0; i < ptr; i++) {
                System.out.println(stk[i] + " ");
            }
            System.out.println();

        }
    }
}



