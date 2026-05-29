public class AverageOfNumbers{
    public static void main(String[] nnamdi){
    java.util.Scanner inputCollector = new java.util.Scanner(System.in);
  
        int sum = 0;
        int count = 0;
        System.out.print("Enter a number: ");
        int userInput = inputCollector.nextInt();

        while(userInput != -1){
            sum+=userInput;
            ++count;

            System.out.print("Press -1 to stop inputting numbers\nEnter a number: ");
            userInput = inputCollector.nextInt();
            
        }
        int average = sum/count;

        System.out.printf("%nThe average of %d/%d  --->  %d%n",sum, count, average);
    }
}  
