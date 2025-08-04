package Day9;

import Day8.Kitchen.Ramen;

public class accessModifierTest {
    // 접근제어자
    // public : 외부 클래스 어디에서나 접근 가능
    // default(공란) : 같은 패키지 내부에서만 접근 가능
    // 접근제어자를 쓰는 위치에 아무것도 안 쓴 상태
    // private : 같은 클래스 내부에서만 접근할 수 있다, 제일 까다로운 녀석
    // protected : 같은 패키지 내부와     상속관계인 클래스에서 만 접근가능 그외 클래스에서는 접근할 수 없다
    public static void main(String[] args) {
        Ramen ramen = new Ramen("신라면", "가루스프");
        printStatus(ramen);
        ramen.cook();
        printStatus(ramen);
    }

    public static void printStatus(Ramen ramen) {
        boolean flag = ramen.getIscooked();

        if (flag) {
            System.out.println("새로 생성된 라면 인스턴스 : " + ramen.noodleType + "는 조리된 상태입니다");
        } else {
            System.out.println("새로 생성된 라면 인스턴스 : " + ramen.noodleType + "는 아직 조리되지 않았습니다");
        }
    }
}