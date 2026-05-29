public class ReverseNumber{
    public static void main(String[] nnamdi){

        int number = 419;
        int reverse = 0;
        
        while(number != 0){

            int extractor = number % 10;

            reverse = (reverse * 10) + extractor;
            number = number/10;
        }  
        System.out.println(reverse);
    }
}
