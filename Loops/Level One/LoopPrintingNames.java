public class LoopPrintingNames{
    public static void main(String[] args){

        String name = "Nnamdi";
        int count = 0;
        for(; count < 15;){
            ++count;
            System.out.println(count + ":" + " " + name);
        }
    }
}
