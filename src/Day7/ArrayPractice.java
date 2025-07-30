package Day7;

import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args) {
        // 연도 - 1984 % 12 == 0
        // 1 소 2 호랑이 3 토끼 용 뱀 말 양 원숭이 닭 개 돼지

        Scanner s = new Scanner(System.in);
        System.out.print("당신의 출생 연도를 입력해주세요 : ");
        int year = s.nextInt();
        String[] animal = {"쥐", "소", "호랑이", "토끼", "용", "뱀", "말", "양", "원숭이", "닭", "개", "돼지" };
        int result = (year - 1984) % 12;
        // index에 음수값을 지정할 수 없다.
        System.out.print(animal[result]);
    }
}



