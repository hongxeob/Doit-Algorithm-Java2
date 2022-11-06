package chap1;

import java.util.Scanner;

public class SumWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.print("n의 값을 입력 하세요.");
        int n = sc.nextInt();

        int sum = 0; // 합을 저장하는 변수 sum을 0 (합을 구하기 위한 초기화)
        int i = 1; //  반복을 제어하기 위한 변수 i를 1

        while (i <= n) { // i가 n 이하면 반복함
            sum += i; // sum에다가 i씩 더함
            i++; // i를 1씩 증가시킴
        }
        System.out.println("1부터"+n+"까지의 합은"+sum+"입니다.");
    }
}
