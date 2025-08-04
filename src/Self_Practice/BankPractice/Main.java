package Self_Practice.BankPractice;

import java.util.Scanner;

public class Main {
    static Scanner s = new Scanner(System.in);
    static BankAccount myAccount;

    public static void main(String[] args) {
        createAccount();
    }

    public static void createAccount() {
        System.out.println("예금주명을 입력하세요: ");
        String ownerName = s.nextLine();
        System.out.println("계좌번호를 입력하세요: ");
        String accountNumber = s.nextLine();
        System.out.println("초기 입금액을 입력하세요: ");
        double initialBalance = s.nextDouble();
        myAccount = new BankAccount();
        myAccount.ownerName = ownerName;
        myAccount.accountNumber = accountNumber;
        myAccount.balance = initialBalance;
        System.out.printf("%s님의 계좌가 성공적으로 생성되었습니다", ownerName);
    }
}
