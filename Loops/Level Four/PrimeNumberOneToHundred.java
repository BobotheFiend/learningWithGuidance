public class PrimeNumberOneToHundred{
    public static void main(String[] nnamdi){
        
        int counter = 0;
        int number = 1;
        for (; number <= 100 ; number++){
            
            boolean isItPrime = true;
            if (number < 2)
                isItPrime = false;

            int count = 2;
            for(; count <= number/2; count++ ){

                if(number % count == 0){
                    isItPrime = false;
                }
            }

            if (isItPrime == true){
                System.out.printf("%d %7d Is Prime%n",++counter, number);        
            }
        }

    }
}  
