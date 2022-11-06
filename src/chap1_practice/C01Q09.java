package chap1_practice;

import java.util.Scanner;

public class C01Q09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("a의 값을 입력하세요");
        int a = sc.nextInt();
        int b;
        do {
            System.out.println("b의 값을 입력하세요");
            b = sc.nextInt();
        } while (b <= a);

        int min = b-a;
        System.out.println(b+"-"+a+"의 값은"+min+"입니다");
    }
}
