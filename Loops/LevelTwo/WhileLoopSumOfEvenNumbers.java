public class WhileLoopSumOfEvenNumbers{
    public static void main(String[] args){

        int sum = 0;
        int count = 0;
        while(count < 50){
            count +=2;
            sum += count;
            System.out.println(count + " = " + sum);
        }

            System.out.printf("The Total Sum = %d%n", sum);
    }
}
