package chap2;

import java.util.Scanner;

public class SeqSearch {
    static int seqSearch(int[] a, int n, int key) {
        int i = 0;
        while (true) {
            if (i == n)
                return -1;
            if (a[i] == key)
                return i;
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("요솟수 : ");
        int n = sc.nextInt();
        int[] x = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("x[" + i + "]");
            x[i] = sc.nextInt();
        }
        System.out.println("검색할 값 : ");
        int searchN = sc.nextInt();
        int idx = seqSearch(x, n, searchN);

        if (idx == -1)
            System.out.println("그 값의 요소가 없습니다.");
        else System.out.println("그 값은 [" + idx + "]에 있습니다");
    }
}




