package chap2_practice;

import java.util.Scanner;

public class C02Q04 {
    static void copy(int[] a, int[] b) {
        int num = a.length <= b.length ? a.length : b.length;
        for (int i = 0; i < num; i++)
            a[i] = b[i];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("a의 요솟수는?");
        int numA = sc.nextInt();
        int[] a = new int[numA];
        for (int i = 0; i < numA; i++) {
            System.out.println("a[" + i + "]");
            a[i] = sc.nextInt();
        }
        System.out.println("b의 요솟수는?");
        int numB = sc.nextInt();
        int[] b = new int[numB];
        for (int i = 0; i < numB; i++) {
            System.out.println("b[" + i + "]");
            b[i] = sc.nextInt();
        }
        copy(a, b);
        System.out.println("b를 a에 카피 완료");
        for (int i = 0; i < numA; i++)
            System.out.println("a[" + i + "] = " + a[i]);
    }
}
