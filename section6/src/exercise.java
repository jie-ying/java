public class exercise {
    public static void main(String[] args){
        oddEven(2);
        oddEven(3);
        oddEven(10000000);

        printEvenNumber();

        calculateSum(4);

        multiplyTable();

        int[] a = {3, 7, 1, 9, 2};
        int[] b = {5, 8, 3, 4, 9, 10, 2, 1};
        minMax(a);
        minMax(b);
    }

    public static void oddEven(int num){
        if(num % 2 == 0){
            System.out.println("It's an even number");
        }else {
            System.out.println("It's a odd number");
        }
    }

    public static void printEvenNumber(){
        for(int i = 1; i <= 100; i++){
            if(i % 2 == 0){
                System.out.print(i + " ");
            }
        }
    }

    public static void calculateSum(int x){
        int total = 0;
        for(int i = 1; i <= x; i++){
            total += i;
        }
        System.out.println("\nthe toal is " + total);
    }

    public static void multiplyTable(){
        for(int i = 1; i <= 9; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(i + " * " + j + " = " + (i * j) + "   ");
            }
            System.out.print("\n");
        }
    }

    public static void minMax(int[] nums){
        int min = nums[0];
        int max = nums[0];

        for(int i = 0; i < nums.length; i++){
            if(nums[i] < min){
                min = nums[i];
            }
        }

        for(int i = 1; i < nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}
