package chap1_practice;

import java.util.Scanner;

public class C01Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("정사각형을 만듭니다.");

        do {
            System.out.println("변의 길이를 입력하세요");
            n = sc.nextInt();
        } while (n <= 0);

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}


