
import java.util.Scanner;

public class Main {

    /**
     * @return
     * @throws Exception
     * @param result
     */

    public static void main(String[] args) throws Exception {
        SwitchCase.calculation();

    }

    public static String calc(String input) throws Exception {
        /*
         * Scanner strIn = new Scanner(System.in);
         * System.out.println("Input: ");
         * String sInputLine = strIn.nextLine();
         * String inputLine = sInputLine;
         * strIn.close();
         * return inputLine;
         */
        SwitchCase.calculation();
        String result = input;
        return result;

    }

}

class SwitchCase {

    /**
     * @param input
     * @return
     * @throws Exception
     */
    public static void calculation() throws Exception {
        Scanner strIn = new Scanner(System.in);
        System.out.println("Input: ");
        String sInputLine = strIn.nextLine();
        strIn.close();

        String[] symbols = sInputLine.split(" ");

        String num1 = symbols[0];
        String num2 = symbols[2];

        int a = Integer.parseInt(num1);
        int b = Integer.parseInt(num2);
        String s = symbols[1];

        if (a < 1 || a > 10) {
            throw new Exception("Число не входит в диапозон допустимых!");
        } else if (b < 1 || b > 10) {
            throw new Exception("Число не входит в диапозон допустимых!");
        } else {

        }
        switch (s) {
            case "+":
                int resultSm = a + b;
                String result = String.valueOf(resultSm);
                System.out.println("Output: " + result);
                break;
            case "-":
                int resultS = a - b;
                result = String.valueOf(resultS);
                System.out.println("Output: " + result);
                break;
            case "*":
                int resultM = a * b;
                result = String.valueOf(resultM);
                System.out.println("Output: " + result);
                break;
            case "/":
                int resultD = a / b;
                result = String.valueOf(resultD);
                System.out.println("Output: " + result);
                break;
            default:
                throw new Exception("Операция не может быть выполнена!");
        }
    }
}