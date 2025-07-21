package encapsulation;

public class Abonent {

    public String name;
    public int balance =120;
    public String city;

    public  void  getBalance() {
        System.out.println(balance);
    }

    public void useBalance(int count) {
        if ((this.balance -count) < 0) {
            System.out.println("Insufficient Balance");
        }else {
            balance -= count;
            System.out.println("current balance " + balance);
        }
    }
}
