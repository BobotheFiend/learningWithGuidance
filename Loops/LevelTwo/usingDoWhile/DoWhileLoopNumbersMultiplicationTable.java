public class DoWhileLoopNumbersMultiplicationTable{
    public static void main(String[] nnamdi){

        int number = 7;
        int multiply;
        int count = 0;

        System.out.printf("------------------------------------%dx Multiplication Table-------------------------------------------%n", number);
        do{
            multiply = number * count;
            System.out.printf("  %d x %d = %d%n",number,count, multiply);
            ++count;
        } while(count <= 12);
              
    }
}
