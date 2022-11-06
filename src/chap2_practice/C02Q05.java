package chap2_practice;

import java.util.Scanner;

public class C02Q05 {
    //--- 배열 b의 모든 요소를 배열 a에 역순으로 copy  ---//
    static void rcopy(int[] a, int[] b) {
        int num = a.length <= b.length ? a.length : b.length;
        for (int i = 0; i < num; i++) {
            a[i] = b[b.length - i - 1];
        }
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
        rcopy(a, b); // 배열 b의 모든 요소를 배열 a에 역순으로 copy

        //--결과를 보여주는 코드--//
        System.out.println("배열b를 배열a에 역순으로 복사 완료.");
        for (int i = 0; i < numA; i++) {
            System.out.println("a[" + i + "] " + a[i]);
        }

    }
}
