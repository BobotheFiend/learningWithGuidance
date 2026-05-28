public class DoWhileLoopPrompt{
    public static void main(String[] nnamdi){
    java.util.Scanner inputCollector = new java.util.Scanner(System.in);

        int sum = 0;
        int count = 0;

        do{
            System.out.print("Enter a Number: ");
            int numberChoice = inputCollector.nextInt();
            sum+=numberChoice;
            
            System.out.println(numberChoice + " " + sum);
            ++count;
        } while(count < 5);
        
        System.out.printf("The Total Sum --> %d%n",sum);   
    }
}
