public class practice {
    public static void main(String[] args){
        char charValue = 'A';
        switch (charValue){
            case 'A': {
                System.out.println("A is Able");
                break;
            }
            case 'B': {
                System.out.println("B is Baker");
                break;
            }
            case 'C': {
                System.out.println("C is Charlie");
                break;
            }
            case 'D': {
                System.out.println("D is Dog");
                break;
            }
            case 'E': {
                System.out.println("E is Easy");
                break;
            }
            default:{
                System.out.println("letter not found");
            }
        }

        printDayOfWeek(0);
        printDayOfWeek(1);
        printDayOfWeek(3);
        printDayOfWeek(5);
        printDayOfWeek(7);

        System.out.println("3 is " + (isPrime(3) ? "" : "Not ") + "a prime number");
        System.out.println("8 is " + (isPrime(8) ? "" : "Not ") + "a prime number");

        System.out.println("the sum of 1234 " + sumDigits(1234));
        System.out.println("the sum of -123 " + sumDigits(-123));
    }

    public static void printDayOfWeek(int day){
        String dayOfWeek = switch (day){
            case 0 -> {yield  "Sunday"; }
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid day";
        };

        System.out.println(day + " stand for " + dayOfWeek);
    }

    public static boolean isPrime(int wholeNumber){
        if(wholeNumber < 2){
            return (wholeNumber == 2);
        }

        for (int divisor = 2; divisor <= wholeNumber / 2; divisor++){
            if(wholeNumber % divisor == 0){
                return false;
            }
        }
        return true;
    }

    public static int sumDigits(int number){
        if (number < 0){
            return -1;
        }

        int sum = 0;

        while (number > 9){
            sum += (number % 10);
            number = number / 10;
        }

        sum += number;
        return sum;
    }
}
