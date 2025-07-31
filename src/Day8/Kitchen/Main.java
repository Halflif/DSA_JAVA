package Day8.Kitchen;

public class Main {
    public static void main(String[] args) {
        // 인스턴스(new) = 실제 요리
        Ramen spicyRamen = new Ramen("매운라면", "가루스프");
//        spicyRamen.noodleType = "매운라면";
//        spicyRamen.soupType = "가루스프";

        // 조리 시작
        spicyRamen.cook();
        System.out.println(spicyRamen.isCooked);
        // 라면이라는 추상적 개념 -> 클래스
        // 인스턴스는 그 실체인 라면봉지
        // 클래스를 통해 생성된 실체를 인스턴스라고 부름
        // 인스턴스가 생성되면
        // 변수에 인스턴스를 담는다치고 변수 이름은 스택에 저장됨
        // 그 실체(객체_인스턴스)는 힙 메모리에 저장이 됨
        // 변수에 담긴 값은 리모컨, 리모컨이 객체(인스턴스)를 가리켜 정보나 행동을 가져옴

        // 샐러드 만들기
        Salad saladMeterial = new Salad("양상추, 치커리", "오리엔탈", "리코타치즈");
        saladMeterial.Mix();
    }
}
