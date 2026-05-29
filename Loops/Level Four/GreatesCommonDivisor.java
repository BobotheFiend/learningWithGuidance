public class GreatesCommonDivisor{
    public static void main(String[] nnamdi){
      
        int largest = Integer.MIN_VALUE;
        int count = 1;
        int firstNumber = 15;
        int secondNumber = 20;

        for(; count <= firstNumber+secondNumber; count++){

            if(firstNumber % count == 0 && secondNumber % count == 0){
                if(count > largest){
                    largest = count;
                System.out.println(count);
                }
            }

        }
        System.out.printf("The Greatest common divisor of %d and %d  --->  %d%n", firstNumber, secondNumber, largest);
    }
}  
