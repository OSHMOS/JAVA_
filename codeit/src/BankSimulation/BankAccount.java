package BankSimulation;

public class BankAccount {
    private int balance;
    private Person owner;

    public void setBalance (int newBalance) {
        balance = newBalance;
    }

    public int getBalance() {
        return balance;
    }

    public void setOwner (Person newOwner) {
        owner = newOwner;
    }

    public Person getOwner() {
        return owner;
    }

    // 파라미터 : 입금할 액수 (정수) 
    // 리턴 : 성공 여부 (불린)

    boolean deposit(int amount) {
        if(amount < 0 || owner.getCashAmount() < amount){
            System.out.println(String.format("입금 실패입니다. 잔고: %d원, 현금: %d원", balance, owner.getCashAmount()));
            return false;
        }else {
            owner.setCashAmount(owner.getCashAmount() - amount);
            balance += amount;
            System.out.println(String.format("%d원 입금하였습니다. 잔고: %d원, 현금: %d원", amount, balance, owner.getCashAmount()));
            return true;
        }
    }

    // 파라미터 : 출금할 액수 (정수)
    // 리턴 : 성공 여부 (불린)

    boolean withdraw(int amount) {
        if(amount < 0 || amount > balance){
            System.out.println(String.format("출금 실패입니다. 잔고: %d원, 현금: %d원", balance, owner.getCashAmount()));
            return false;
        }else {
            owner.setCashAmount(owner.getCashAmount() + amount);
            balance -= amount;
            System.out.println(String.format("%d원 출금하였습니다. 잔고: %d원, 현금: %d원", amount, balance, owner.getCashAmount()));
            return true;
        }
    }

//    // 첫 번째 파라미터 : 받는 사람 (Person)
//    // 두 번째 파라미터 : 이체할 금액 (정수)
//    // 리턴 : 성공 여부 (불린)
//
//    boolean transfer(Person to, int amount) {
//
//    }
}
