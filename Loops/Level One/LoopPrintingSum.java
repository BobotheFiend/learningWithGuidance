public class LoopPrintingSum{
    public static void main(String[] args){

        int sum = 0;
        int count = 0;
        for(; count < 100;){
            ++count;
            sum+=count;
        }
       System.out.println(sum);
    }
}
