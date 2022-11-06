package chap1;

import java.util.Scanner;

public class TriangleLB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ;

        do {
            System.out.println("몇 단 삼각형 입니까?");
            n = sc.nextInt();
        } while (n <= 0);
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j<=i; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
