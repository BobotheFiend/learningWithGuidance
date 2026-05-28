public class PyramidPatternStars{
    public static void main(String[] args){

        int length = 16;
        int count = 0;
        for(;count < length; count++){
            int innerCount = count;
            for(; innerCount <= length; innerCount++){
                System.out.print(" ");
            }
                int nestedCount = 0;
                for (; nestedCount <= count; nestedCount++){
                    System.out.printf(" *");
                }
 
            System.out.printf("%n");
        }
//
//        int secondCount = 0;
//        for(;secondCount <= length; secondCount++){
//            int secondInnerCount = 0;
//            for(; secondInnerCount <= secondCount; secondInnerCount++){
//                System.out.print("  ");
//            }
//                int secondNestedCount = secondCount;
//                for (; secondNestedCount <= length; secondNestedCount++){
//                    System.out.printf("   *");
//                }
// 
//            System.out.printf("%n");
//        }
    }
}
