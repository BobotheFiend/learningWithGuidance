public class Factorial{
    public static void main(String[] nnamdi){

        int number = 5;
        int factorial = 1;
        
        while(number > 0){

            factorial *= number;
            --number;
        }  
        System.out.println(factorial);
    }
}
