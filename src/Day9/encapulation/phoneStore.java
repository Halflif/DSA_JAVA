package Day9.encapulation;

public class phoneStore {
    private Phone phone;

    public phoneStore(Phone phone) {
        this.phone = phone;

    }

    /**
     * - 요금제 등록하고 registerPayment
     * - 할인을 적용한뒤 discountPromotion
     * - 휴대폰을 전달함 return
     * TODO : 모델명과 예산을 파라메터로 받아서 구입가능여부를 확인 후 반환값을 전달
     *
     * @param budget 돈
     * @return phone 판매한 휴대폰 객체
     */
    public Phone sellphone(double budget) {
        String desiredModel = Phone.getModel();
        if (!phone.getModel().equals(desiredModel)) {
            System.out.println("대리점: 요청한 모델 없음");
            return null;
        }
        if (budget < phone.getPrice()) {
            System.out.println("대리점: 예산 부족");
            return null;
        }
        registerPayment();
        discountPromotion();
        System.out.println("대리점: 휴대폰 전달");
        return phone;
    }

    private void registerPayment() {
        System.out.println("대리점 : 요금제를 등록합니다. 약정을 등록합니다.");
    }

    private void discountPromotion() {
        System.out.println("대리점 : 이벤트로 할인이 적용됩니다.");
    }
}