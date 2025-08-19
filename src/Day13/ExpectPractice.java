package Day13;

import java.io.IOException;

public class ExpectPractice {
    public static void main(String[] arg[]) throws IOException {
        try {
            int i = System.in.read();
            System.out.println((char) i);
        } catch (IOException e) {
            e.printStackTrace(); // 개발자가 디버깅을 위한 용도로 출력 즉, 예외 메세지
        }
    }
}
