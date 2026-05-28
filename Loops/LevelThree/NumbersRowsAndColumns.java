public class NumbersRowsAndColumns{
    public static void main(String[] args){

        int count = 0;
        for(;count < 20; ++count){
            System.out.print()
            int innerCount = 1;
            for(; innerCount <= 20; ++innerCount){
                System.out.printf("\t%d", innerCount+count);
            }
            System.out.printf("%n");
        }

    }
}
