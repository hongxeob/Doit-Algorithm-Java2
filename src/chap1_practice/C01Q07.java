package chap1_practice;

import java.util.Scanner;

public class C01Q07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("'가우스의 덧셈'을 이용하여 1부터 n까지의 합을 구합니다.");
        System.out.print("n의 값을 입력하세요");
        int n = sc.nextInt();

        int sum = (n + 1) * (n / 2) + (n % 2 == 1 ? (n + 1) / 2 : 0);
        // (짝수라면) 첫자리와 끝자리를 짝을 이뤄 더해주고,그 짝의 갯수를 곱해준다.
        // (3항 연산자) n을 2로 나눴을 때 나머지가 1이라면 (홀수라면) 가운데 값이니 (n+1) /2 , 그게 아니면(짝수면) 0을 반환해서 더해준다.
        System.out.println("1부터"+n+"의 합은"+sum+"이다");

    }
}
