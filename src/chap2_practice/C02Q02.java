package chap2_practice;

import java.util.Arrays;
import java.util.Scanner;

public class C02Q02 {
    static void swap(int[] a, int x, int y) {
        int t = a[x];
        a[x] = a[y];
        a[y] = t;
    }

    static void reverse(int[] a) {
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length / 2; i++) {
            System.out.println("a[" + i + "]와 a[" + (a.length - i - 1) + "]을 교환합니다.");
            swap(a, i, a.length - i - 1);
            System.out.println(Arrays.toString(a));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("요솟수는 : ");
        int num = sc.nextInt();
        int[] x = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.println("x=[" + i + "]");
            x[i]= sc.nextInt();
        }
        reverse(x);
        System.out.println("역순 정렬 완료.");
    }
}
