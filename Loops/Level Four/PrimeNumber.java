public class PrimeNumber{
    public static void main(String[] nnamdi){

        int number = 1;
        int count = 2;
        boolean isItPrime = true;

        if (number < 2)
            isItPrime = false;

        for(; count <= number/2; count++ ){

            if(number % count == 0){
                isItPrime = false;
            }
        }

        if (isItPrime == true){
            System.out.printf("%d Is Prime%n", number);        
        }
        else{
            System.out.printf("%d is not Prime%n", number);    
        }
    }
}
