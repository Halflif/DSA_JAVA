package day3;

public class StrFormatting {   // 데이터 format 변경
    public static void main(String[] args) {
        // 문자열 Formatting
        // System.out.printf()
        // 서식 지정자
        /* %d = 정수
         * %f = 실수
         * %s = 문자열
         * %n = 줄바꿈
         * %x / %X = 16진수(소문자/대문자)
        */ 
        double d = 123.45678;
        int n = 1234;
        String name = "홍길동";
        System.out.printf("이름은 %s입니다.%n", name); // %s, %n 사용
        System.out.printf("이름은 %5s입니다.%n", name); // %숫자s = 숫자 만큼의 칸을 차지하게 하겠다인데 오른쪽 정렬을 하겠다
        System.out.printf("이름은 %-5s입니다.%n", name); //  %-숫자s = 숫자 만큼의 칸을 차지하게 하겠다인데 왼쪽 정렬을 하겠다

        System.out.printf("기본출력 %d %n", n); // %d %n 사용
        System.out.printf("오른쪽 정렬 출력 %10d %n", n); // %숫자d = 숫자 만큼의 칸을 차지하게 하겠다인데 오른쪽 정렬을 한다
        System.out.printf("왼쪽 정렬 출력 %-10d %n", n); // %-숫자d = 숫자 만큼의 칸을 차지하게 하겠다인데 왼쪽 정렬을 한다
        System.out.printf("오른쪽 0채움 %010d %n", n); //%0숫자d = 숫자 만큼의 칸을 차지하게 하는데 그 칸을 0으로 채우겠다
        // System.out.printf("왼쪽 0채움 %0-10d %n", n); -> 왼쪽에서 0을 채워라는 실행할 수 없음 즉, 채우기랑 왼쪽정렬은 병렬 X
        System.out.println("실수연습 부분 ============================================");
        System.out.printf("실수값 포맷팅 %f %n", d); //%f %n 사용
        System.out.printf("실수값 포맷팅 %.2f %n", d); //%.숫자f 소숫점 자리를 숫자 만큼만 표시한다
        System.out.printf("실수값 포맷팅 %10.2f %n", d); //%숫자1.숫자2f 숫자1만큼을 표시하는데 숫자2만큼의 소숫점 자리만큼만 표시한다
                                                      // 숫자1만큼의 칸만큼 표시
        System.out.printf("실수값 포맷팅 %-10.2f %n", d); // %숫자1.숫자2f 숫자1만큼을 표시하는데 숫자2만큼의 소숫점 자리만큼만 표시한다
                                                       // 숫자1만큼의 칸만큼 표시하여 왼쪽 정렬
        System.out.printf("실수값 포맷팅 %010.2f %n", d); //%0숫자1.숫자2f 숫자 1만큼 데이터를 표시하는데 숫자2만큼의 소숫점 자리만큼 표시하고
                                                       // 남은 자리는 0으로 채워서 왼쪽 정렬을 한다




    }
}
