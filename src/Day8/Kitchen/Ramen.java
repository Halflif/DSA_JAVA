package Day8.Kitchen;

// class는 하나의 설계도인 느낌
// 뼈대는 어떻게 만들 것인지, 시멘트는 어떻게 만들어서 뭘 부을 것인지, 골조는 어떤게 올릴 것인지, 창문은 어떻게 달 것인지 등등등....
public class Ramen {
    // 필드
    // 선언을 하는 순간 Framework가 생성된다 생각
    String noodleType;
    String soupType;
    boolean isCooked;

    // 생성자? 클래스 이름과 같은 이름을 가진 메서드
    // 객체가 생성될 때 호출되어 객체의 초기 상태를 설정하는 특수 한 메서드
    // new 키워드와 함께 호출하며 새 객체를 생성하기 위한 메서드
    // 일반 메서드와 달리 반환값을 설정하지 않는다
    // 메서드
    public Ramen() {
    }

    // 기본 생성자(디폴트 생성자) : 생성자를 직접 만들지 않으면 자동으로 만들어준다
    // 기본생성자를 통해 만들어진 객체의 인스턴스 변수에는 각 타입의 기본값이 들어간다
    // 생성자는 같은 이름으로 여러개 만들 수 있다 -> 생성자 오버로드
    public Ramen(String rNoodleType, String rSoupType) {
        // 인스턴스가 생성이 되었을 때 이렇게 설정해달라고 지정
        noodleType = rNoodleType;
        soupType = rSoupType;
        isCooked = false;
    }

    void boilWater() {
        System.out.println("물을 끓입니다...");
    }

    void addNoodles() {
        System.out.println(noodleType + "을 넣습니다..");
    }

    void addSoup() {
        if (soupType == "가루스프") {
            System.out.println("스프를 넣습니다..");
        } else {
            System.out.println("액상 스프를 넣지 않습니다..");
        }
    }

    void cook() {
        boilWater();
        addNoodles();
        addSoup();
        isCooked = true;
        System.out.println("라면이 완성되었습니다..");
    }
}
