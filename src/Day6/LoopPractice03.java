package Day6;

import java.util.Scanner;

public class LoopPractice03 {
    public static void main(String[] args) {
        // 정수를 입력받아 합계를 구한다
        // 입력받은 정수가 0이면 무조건 종료한다
        // for while do-while 버전으로 만드세요

        Scanner s = new Scanner(System.in);
        int sum = 0;
        for (; ; ) {
            System.out.print("정수를 입력하세요 : ");
            int i = s.nextInt();
            if (i == 0) {
                break;
            }
            sum += i;
        }
    }
}



