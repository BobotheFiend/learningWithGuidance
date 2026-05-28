public class RightAnglePatternStars{
    public static void main(String[] args){

        int count = 0;
        for(;count < 7; count++){
            int innerCount = 0;
            for(; innerCount <= count; innerCount++){
                System.out.print("*");
            }
            System.out.printf("%n");
        }
    }
}
