package chap2_practice;

import java.util.Scanner;

public class C02Q03 {
    //--배열 a의 요솟수를 출력--//
    static int sumOf(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("요솟수는 : ");
        int num = sc.nextInt();
        int[] x = new int[num]; // 배열 요솟수가 num인 배열 생성

        for (int i = 0; i < num; i++) {
            x[i] = sc.nextInt();
        }

        System.out.println("배열 요소의 합은 " + sumOf(x) + "입니다");
    }
}
