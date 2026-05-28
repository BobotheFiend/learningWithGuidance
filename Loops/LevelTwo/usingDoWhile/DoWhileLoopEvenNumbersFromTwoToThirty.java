public class DoWhileLoopEvenNumbersFromTwoToThirty{
    public static void main(String[] nnamdi){

        int count = 0;

        do{
            ++count;
            if(count % 2 == 0)
                System.out.println(count);
        } while(count < 30);
              
    }
}
