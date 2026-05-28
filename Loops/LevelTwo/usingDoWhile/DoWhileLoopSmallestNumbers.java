public class DoWhileLoopSmallestNumbers{
    public static void main(String[] nnamdi){
    java.util.Scanner inputCollector = new java.util.Scanner(System.in);

        int smallest = Integer.MAX_VALUE;
        int count = 0;

        System.out.printf("------------------------------------Finding The Smallest Number-------------------------------------------%n");
        do{
            System.out.print("Enter a Number: ");
            int userInput = inputCollector.nextInt();

            if(userInput < smallest)
                smallest = userInput;
            ++count;
        } while(count < 5);

        System.out.printf("The Smallest Number = %d%n",smallest);              
    }
}
