public class DoWhileLoopLargestNumbers{
    public static void main(String[] nnamdi){
    java.util.Scanner inputCollector = new java.util.Scanner(System.in);

        int largest = Integer.MIN_VALUE;
        int count = 0;

        System.out.printf("------------------------------------Finding The Largest Number-------------------------------------------%n");
        do{
            System.out.print("Enter a Number: ");
            int userInput = inputCollector.nextInt();

            if(userInput > largest)
                largest = userInput;
            ++count;
        } while(count < 5);

        System.out.printf("The Largest Number = %d%n",largest);              
    }
}
