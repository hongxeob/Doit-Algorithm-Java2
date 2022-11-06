package chap2;

import java.util.Scanner;

public class MaxOfArray {
    static int maxOf(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++)
            if (a[i] > max)
                max = a[i];
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("키의 최댓값을 구합니다");
        System.out.println("몇 명인지 입력하세요");
        int p = sc.nextInt(); // 새로운 배열 요솟수를 입력받음
        int[] height = new int[p]; // 요솟수가 p개인 배열을 생성

        for (int i = 0; i < p; i++) {
            System.out.println("height [" + i + "] :");
            height[i] = sc.nextInt();
        }
        System.out.println("최댓값은 " + maxOf(height)+"입니다.");
    }
}


