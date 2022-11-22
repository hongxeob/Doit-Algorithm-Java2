package chap4;

import java.util.Scanner;

public class IntStackTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InStack s = new InStack(64);


        while (true) {
            System.out.println();
            System.out.printf("현재 데이터의 개수: %d / %d\n", s.size(), s.getCapacity());
            System.out.println("(1)푸시  (2)팝  (3)피크  (4)덤프  (5)데이터 찾기  (6)모든 데이터 삭제  (7)데이터 정렬  (0)종료");

            int menu = sc.nextInt();
            if (menu == 0) {
                break;
            }
            int x;
            switch (menu) {
                case 1:
                    System.out.println("데이터 : ");
                    x = sc.nextInt();
                    try {
                        s.push(x);
                    } catch (InStack.OverflowInStackException e) {
                        System.out.println("데이터가 가득 찼습니다.");
                    }
                    break;
                case 2:
                    try {
                        s.pop();
                    } catch (InStack.EmptyInStackException e) {
                        System.out.println("데이터가 비어 있습니다.");
                    }
                    break;
                case 3:
                    try {
                        s.peek();
                    } catch (InStack.EmptyInStackException e) {
                        System.out.println("데이터가 비어 있습니다.");
                    }
                    break;
                case 4:
                    s.dump();
                    break;
                case 5:
                    System.out.println("검색할 데이터 : ");
                    x = sc.nextInt();
                    int n = s.indexOf(x);
                    if (n >= 0) {
                        System.out.println("그 데이터는 꼭대기에서+[" + (s.size() - n) + "째에 있습니다.");
                    } else {
                        System.out.println("그 데이터는 없습니다.");
                    }
                    break;
                case 6:
                    System.out.println("데이터를 지웁니다.");
                    s.clear();
                    break;
                case 7: // 데이터 출력
                    System.out.println("용량 : " + s.getCapacity());
                    System.out.println("데이터 수  : " + s.size());
                    System.out.println("비어" + ((s.isEmpty()) ? "있습니다" : "있지 않습니다."));
                    System.out.println("가득" + ((s.isFull()) ? "차 있습니다" : "차 있지 않습니다."));
                    break;
            }
        }
    }
}
