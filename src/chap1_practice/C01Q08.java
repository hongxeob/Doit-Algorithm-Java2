package chap1_practice;

import java.util.Scanner;

public class C01Q08 {
    public static int sumof(int a, int b){

        int max; // a,b중 큰 값
        int min; // a,b중 작은 값

        //a>b 이면 a가 큰값, b가 작은 값.
        if (a>b){
            max = a;
            min = b;
        } else{
            max = b;
            min = a;
        }

        int sum=0; // 총합
        // min부터 max 사이까지 1씩 올라가며 더해준다. 단.min이 값이 max 값보다 커지면 종료
        for (int i = min; i<=max; i++){
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수 a,b를 포함한 그 사이 모든 숫자의 합을 구합니다");
        System.out.println("정수 a를 입력하세요");
        int a = sc.nextInt();
        System.out.println("정수 b를 입력하세요");
        int b = sc.nextInt();

        System.out.println("정수 a,b를 포함한 그 사이 숫자의 합은"+sumof(a,b)+"입니다");
    }
}
