package Day4.ifexample;

import java.util.Scanner;

public class ifPractice03 {
    public static void main(String[] args) {
        // 숙제
        // 태어난 해가 윤년인지 확인하여 결과를 출력하세요
        // 4년마다 윤년, 100년마다 평년. 단, 400년마다 무조건 윤년
        // 2001, 1900 년 -> 평년 2004, 2000 -> 윤년
        Scanner YEARS = new Scanner(System.in);
        System.out.print("출생연도를 입력하세요 : ");
        int year;
        year = YEARS.nextInt();
        if ((year%4==0) && (year%100 != 0) || (year%400) ==0  ) {
            System.out.printf("당신의 출생연도인 %d년은 윤년입니다%n", year);
        }  else {
            System.out.printf("당신의 출생연도인 %d년은 윤년이 아닙니다%n", year);
        }






    }
}
