package Day6;

import java.util.Scanner;

public class LoopPractice03_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sum2 = 0;
        System.out.println("숫자를 입력하세요 : ");
        while (true) {
            int num1 = s.nextInt();
            if (num1 == 0) {
                break;
            }
            sum2 += num1;
        }
        System.out.println("총합: " + sum2);
    }
}
