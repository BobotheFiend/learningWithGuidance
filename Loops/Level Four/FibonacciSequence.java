public class FibonacciSequence{
    public static void main(String[] nnamdi){

        int terms = 10;
        int firstNumber = 0;
        int secondNumber = 1;
        int total = 0;

        int count = 0;
        for(;count < terms-1; ){
            ++count;
            total = firstNumber + secondNumber;                
            System.out.printf("%d + %d = %d%n", firstNumber, secondNumber, total);
            firstNumber = secondNumber;
            secondNumber = total;  
        }
        System.out.printf("The fibonacci of the %dth term --> %d%n%n",terms, total);                        

        
    }
}
