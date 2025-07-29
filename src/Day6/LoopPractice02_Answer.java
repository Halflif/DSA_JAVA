package Day6;

import java.util.Scanner;

public class LoopPractice02_Answer {
    public static void main(String[] args) {
        // start = end
        // end = temp
        // temp = start
        // end = start
        // start = temp

        Scanner s = new Scanner(System.in);
        System.out.println("숫자 두개를 입력하세요");
        int start = s.nextInt();
        int end = s.nextInt();
        int temp;
        int sum = 0;
        if (start > end) {
            temp = start;
            start = end;
            end = temp;
        }
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
