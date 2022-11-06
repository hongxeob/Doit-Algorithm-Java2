package chap2;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    // 배열 요소 a[idx1]과 a[idx2]의 값을 바꿈.
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    // 배열 a의 요소를 역순으로 정렬
    static void reverse(int[] a) {
        for (int i = 0; i < a.length / 2; i++)
            swap(a, i, a.length - i - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("요솟수 : ");
        int a = sc.nextInt(); // 요솟수

        int[] x = new int[a]; // 요솟수가 a인 배열

        for (int i = 0; i < a; i++) {
            System.out.println("x[" + i + "] : ");
            x[i] = sc.nextInt();
        }
        reverse(x);

        System.out.println("요소를 역순으로 정렬함");
        System.out.println("x =" + Arrays.toString(x));
    }
}

