public class MainConsEx {

    public static void main(String[] args) {
        ConstructorEx consEx = new ConstructorEx("Tim", 1000, "tim@email.com");

        System.out.println(consEx.getName());
        System.out.println(consEx.getCreditLimit());
        System.out.println(consEx.getEmail());

        ConstructorEx secondConsEx =  new ConstructorEx();
        System.out.println(secondConsEx.getName());
        System.out.println(secondConsEx.getCreditLimit());
        System.out.println(secondConsEx.getEmail());
    }
}
