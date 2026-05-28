public class NestedMultiplicationTable{
    public static void main(String[] args){

        int count = 1;
        for(;count < 10; count++){
            System.out.printf("-----------------------------------------------------%d Time Multiplication Table-----------------------------------------------------", count);
            int innerCount = 0;
            for(; innerCount <= 12; innerCount++){
                
                System.out.println(count + " x " + innerCount + " = " + innerCount*count);
            }
            System.out.printf("%n");
        }
    }
}
