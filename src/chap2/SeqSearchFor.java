package chap2;

import java.util.Scanner;

public class SeqSearchFor {
     // 요솟수가 n인 배열 a에서 key와 같은 값이 있는지 찾음(for문 사용)
    static int seqSearch(int[] a, int n, int key) {
        for (int i = 0; i < n; i++)
            if (a[i] == key)
                return i;
        return -1;
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




