package inheritance;

public class Dog extends Animal{
    //use "extends" keyword to inherit from Animal

    private String earShape;
    private String tailShape;

    public Dog(String type, double weight){
        this(type, weight, "a", "b");
    }
    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "Small" : (weight < 35 ? "Medium" : "Large"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }


//    public void makeNoise(){
//
//    }

    //overriding: a method (in subclass) has the same name as one on a super class
    // that will override a parent(super) class method when we want to show different behavior for the method
    // like here, will override the makeNosie(), then when we run the main
    //it will not show any noise information


    @Override
    public void move(String speed) {
        super.move(speed);
        System.out.println("llll");
        //we can use super.methodName to inherit from the parent class and
        //add more information/action to override it
    }


    public Dog() {
//        super();
        //is a lot like this() -- this()constructor
        //if keep the blank in the parenthesis, then we need a default constructor in Animal
        //super() is a way to call the constructor on the parent class.
        //and it must be the first statement of the constructor
        // by running the main method, it will get null value for the dog


        super("Mutt", "Big", 50);
        //because in Animal, the constructor has three 3 parameters, so here we need 3
        //and pass the data to it.
        //so when running the main method, we will have the data.
    }

//    public void makeNoise(){
//        if(type == "a"){}
//    }
    //Here, we get the error that says --> 'type' has private access in inheritance.Animal
    //so we can use the keyword "protected" for the type;
    //like protected String type;
    //which means, this variable is private, but the child class can access it
}
