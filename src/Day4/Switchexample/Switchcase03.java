package Day4.Switchexample;

public class Switchcase03 {
    public static void main(String[] args) {
        // 1,3,5,7,8,10,12월 => 31일 까지

        int month = 0;
        int day = switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> 28;
            default -> {
                // 1~12사이의 숫자가 아닌 경우
                if (month < 1 || month > 12) {
                    System.out.println("없는 달입니다");
                }
                // 그마저도 아닌 경우
                else {
                    System.out.println("알 수 없는 오류입니다");
                }
                yield 0;
            }
        };
        System.out.println(month + "월의 날짜는" + day + "일 까지 있습니다");

    }
}
