package Day8.Kitchen;

public class Salad {
    String vegetable;
    String dressing;
    String Extra;
    boolean isMixed;

    public Salad(String vegetable, String dressing, String Extra) {
        // this 키워드 ? 생성된 인스턴스 스스로를 가리키는 에약어
        this.vegetable = vegetable;
        this.dressing = dressing;
        this.Extra = Extra;
        isMixed = true;
    }

    void Mix() {
        System.out.println(vegetable + "를 넣습니다.");
        System.out.println(dressing + " 드레싱을 넣습니다.");
        System.out.println(Extra + "를/을 추가로 넣습니다.");
        System.out.println(isMixed);
    }
}
