public class LoopPrintingDivisibleNumbers{
    public static void main(String[] args){

        int count = 0;
        for(; count < 100;){
            ++count;
            if (count % 2 == 0){
                System.out.println("Numbers Divisible by 2: " + " " + count);
            }
            else if(count % 5 == 0){
                System.out.println("Numbers Divisible by 5: " + " " + count);
            }
        }
    }
}
