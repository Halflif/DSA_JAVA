package Day16;

import java.io.FileWriter;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) throws IOException {
        // 파일을 만들때 권한이 없거나 경로가 없을 수 있기 때문에 예외를 발생시킬 가능성이 높아서 예외처리를 항상 해야함
        FileWriter out = null;
        try {
            out = new FileWriter("c:\\workspace\\a.txt");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("파일생성 실패");
            return;
        }
        try {
            out.write('A');
            out.write('\n');
            out.write('가');
        } catch (IOException e) {
            System.out.println("쓰기 오류");
        }
        try {
            out.close();
        } catch (IOException e) {
            System.out.println("스트림 닫기 오류");
        }
    }
}

