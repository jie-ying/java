public class BankAccount {

    private String number;
    private int balance;
    private String name;
    private String email;
    private String phone;

    public  BankAccount(){
        System.out.println("Empty constructor called");
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void depositing(int deposit){
        balance += deposit;
        System.out.println("Deposit of " + deposit);
    }

    public void withdrawing(int withdrawNumber){
        if(balance - withdrawNumber< 0){
            System.out.println("Insufficient fund, your account only have " + balance);
        }else {
            balance = balance - withdrawNumber;
            System.out.println("The balance remaining: " + balance);
        }
    }
}
