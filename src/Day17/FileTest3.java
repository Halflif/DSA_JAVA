package Day17;

/*
[실행1]
파일명 입력 : c:\\workspace\\Hello.java
import java.util.*; // .util에 있는 모든걸 가져옴
import java.util.Scanner;  // 같은 이름이 있을 경우 클래스명을 명확히 적은 것 부터 확인하고 * 확인
....
[실행2]
파일명 입력 : c:\\aaa\\bbb
파일이 없습니다
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

// 필요 클래스 import
public class FileTest3 {
    // 실행되는 main() 메서드 정의
    public static void main(String[] args) {
        // 필요한 변수 선언, 객체 생성
        Scanner sc = new Scanner(System.in);
        // 메시지 출력
        System.out.print("파일명 입력 : ");
        String fileName = sc.nextLine(); // 파일명 입력 받기

        File file = new File(fileName);

        if (!file.exists()) {
            System.out.println("파일이 없습니다");
            return;
        }
        // 파일로부터 읽을 수 있는 스트림 객체 생성(파일열기)
        try (Scanner fileScanner = new Scanner(file)) { // 파일 읽기
            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }
            // 파일이 없으면 예외발생 -> 프로그램 종료
        } catch (FileNotFoundException e) {
            System.out.println("파일을 읽는 중 오류가 발생했습니다.");
        }
        FileReader in = null;
        try {
            in = new FileReader("c:\\workspace\\b.txt");
            for (int i = 0; i < 3; i++) {
                int ch = in.read();    // 반복문으로 1문자씩 읽기
                if (ch == -1) break;     // -1이 리턴되면 반복 종료
                System.out.println((char) ch);  // 읽은 문자 화면에 출력
            }
        } catch (FileNotFoundException e) {
            System.out.println("없는 파일입니다");
        } catch (IOException e) {
            System.out.println("읽기 오류 발생");
        } finally {
            try {
                if (in != null) in.close();// 스트림 객체 닫기
            } catch (IOException e) {
                System.out.println("파일 닫기 오류");
            }
        }
    }
}
    

