public class ConstructorEx {

    private  String name;
    private double creditLimit;
    private  String email;

    public ConstructorEx(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public ConstructorEx(String name, String email) {
        this(name, 1000, email);
    }

    public ConstructorEx(){
        this("Nobody", "nobody@nowhere.com");
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }

}
