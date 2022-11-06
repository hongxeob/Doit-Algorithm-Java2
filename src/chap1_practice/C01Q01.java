package chap1_practice;

import java.util.Scanner;

public class C01Q01 {
    static int max4(int a, int b, int c, int d) {
        int max = a;
        if (b > max) ;
         max = b;
        if (c > max) ;
         max = c;
        if (d > max) ;
         max = d;
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("네 수의 최대값을 구합니다.");
        System.out.print("a의 값:");
        int a = sc.nextInt();
        System.out.print("b의 값:");
        int b = sc.nextInt();
        System.out.print("c의 값:");
        int c = sc.nextInt();
        System.out.print("d의 값:");
        int d = sc.nextInt();
        System.out.println("네 수 중 최대값은 :" + max4(a, b, c, d) + "입니다.");
    }
}
