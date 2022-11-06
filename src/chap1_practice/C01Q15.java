package chap1_practice;

import java.util.Scanner;

public class C01Q15 {
    //i / j 처음 값이 0인 경우
    static void spira(int n) {
        for (int i = 0; i < n; i++) { // n단(줄) 생성
            for (int j = 0; j < (n - 1) - i; j++) { // 공백을 만드는 함수 -> 첫 줄의 공백은 n-1개 이다
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 + 1; j++) { // *을 만드는 함수 -> 첫 줄의 *은 1개 이다(피라미드) 이 후 별은 2개씩 늘어난다.
                System.out.print("*");
            }
            // 위 코드 정리 : 즉 첫 줄에 n-1개의 공백이 생긴 후 * 1 개 찍힘
            //           : 두 번째 줄에는 공백은 하나씩 줄고, 별은 2개씩 는다.
            System.out.println();
        }
    }

//    // i / j 처음값이 1인경우
//    static void spira2(int n) {
//        for (int i = 1; i <= n; i++) { // n단(줄) 생성
//            for (int j = 1; j <= n - i; j++) { //
//                System.out.print(" ");
//            }
//            for (int j = 1; j < (i-1) * 2 + 1; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("피라미드를 출력합니다.");

        do {
            System.out.print("단수는  : ");
            n = sc.nextInt();
        } while (n <= 0);

        spira(n);                    // 피라미드를 출력
    }
}
