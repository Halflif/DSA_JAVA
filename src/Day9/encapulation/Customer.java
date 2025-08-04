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

    public void buyPhone(PhoneStore store) {
        // 고객이 휴대폰을 살 때 일어나는 일
        // 대리점이 휴대폰을 팔 수 있냐 없냐를 구분하는 분기
        // 샀을 때의 출력문
    }
}
