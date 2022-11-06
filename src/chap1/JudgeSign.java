package chap1;

import java.util.Scanner;

public class JudgeSign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요.");
        int n = sc.nextInt();

//        if (n>0)
//            System.out.println(n+"은 정수 입니다.");
//        if (n==0)
//            System.out.println(n+"은 0 입니다.");
//        if(n<0)
//            System.out.println(n+"은 음수 입니다.");

        if (n > 0)
            System.out.println(n + "은 정수 입니다.");
        else if (n < 0)
            System.out.println(n + "은 음수 입니다.");
        else
            System.out.println(n + "은 0 입니다.");

    }

}
