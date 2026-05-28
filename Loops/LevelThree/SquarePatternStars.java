public class SquarePatternStars{
    public static void main(String[] args){

        int count = 0;
        for(;count < 4; count++){
            int innerCount = 0;
            for(; innerCount < 7; innerCount++){
                System.out.print("*");
            }
            System.out.printf("%n");
        }
    }
}
