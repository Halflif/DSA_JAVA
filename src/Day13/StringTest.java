package Day13;

import java.util.Calendar;
import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String id;
        char find;

        System.out.println("주민등록번호 입력(990101-1111111 형식) : ");
        id = s.nextLine();
        // 14글자가 아니면 잘못입력했다는 메시지 출력하고 프로그램 종료
        if (id.length() != 14) {
            System.out.println(" 잘못입력하셨습니다. 형식에 맞게 입력해주세요");
            return;
        }
        // '-' 문자의 위치 확인
        int Find = id.indexOf('-');
        if (Find != 6) {
            System.out.println("형식에 맞게 입력해주세요");
            return;
        }
        // 성별 오류 찾기(1,2,3,4 중 하나)
        char GenderFind = id.charAt(7);
        if (GenderFind != '1' && GenderFind != '2' && GenderFind != '3' && GenderFind != '4') {
            System.out.println("성별 입력 오류입니다");
            return;
        }
//        if (GenderFind == '1' || GenderFind == '3') {
//            System.out.println("남성");
//        } else if (GenderFind == '2' || GenderFind == '4') {
//            System.out.println("여성");
//        } else {
//            System.out.println("성별 입력 오류입니다.");
//        }
        // '-' 빼고 나머지는 다 숫자여야 함
        for (int i = 0; i < id.length(); i++) {
            find = id.charAt(i);
            if (i != 6 && (find < '0' || find > '9')) {
                System.out.println("숫자입력오류 숫자로 입력해주세요");
                return;
            }
        }
        // 월이 1~12 범위여야 함ㄹㄹ
        int Month = Integer.parseInt(id.substring(2, 4));
        if (Month > 12 || Month < 1) {
            System.out.println("월을 잘못 입력하셨습니다.");
        }
        // 일이 1~31 범위여야 함
        int Day = Integer.parseInt(id.substring(4, 6));
        if (Day < 1 || Day > 31) {
            System.out.println("일을 잘못입력 하셨습니다.");
        }
        // 제대로 입력했으면 "99년생 26살 남자"라고 출력
        int AgeCal = Integer.parseInt(id.substring(0, 2));
        char DiYear = id.charAt(7);
        int BirthYear = 0;
        if (GenderFind == '1' || GenderFind == '2') {
            BirthYear = 1900 + AgeCal;
        } else {
            BirthYear = 2000 + AgeCal;
        }
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int age = year - BirthYear;
        String Gender01 = (DiYear % 2 == 1) ? "남자" : "여자";
        System.out.println(AgeCal + "년생이며 현재 나이는" + age + "살이며 성별은" + Gender01 + "입니다.");
    }

}

