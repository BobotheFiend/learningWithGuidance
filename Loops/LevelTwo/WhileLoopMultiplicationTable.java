public class WhileLoopMultiplicationTable{
    public static void main(String[] args){

        int number = 7;
        System.out.printf("---------------------------------------%d times Multiplication Table---------------------------------------%n", number);
        int count = 1;
        while(count <= 15){
            System.out.println("\t"+ count + " x " + number + " = " + count*number);
            count++;
        }
    }
}
