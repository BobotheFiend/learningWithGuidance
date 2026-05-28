public class InvertedRightAnglePatternStars{
    public static void main(String[] args){

        int length = 8;
        int count = 0;
        for(;count < length; count++){
            int innerCount = count;
            for(; innerCount < length; innerCount++){
                System.out.print("*");
            }
            System.out.printf("%n");
        }
    }
}
