package chap5_practice;

import java.util.Scanner;

public class C05Q01 {
    static int gcd(int x, int y) {
        while (y != 0) {
            return gcd(x, x % y);
        }
        return x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("두 수의 최대 공약수를 구합니다.");

        System.out.print("정수를 입력하세요 : ");
        int x = sc.nextInt();
        System.out.print("정수를 입력하세요 : ");
        int y = sc.nextInt();

        System.out.println("두 수의 최대 공약수는 " + gcd(x, y) + "입니다");

    }
}
