package chap2;

import java.security.Key;
import java.util.Scanner;

public class BinSearch {
    // 요솟수가 n개인 배열 a에서 key와 같은 요소를 이진 검색
    static int binSearch(int[] a, int n, int key) {
        int pl = 0; // 검색 범위의 첫 인덱스
        int pr = n - 1; // 검색 범위의 첫 인덱스

        do {
            int pc = (pl + pr) / 2; // 배열의 중앙 요소 인덱스
            if (a[pc] == key) // 검색 성공!
                return pc;
            else if (a[pc] < key) // 검색 범위를 뒤쪽 절반으로 좁힘
                pl = pc + 1; // 그러면 배열의 첫요소는 중앙값+1이 됨
            else // a[pc] > key // 검색 범위를 앞쪽 절반으로 좁힘
                pr = pc - 1; // 그러면 배열의 끝은 중앙값-1이 됨
        } while (pl <= pr); // 시작 요소가 마지막 요소값과 같거나 커지면 빠져나옴.
        return -1; // 검색 실패
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("요솟수 : ");
        int n = sc.nextInt();
        int[] x = new int[n];

        System.out.println("오름차순으로 입력하세요");
        System.out.println("x[0] :");
        x[0] = sc.nextInt(); // 첫 요소를 입력 받음.

        for (int i = 1; i < n; i++) {
            do {
                System.out.println("x[" + i + "] :");
                x[i] = sc.nextInt();
            } while (x[i] < x[i - 1]); // 바로 앞의 요소보다 작으면 다시 입력받음.(오름차순)
        }
        System.out.println("검색할 값 : ");
        int searchK = sc.nextInt();

        int idx = binSearch(x, n, searchK); // 배열x에서 값이  searchK인 요소를 검색.

        if (idx == -1)
            System.out.println("그 값은 없습니다.");
        else System.out.println("그 값은 x[ " + idx + " ]에 있습니다");
    }
}
