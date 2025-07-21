package encapsulation;

public class Abonent2 {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    private String city;
    private int balance;

    public Abonent2(String name, String city, int balance) {
        this.name = name;
        this.city = city;
//        this.balance = balance;
        if (balance > 0 && balance <= 120) {
            this.balance = balance;
        }
    }

    public void getBalanceMethod() {
        System.out.println(balance);
    }

    public void useBalance(int count) {
        if ((this.balance - count) < 0) {
            System.out.println("Insufficient Balance");
        } else {
            balance -= count;
            System.out.println("current balance " + balance);
        }
    }
}
