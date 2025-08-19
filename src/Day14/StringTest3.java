package Day14;

import java.util.Calendar;

public class StringTest3 {
    public static void main(String[] args) {
        try {
            for (int i = 0; i < 10; i++) {
                Calendar c = Calendar.getInstance();
                int y = c.get(Calendar.YEAR);
                int m = c.get(Calendar.MONTH) + 1;
                int d = c.get(Calendar.DATE);
                int h = c.get(Calendar.HOUR);
                int mi = c.get(Calendar.MINUTE);
                int s = c.get(Calendar.SECOND);
                //2025년 8월 14일 10시 19분 23초
                Thread.sleep(1000); // 1초 텀주기
                System.out.printf("현재 시각 %d-%d-%d %d:%d:%d 입니다.%n", y, m, d, h, mi, s);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}

