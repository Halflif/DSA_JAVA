package Day3;

import java.util.Scanner;

public class Practice02A {
    public static void main(String[] args) {
        /*
         * 초 단위의 숫자를 입력받아 시간, 분, 초 단위로 환산한다.
         *
         * 초 단위를 입력하세요 : 3606
         * 1시간 0분 6초
         * */

        // 입력받을 준비하기
        Scanner input = new Scanner(System.in);
        // 입력 받은 값 넣을 변수 준비하기
        int time, hour, minute, sec;
        System.out.print("초 단위를 입력하세요 :");
        time = input.nextInt();
        //연산하기
        hour = time / 3600;
        time %= 3600;
        minute = time / 60;
        sec = time % 60;
        //서식 맞춰 출력하기
        System.out.printf("%d시간 %d분 %d초", hour, minute, sec);

    }
}
