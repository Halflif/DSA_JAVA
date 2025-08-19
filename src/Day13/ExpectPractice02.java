package Day13;

import java.io.IOException;

// throws 나를 부른 곳에서 떠넘겨 처리하게 하겠다
// try catch는 문제에 대해서 꼼꼼하게 해결하기 위해서 사용함
// try catch가 너무 길면 프로그램이 뻗어버림
// throws는 떠넘기는 것 보다는 예외가 생겼을 때 빠르게 처리하기 위해서 사용
// 어디서 처리를 하냐에 따라서 문제 해결 방식이 달라 질 수 있음
// 범용적인 함수에서 사용하면은 문제 해결이 복잡해질 수 있음
public class ExpectPractice02 {
    public static void main(String[] arg[]) {
        try {
            sub();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void sub() throws IOException {
        int s = System.in.read();
        System.out.println((char) s);
    }
}
