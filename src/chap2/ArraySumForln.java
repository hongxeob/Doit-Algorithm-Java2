package chap2;

public class ArraySumForln {
    // 배열의 모든 요소의 합을 구하여 춣력 (확장for문)
    public static void main(String[] args) {
        double[] a = {1.0, 2.0, 3.0, 4.0, 5.0};
        for (int i = 0; i < a.length; i++)
            System.out.println("a[" + i + "] " + a[i]);

        double sum = 0;
        for (double i : a)
            sum += i;

        System.out.println("모든 요소의 합은 " + sum + "입니다.");

    }
}
