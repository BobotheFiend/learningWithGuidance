public class LoopPrintingMultiples{
    public static void main(String[] args){

        int count = 0;
        for(; count < 50;){
            ++count;
            if (count % 3 == 0)
                System.out.println(count);
        }
    }
}
