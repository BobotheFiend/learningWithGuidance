public class CheckerBoard{
    public static void main(String[] args){

        int count = 0;
        for(;count < 10; ++count){
            int innerCount = 0;
            for(; innerCount < 8; ++innerCount){
                System.out.print("XO");
            }
            System.out.printf("%n");
        }

    }
}
