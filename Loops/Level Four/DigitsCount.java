public class DigitsCount{
    public static void main(String[] nnamdi){

        int number = 34586946;
        int displayNumberLater = number;
        String holding = "";
        int digits = 0;
        int counter = 0;

        for(;number > 0;){
            int extractor = number % 10;
            digits = (digits * 10) + extractor;
            counter++;
            holding+=extractor;
            number = number/10;
        }
        System.out.printf("The number of digits in %d --> %d%n",displayNumberLater, counter);
//        int length = holding.length();
//        
//        System.out.printf("The number of digits in %d --> %d  %d%n%s%n",displayNumberLater, counter, length, holding);
        
    }
}
