package Day3;

import java.util.Scanner;

public class practice02 {
    public static void main(String[] args) {
        /*
         * 초 단위의 숫자를 입력받아 시간, 분, 초 단위로 환산한다.
         *
         * 초 단위를 입력하세요 : 3606
         * 1시간 0분 6초
         * */

        Scanner Practice = new Scanner(System.in);
        System.out.print("초단위를 입력하세요 : ");
        int Second;
        Second = Practice.nextInt();
        System.out.printf("초단위를 입력하세요 :%d%n ", Second);
        System.out.print("시간을 입력하세요 :");
        double Time;
        Time = Practice.nextInt();
        int n1, n2, n3;
        n1 = (int) (Time / 3600); //시간
        n2 = (int) (Time % 3600) / 60; //분
        n3 = (int) (Time % 3600) % 60; //초
        System.out.printf("시간은 : %d시 %d분 %d초", n1, n2, n3);


    }
}
