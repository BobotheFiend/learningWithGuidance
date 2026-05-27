public class WhileLoopPromptingPassword{
    public static void main(String[] args){
    java.util.Scanner inputCollector = new java.util.Scanner(System.in);

        String password = "EasyPeezy";
        String inputPassword = "Yes";
        boolean logginIn = inputPassword.equalsIgnoreCase("Yes");
        System.out.print("Enter the Password: ");
        String userInput = inputCollector.nextLine();
        if (userInput.equals(password)){
            System.out.println("logged in Successfully");
        }
        while(!userInput.replace(" ","").equals(password)){
            System.out.println("Incorrect...try again");
            System.out.print("Enter the Password: ");
            userInput = inputCollector.nextLine().replace(" ","");

            if(userInput.equals(password)){
                System.out.println("logged in Successfully");
            }
        }
    }
}
