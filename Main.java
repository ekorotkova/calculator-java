
import java.util.Scanner;

public class Main {

    /**
     * @return
     * @throws Exception
     * @param result
     */
    private static Scanner strIn = new Scanner(System.in);
    private static String sInputLine = strIn.nextLine();

    public static String calc(String input) throws Exception {

        String[] symbols = sInputLine.split(" ");
        String num1 = symbols[0];
        String num2 = symbols[2];
        String s = symbols[1];

        int a = Integer.parseInt(num1);
        int b = Integer.parseInt(num2);

        if (a < 1 || a > 10) {
            throw new Exception("Число не входит в диапазон допустимых!");
        } else if (b < 1 || b > 10) {
            throw new Exception("Число не входит в диапазон допустимых!");
        } else {

        }
        switch (s) {
            case "+":
                int resultSm = a + b;
                String result = String.valueOf(resultSm);
                return ("Output: " + result);
            case "-":
                int resultS = a - b;
                result = String.valueOf(resultS);
                return ("Output: " + result);
            case "*":
                int resultM = a * b;
                result = String.valueOf(resultM);
                return ("Output: " + result);
            case "/":
                int resultD = a / b;
                result = String.valueOf(resultD);
                return ("Output: " + result);
            default:
                throw new Exception("Операция не может быть выполнена!");
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println(calc(sInputLine));

    }
}
