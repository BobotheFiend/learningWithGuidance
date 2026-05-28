public class HollowSquare{
    public static void main(String[] args){

        int count = 0;
        for(;count < 11; count++){
            System.out.printf("* * ");

        }
        System.out.printf("**%n");
        int innerCount = 0;
        for(; innerCount < 19; innerCount++){
             System.out.print("*");
            int nestedCount = 0;
            for(; nestedCount < 11; nestedCount++){
                System.out.print("    ");
//            System.out.printf("%n");
            }
            System.out.printf("*");
            System.out.printf("%n");
        }

        int counter = 0;
        for(;counter < 11; counter++){
            System.out.printf("* * ");
        } 
        System.out.printf("**%n");
    }
}
