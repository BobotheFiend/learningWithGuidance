public class LoopPrintingProduct{
    public static void main(String[] args){

        int product = 1;
        int count = 0;
        for(; count < 5;){
            ++count;
            product*=count;
        }
       System.out.println(product);
    }
}
