package OverLoading;

public class Account {
    private int hesabNo;
    private String name;
    private double balance;

    public Account(double balance){
        this.balance = balance;
    }

    public Account(int hesabNo, String name, double balance){
        this.hesabNo = hesabNo;
        this.name = name;
        this.balance = balance;
    }


    public void withDraw(double amount) {
        if(amount > 1500) {
            System.out.println("Bir gunde bu qeder pul ceke bilmersiz");
        }
        if(balance - amount < 0) {
            System.out.println("Balansda kifayet qeder yoxdur = " + balance);
        }
        else balance -= amount;
        System.out.println("Yeni balance = " + balance);
    }

    public void increaseBalance(double amount) {
        balance += amount;
        System.out.println("Yeni balance = " + balance);
    }

    public void customerInfo() {
        System.out.println(hesabNo + " " + name + " " + balance);
    }

    public int getHesabNo() {
        return hesabNo;
    }

    public void setHesabNo(int hesabNo) {
        this.hesabNo = hesabNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Account(){
        System.out.println("Constructor Yaradildi");
    }
}
