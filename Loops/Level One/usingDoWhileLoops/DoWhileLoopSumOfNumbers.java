public class DoWhileLoopSumOfNumbers{
    public static void main(String[] nnamdi){

        int sum = 0;
        int count = 0;

        do{
            ++count;
            sum+=count;

        } while(count < 100);
        System.out.printf("The sum of 1-100 --> %d%n",sum);              
    }
}
