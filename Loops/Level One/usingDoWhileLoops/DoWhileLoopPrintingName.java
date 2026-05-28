public class DoWhileLoopPrintingName{
    public static void main(String[] nnamdi){

        String name = "HIMnamdi";
        int count = 0;

        do{
            ++count;
            if(count == 1)
                System.out.printf("Name: %s --> %d(time)%n",name, count);
            else
            System.out.printf("Name: %s --> %d(times)%n",name, count);
        } while(count < 15);
              
    }
}
