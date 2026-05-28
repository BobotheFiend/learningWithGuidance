public class DoWhileLoopPromptPassword{
    public static void main(String[] nnamdi){
    java.util.Scanner inputCollector = new java.util.Scanner(System.in);

        String password = "PASSWORD";
        int count = 6;
        System.out.print("Enter password: ");
        String inputPassword = inputCollector.nextLine().trim();
        if(inputPassword.equals(password))
            System.out.println("Loggedin Successfully!");
        else
        do{
            System.out.printf("\nIncorrect Password!\nYou have %d trial(s) remaining...try again%n",count);
            count--;
            System.out.print("Enter password: ");
            inputPassword = inputCollector.nextLine().trim();
            if(inputPassword.equals(password)){
                System.out.println("Loggedin Successfully!");
            }
            if(count == 0){
                System.out.println("Your Account Has Been Locked!");
                break;
            }
        } while(!inputPassword.equals(password));

        
           
    }
}
