import java.util.Scanner;
import java.util.HashMap;

public class CensoredWord {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        HashMap<String,String> censor=new HashMap<>();
        censor.put("Shutup","censored");
        censor.put("Sorry","censored");
        System.out.println(censor);
        
        String string = "";
        System.out.println("Type something then press enter, " +
        "or type \"end\" to end the program");
        
        while (!(string = scanner.next()).equals("end")) {
            if(censor.containsKey(string)){
                System.out.println(censor.get(string));
            }
            else{
                System.out.println("You typed " + string.toUpperCase() + "!");
            }
        }
        System.out.println("Program ended!");
        }
        }
