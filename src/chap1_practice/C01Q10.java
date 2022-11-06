package chap1_practice;

import java.util.Scanner;

public class C01Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("양의 정수의 자릿수를 구합니다.");
        do {
            System.out.println("정수값 :");
            n = sc.nextInt();
        } while (n <= 0);

        int no = 0; // 자릿수 변수 초기화.
        while (n > 0) { // 입력받은 정수가 0보다 크면
            n /= 10; // n을 10으로 나눠준다.
            no++; // 10으로 나눠질 때 까지 자릿수 변수 no에 1씩 더해줌.
        }
        System.out.println("그 숫자의 자릿수는 "+no+"입니다.");

    }
}
