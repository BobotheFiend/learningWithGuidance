public class DoWhileLoopSumOfNumbers{
    public static void main(String[] nnamdi){

        int sum = 0;
        int count = 0;

        do{
             ++count;
            sum+=count;
            System.out.printf("%d%n",sum);
           
        } while(count < 10);
        
        System.out.printf("The Total Sum --> %d%n",sum);   
    }
}
