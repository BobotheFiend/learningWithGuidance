public class DoWhileLoopProductOfNumbers{
    public static void main(String[] nnamdi){

        int product = 1;
        int count = 0;

        do{
            ++count;
            product*=count;

        } while(count < 5);
        System.out.printf("The product of 1-5 --> %d%n",product);              
    }
}
