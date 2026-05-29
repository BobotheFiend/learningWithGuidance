public class PalindromeChecker{
    public static void main(String[] nnamdi){

        int number = 22522;
        int checkTheNumber = number;
        int digits = 0;

        for(;number > 0;){
            int extractor = number % 10;
            digits = (digits * 10) + extractor;

            number = number/10;
        }

        if (digits == checkTheNumber)
            System.out.printf("The reverse of %d --> %d%nis a PALINDROME!%n",checkTheNumber, digits);

        else
            System.out.printf("The reverse of %d --> %d%nis NOT a Palindrome!%n",checkTheNumber, digits);            

        
    }
}
