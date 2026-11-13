public class Encap {
    public static void main(String[] args){
        Bank b1 = new Bank();
        b1.id = 1;
        b1.balance = 10000.12;
        System.out.println("The balance for bank " + b1.id + " is " + b1.balance);
}
}

class Bank{
   private  int id;
    private double balance;

    void deposit(double balance){
        this.balance += balance;
    }

}
