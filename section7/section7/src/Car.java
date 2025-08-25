public class Car {
    private String make = "Ford";
    private String model;
    private String color;
    private int doors;
    private boolean convertible;

    public void describe() {

        System.out.println(doors + "-door " +
                color + " " +
                make + " " +
                model + " " +
                (convertible ? "Convertible" : ""));
    }

    public String getMake(){
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public int getDoors() {
        return doors;
    }

    public void setMake(String make) {
        this.make = make;
        //use "this" to tell Java to update the field make of the current instance
        // with the contents of the parameter make.
        // This resolves the warnings.
        //if not use this, will get a warning,
        //for example: if we set the make value to "audi", that will not work, still get ford
    }
}
