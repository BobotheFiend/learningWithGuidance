public class WhileLoopPrompting{
    public static void main(String[] args){
    java.util.Scanner inputCollector = new java.util.Scanner(System.in);

        int total = 0;
        int count = 0;
        while(count < 5){
            System.out.print("Enter a Number: ");
            int userInput = inputCollector.nextInt();

            total += userInput;
            ++count;
            System.out.println(total);
        }
            System.out.printf("%nThe total = %d%n", total);
    }
}
