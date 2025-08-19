package Day13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Trycatch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b, c;
        try {
            System.out.print("정수입력 : ");
            a = scan.nextInt();
            System.out.print("정수입력 : ");
            b = scan.nextInt();
            c = a / b;
            System.out.println(c); // 상속 관계이면 상위 클래스를 아래에 사용한다
        } catch (InputMismatchException e) {
            System.out.println("똑바로 치도록");
        } catch (ArithmeticException e) {
            System.out.println("0은 안된다");
            return;
        } catch (Exception e) {
            System.out.println("그 외 모든것");
        } finally {
            System.out.println("무조건 실행. 주로 마무리 작업");
        }
        System.out.println("프로그램 나머지 부분");

    }
}