//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
// 주석(comment)
// 프로그램 코드에서 실행되지 않고 사람이 읽기 위한 부분
// 주석 기능은 임시로 코드를 비활성화 할때도 사용 (ctrl + /)
// 주석 처리는 comment out라고 부른다
/*
여러줄 주석
앞 뒤로 별만 있으면 됨 -- 주석 보다는 약간 메모의 느낌으로 사용
 */
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}

