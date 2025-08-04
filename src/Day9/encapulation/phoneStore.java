package Day9.encapulation;

public class phoneStore {
    private Phone phone;

    public phoneStore(Phone phone) {
        this.phone = phone;

    }

    private void registerPayment() {
        System.out.println("대리점 : 요금제를 등록합니다. 약정을 등록합니다.");
    }

    private void discountPromotion() {
        System.out.println("대리점 : 이벤트로 할인이 적용됩니다.");
    }

    // 대리점이 휴대폰을 파는 동작/메서드
    public Phone sellPhone() {
        // 대리점이 휴대폰을 판매
        return phone;
    }
}
