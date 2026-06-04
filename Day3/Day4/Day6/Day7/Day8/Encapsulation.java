class BankAccount {
    private double balance=0;
    public void setBalance(int amount) {
        balance+= amount;
        }
        public double getBalance() {
            return balance;
        }
    }

    public class Encapsulation {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setBalance(1000); // Using the public method to modify the balance
          System.out.println(account.getBalance()); // Using the public method to access the balance
    }
}  