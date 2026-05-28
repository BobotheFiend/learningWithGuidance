public class DoWhileLoopMultipleOfNumbers{
    public static void main(String[] nnamdi){

        int count = 0;
        count++;
        do{
            count++;
            if(count % 3 == 0)
                System.out.printf("The Multiples of 3 --> %d%n",count);
        } while(count < 50);
              
    }
}
