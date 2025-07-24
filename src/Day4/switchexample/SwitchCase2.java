package Day4.switchexample;

public class SwitchCase2 {
    public static void main(String[] args) {
    /*
    * break가 없어도 switch-case 기본 동작과 목적에 부합하게 간결하게 쓰는 방법
    * swtch 표현식의 화살표 문법
    * 케이스 내의 실행문을 실행한 뒤 바로 문을 빠져나간다
    * switch-case 문 자체를 변수에 대입하도록 쓰는 방법 
    * 한 줄의 실행문이 되기 때문에 세미콜론이 필요함
    * yield? switch-case 안에 복잡한 제어문이 더 들어가는 경우에 수행 결과를 반환하기 위하여 사용
    * */
        int ranking = 1;
        String medalColor;
        String message = switch (ranking) {
            case 1->
                medalColor = "G";

            case 2->
                medalColor = "S";

            case 3->
                medalColor = "B";

            default->
                medalColor = "A";

       };
        System.out.println(message);
}
}
