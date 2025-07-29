package Day6;

import java.util.Scanner;

public class LoopPractice021 {
    public static void main(String[] a) {
        Scanner s = new Scanner(System.in);
        System.out.print("숫자 두개를 입력하세요");
        int n1 = s.nextInt(), n2 = s.nextInt(), sum = 0;
        for (int i = n1 < n2 ? n1 : n2; i <= (n1 > n2 ? n1 : n2); sum += i++) ;
        System.out.println(sum);
    }
}

