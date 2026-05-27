public class WhileLoopFindingSmallest{
    public static void main(String[] args){
    java.util.Scanner inputCollector = new java.util.Scanner(System.in);

        int smallest = Integer.MAX_VALUE;
        int count = 0;
        while(count < 5){
            System.out.print("Enter a Number: ");
            int userInput = inputCollector.nextInt();
            
            if (userInput < smallest){
                smallest = userInput;
            }
            ++count;
        }
            System.out.printf("%nThe smallest = %d%n", smallest);
    }
}
