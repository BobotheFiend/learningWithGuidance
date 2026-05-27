public class LoopPrintingSquareOfNumber{
    public static void main(String[] args){

        int count = 0;
        for(; count < 10;){
            ++count;
            System.out.println("The Square of " + count + " = " + Math.pow(count,2));
        }
    }
}
