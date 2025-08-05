package Day9.encapulation;

public class Customer {

    private String name;
    private double budget;

    public Customer(String name, double budget) {
        this.budget = budget;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    /**
     * 고객이 휴대폰을 사는 동작
     * 대리점 객체가 휴대폰을 파는 메서드를 호출
     * TODO : 고객이 구입하려는 핸드폰기종과 대리점이 취급하는 기종의 일치여부를 확인
     *
     * @param store 대리점(고객이 휴대폰을 사는 동작을 하는 메서드)
     */
    public void buyPhone(phoneStore store) {
        Phone phone = store.sellphone(budget);
        phone.getModel();

        System.out.println("고객 : 핸드폰 " + phone.getModel() + " 구입이 완료되었습니다.");
    }
}
