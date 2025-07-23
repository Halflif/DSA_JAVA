package day3;

    // 1. Scanner를 사용하기 위해 import 한다.
    import java.util.Scanner;

public class ScannerSample {
    public static void main(String[] args) {
        // 2. Scanner 객체를 생성한다.
        Scanner scanner = new Scanner(System.in); //여기서 Input은 단지 이름일 뿐 변경되어도 상관없다
                                                //Scanner는 객체를 담을 수 있는 공간이다


        // 3. Scanner 객체를 사용하여 입력을 받는다.
        System.out.println("이름을 입력하세요");
        String name = scanner.nextLine();  // 문자열을 받아 저장할 수 있다
        System.out.println("안녕하세요," + name + "님");
        System.out.println("숫자를 입력해주세요:");
        int a = scanner.nextInt(); //.을 하면은 객체가 가지고 있는 기능을 가져다 쓸 수 있다
                                 // int a 라는 공간에 input.nextInt()의 값을 반환 할 수 있다
        // 4. 여러개를 입력받을 때는 1,2는 제외 3번을 반복
        int b = scanner.nextInt();
        int c = scanner.nextInt(); // Int는 숫자만 읽음 (줄바꿈 문자를 안읽음)
                                    // 숫자를 입력 후 Enter를 입력하면 Scanner(퍼버)안에 Enter가 남아있음
                                    // 그래서 다음 Next Line을 만났을때 다음으로 넘어가버린다
                                    //  버퍼에 남아있는 개행문자(\n)을 제거해줘야함
        // 5. 입력받은 정수값 사용하기
        int result = a+b+c;
        System.out.println("입력받은 값의 합계" + result); //숫자를 입력하면 "입력완료" 출력하고 종료되게 만듦
        System.out.println("변경하실 이름을 입력해주세요.");
        scanner.nextLine(); // 아무 역할이 없는 코드를 입력하여 개행문자(\n)을 제거
        String newName = scanner.nextLine(); // 이 행에서 입력값을 기다려야 하는데 종료가 되었음
        System.out.println("변경된 이름은" + newName);

        scanner.close(); // Scanner는 리소스를 잡아먹는 녀석이기 때문에 Scanner를 전부 사용하였다면 close로 닫아줘야 한다
                        // 리소스 해제 키워드 close









    }

}
