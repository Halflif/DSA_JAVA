package Day4.switchexample;

public class SwitchCase {
    public static void main(String[] args) {
        /*
         * switch (조건) {
         *      case 조건과 일치하는지 확인할 값 1 : 수행문;
         *                                       break;
         * default : 수행문;
         * }
         * break? 케이스에 일치하는 경우 수행문을 시행하고 swtch-case문을 빠져나가게함
         * default? 어떤 케이스에도 해당하지 않으면 수행할 명령
         * break를 하지 않으면 의도하지 않은 값이 대입될 수 있으므로 꼭 한 조건이 끝나면 break를 작성하자
         * */
        int ranking = 1;
        char medalColor;
        switch (ranking) {
            case 1:
                medalColor = 'G';
                break;
            case 2:
                medalColor = 'S';
                break;
            case 3:
                medalColor = 'B';
                break;
            default:
                medalColor = 'A';
        }
        System.out.println(ranking+"등 메달의 색은 "+medalColor+"입니다.");
}
}
