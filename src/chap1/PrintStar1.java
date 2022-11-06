package chap1;

import java.util.Scanner;

public class PrintStar1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, w;
        System.out.println("*을 n개 출력하되 w만큼 줄바꿈을 한다.");
        do {
            System.out.print("n의 값 : ");
            n = sc.nextInt();
        } while (n <= 0);

        do {
            System.out.println("w의 값 : ");
            w = sc.nextInt();
        } while (w <= 0 || w > n);

        for (int i=0; i< n/w; i++)
            System.out.println("*".repeat(w));
        // (n이 w의 배수라면) *을 w개 출력하면서 n/w 만큼 실행 후 줄 바꿈  ex) n=10 w=5 라면 별을 5개 찍고 2번 실행
        int rest = n%w; // n이 w의 배수가 아닐시 나머지를 찾는 변수
        if (rest !=0) // 나머지가 0이 아니라면
            System.out.println("*".repeat(rest)); // 나머지 만큼 별을 찍고 줄바꿈.


    }
}
