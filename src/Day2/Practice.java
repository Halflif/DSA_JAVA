package Day2;

public class Practice {
    public static void main(String[] args) {
        // 1. '희'라는 한글 글자의 유니코드 정수값 값을 찾아서 적절한 변수에 저장한 뒤 변수를 출력하여 확인하세요
        System.out.println('희');
        System.out.println((int) '희');  // 55148 -> 16진법으로 변경 후 역슬레스u를 써주면 유니코드가 된다
        System.out.println((char) 55148);

        // 2. 본인 이름을 적절한 자료형의 변수에 담아 출력해보세요
        String myName = "김석현";
        System.out.println(myName);

        // 3. 출생연도를 저장하는 변수를 만들어 선언과 동시에 초기화 하세요
        int birthYear = 999;
        System.out.println("출생연도는" + birthYear + "년 입니다");
        // 4. 바이트타입의 변수 두 개에 10과 20을 저장하고 바이트 타입의 새 변수에 두 값을 합한 결과를 저장하고 출력하세요
        byte num = 10;
        byte num2 = 20;
        byte result;
//       result = num + num2; // int 타입의 결과를 반환하는 연산자
        result = (byte) (num + num2);
        System.out.println(result);

        // 5. 태블릿 소지 여부를 변수에 저장하고 출력해보세요
        boolean hasTablet = true;
        System.out.println(hasTablet);

        // Q1. '희'의 유니코드의 정수값을 찾아 저장한 뒤 출력하시오
        char Korean = '희';
        int u_Code = (int) Korean;
        System.out.println((int) Korean);
        System.out.println(u_Code);
        System.out.println((char) u_Code);

        //Q2. 본인 이름을 적정한 자료형의 변수에 담아 출력

        String Name;
        Name = "김석현";
        System.out.println(Name);

        //Q3. 출생연도를 저장하는 변수를 만들어 선언과 동시에 초기화하세요
        int Birth = 19970611;
        System.out.println(Birth);

        //Q4. 바이트타입의 변수 두 개에 10과 20을 저장하고 바이트 타입의 새 변수에 두 값을 합한 결과를 저장하고 출력하세요
        byte Num1 = 10;
        byte Num2 = 20;
        byte Num3 = (byte) (Num1 + Num2);
        System.out.println(Num3);

        //Q5. 태블릿 소지 여부를 변수에 저장하고 출력하세요.
        boolean Marige = true;
        System.out.println(Marige);


    }
}
