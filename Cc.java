import java.util.Scanner;

public class Cc {
    
    public static String calc(String s1){

        Str res = new Str();
        res.inputString();
        s1 = String.valueOf(res);
        return s1;
    }
      // можем работать только со строками


}

class Str {
    void inputString() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input: ");
        String inputW = in.nextLine();
        String input = inputW.replaceAll("\\s", "");
        System.out.println("Input = "+input);
        in.close();
    }
}