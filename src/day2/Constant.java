package day2;

public class Constant {
    public static void main(String[] args) {

        // 상수
        // 변하지 않는 값을 저장하기 위함

        final int MAX_NUM = 100; // 상수는 대부분 이름을 대문자로 설정함
        final int MIN_NUM;
        MIN_NUM = 0;

        System.out.println(MAX_NUM);
        System.out.println(MIN_NUM);

        // MIN_NUM = -99; // 최초 한번의 대입만 가능함(그 이후는 변경 불가능함)
    }
}
