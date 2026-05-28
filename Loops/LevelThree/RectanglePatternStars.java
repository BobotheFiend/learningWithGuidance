public class RectanglePatternStars{
    public static void main(String[] args){

        int count = 0;
        for(;count < 4; count++){
            int innerCount = 0;
            for(; innerCount < 19; innerCount++){
                System.out.print("*-");
            }
            System.out.print("*");
            System.out.printf("%n");
            int nestedCount = 0;
            for(;nestedCount < 20; nestedCount++){
            System.out.printf("' ");
            }
            System.out.printf("%n");
        }

        int counter = 0;
        for(;counter < 19; counter++){
            System.out.printf("*-");
        } 
        System.out.printf("*%n");
    }
}
