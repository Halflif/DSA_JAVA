package Day6;

import java.util.Scanner;

public class LoopPractice03_Answer {
    public static void main(String[] args) {
        // for (초기화;, 조건식;, 증감식) {수행문}
        // do {최초 실행문} while {조건식}
        // while(조건) {실행문}
        Scanner sc = new Scanner(System.in);
        int n, sum, i;
        sum = 0;
//        for (i = 1; n != 0 ; i++) {
//            System.out.printf("정수%d 입력:", i);
//            n = sc.nextInt();
//            sum += n;
//
//            if (n == 0) {
//                break;
//            }
//        }

//        i = 1;
//        while (true) {
//            System.out.printf("정수%d 입력:", i);
//            n = sc.nextInt();
//            sum += n;
//            if (n == 0) {
//                break;
//            }
//            i++;
//        }

        i = 1;
        do {
            System.out.printf("정수%d 입력:", i);
            n = sc.nextInt();
            sum += n;
            if (n == 0) {
                break;
            }
            i++;
        } while (true);
        System.out.println("합계: " + sum);
    }
}
