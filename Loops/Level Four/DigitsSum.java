public class DigitsSum{
    public static void main(String[] nnamdi){

        int number = 123;
        int displayNumberLater = number;
        int sum = 0;

        for(;number > 0;){
            int extractor = number % 10;
         
            sum+=extractor;
            number = number/10;
        }
        System.out.printf("The sum of digits in %d --> %d%n",displayNumberLater, sum);
        
    }
}
