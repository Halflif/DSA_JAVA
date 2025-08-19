package Day13; // day13 패키지에 속한 클래스

import java.util.Scanner;

public class WhileTest1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // 사용자 입력을 받기 위한 Scanner 객체 생성
        int n = -1, s = 0; // n: 입력받은 정수, s: 합계 변수

        // ------------------- do-while문 예제 -------------------
        // do-while문은 조건을 나중에 검사하므로 최소 1번은 무조건 실행됨
//        do {
//            System.out.print("정수입력 : "); // 사용자에게 정수 입력 요청
//            n = scan.nextInt();             // 키보드로부터 정수 입력받음
//            s += n;                          // 입력받은 값을 합계 s에 더함
//        }
//        while (n != 0); // 입력값이 0이 아니면 계속 반복

        // ------------------- while(true) + break 예제 -------------------
        while (true) { // 무한 반복 시작
            try {
                System.out.print("정수입력 : "); // 사용자에게 정수 입력 요청
                n = scan.nextInt();             // 키보드로부터 정수 입력받음
            } catch (Exception e) {
                System.out.println("정수만 입력 가능합니다.");
                scan.nextLine();                    // 버퍼 비우기
                continue;
            }
            if (n == 0) break;               // 입력값이 0이면 반복문 강제 종료
            s += n;                          // 입력받은 값을 합계 s에 더함
        }

        // 최종 합계 출력
        System.out.println("합계는 : " + s);

        // Scanner 닫기 (자원 해제)
        scan.close();
    }
}