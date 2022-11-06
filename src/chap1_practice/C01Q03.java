package chap1_practice;

import java.util.Scanner;

public class C01Q03 {
    static int Min4(int a, int b, int c, int d) {
        int min = a;
        if (b < min) ;
        min = b;
        if (c < min) ;
        min = c;
        if (d < min) ;
        min = d;

        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("네숫자 중 최솟값을 구합니다.");
        System.out.print("a의 값 :");
        int a = sc.nextInt();
        System.out.print("b의 값 :");
        int b = sc.nextInt();
        System.out.print("c의 값 :");
        int c = sc.nextInt();
        System.out.print("d의 값 :");
        int d = sc.nextInt();

        System.out.println("최솟값은" + Min4(a, b, c, d) + "입니다.");
    }
}
