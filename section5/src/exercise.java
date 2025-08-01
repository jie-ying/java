public class exercise {
    public static void main (String[] args){
        System.out.println("68 in = " + convertToCentimeter(68) + "cm");
        System.out.println("5 ft, 8 in = " + convertToCentimeter(5, 8) + "cm");
    }

    public static double convertToCentimeter(int inches){
        return inches * 2.54;
    }

    public static double convertToCentimeter(int feet, int inches){
        return ((feet * 12) + inches) * 2.54;
    }
}
