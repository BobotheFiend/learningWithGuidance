public class DoWhileLoopDivisibleOfNumbers{
    public static void main(String[] nnamdi){

        int count = 0;
        count++;
        do{
            count++;
            if(count % 2 == 0)
                System.out.printf("The numbers divisible by 2 --> %d%n",count);
            else if(count % 5 == 0)
                System.out.printf("%nThe numbers divisible by 5 --> %d%n%n",count);
            if(count % 2 == 0 && count % 5 == 0)
                System.out.printf("%nThis numbers is divisible by both 2 & 5 --> %d%n%n",count);
        } while(count < 100);
              
    }
}
