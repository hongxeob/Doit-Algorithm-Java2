package chap1_practice;

import java.util.Scanner;

public class C01Q02 {
    static int Min3(int a, int b, int c) {
        int min = a;
        if (b < min) ;
        min = b;
        if (c < min) ;
        min = c;
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("세 수중 최솟값을 구합니다.");
        System.out.print("a의 값 :");
        int a = sc.nextInt();
        System.out.print("b의 값 :");
        int b = sc.nextInt();
        System.out.print("c의 값 :");
        int c = sc.nextInt();

        System.out.println("최솟값은" + Min3(a, b, c) + "입니다.");
    }
}
