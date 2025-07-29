package Day6;

import java.util.Scanner;

public class LoopPractice03_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum1 = 0;
        int num;
        do {
            System.out.print("정수 입력 : ");
            num = sc.nextInt();
            if (num != 0) sum1 += num;
        } while (num != 0);
        System.out.println("총합: " + sum1);

    }
}
