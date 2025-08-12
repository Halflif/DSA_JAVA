package Day12;

import javax.swing.*;
import java.util.Scanner;

// extends 상속 받는 키워드 => 물려 받는것
// 상속한 클래스 => 부모 클래스 상속 받은 클래스 => 자식 클래스
// 부모 클래스에 있는 메서드 들을 사용할 수 있음
public class WhileTest1 extends JFrame {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = -1, t = 0;
//        while (n != 0) {
//            System.out.println("정수입력");
//            n = s.nextInt();
//            t += n;
//        }
        do {
            System.out.println("정수입력");
            n = s.nextInt();
            t += n;
        }
        while (n != 0);

        while (true) {
            System.out.println("정수입력");
            if (n == 0) break;
            t += n;
        }
        System.out.println("합계:" + t);

    }
}
