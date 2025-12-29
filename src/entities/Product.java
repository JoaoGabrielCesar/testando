package entities;

public class Product {

    private int number;
    private String holder;
    private double balance;



    public Product(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public int getNumber() {
        return number;
    }


    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void initialDeposit(double initial){
        balance = balance + initial;
    }

    public void deposit(double deposit){
        balance += deposit ;
    }

    public void withdraw(double withdraw){
        balance -= withdraw + 5.00 ;
    }


    public String toString(){
        return "Account "
        + number
        + ", Holder: "
        + holder
        + ", Balance: $"
        +String.format("%.2f", balance);
    }



}


