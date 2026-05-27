public class WhileLoopFindingLargest{
    public static void main(String[] args){
    java.util.Scanner inputCollector = new java.util.Scanner(System.in);

        int largest = 0;
        int count = 0;
        while(count < 5){
            System.out.print("Enter a Number: ");
            int userInput = inputCollector.nextInt();
            
            if (userInput > largest){
                largest = userInput;
            }
            ++count;
        }
            System.out.printf("%nThe largest = %d%n", largest);
    }
}
