import java.text.ParseException;
import java.util.Scanner;

public class Main {

    /**
     * @param input
     * @return
     * @throws Exception
     **/

    private static String result;
    private static String sInputLine;
    private static int a;
    private static int b;

    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Scanner strIn = new Scanner(System.in);
        System.out.println("Please enter 2 numbers and the operation sign in the format [a + b]: ");
        strIn = new Scanner(System.in);
        sInputLine = strIn.nextLine();
        strIn.close();
        calc(sInputLine);
    }

    public static String calc(String input) throws Exception {
        // condition
        String[] symbols = sInputLine.split(" ");
        String num1 = symbols[0];
        String num2 = symbols[2];
        String s = symbols[1];

        if (symbols.length != 3) {
            throw new Exception("Выражение задано неверно!");
        } else {
        }

        try {
            a = Integer.parseInt(num1);
            b = Integer.parseInt(num2);
        } catch (Exception e) {
            System.out.println(e);
        }

        if (a < 1 || a > 10) {
            throw new Exception("Число не входит в диапазон допустимых!");
        } else if (b < 1 || b > 10) {
            throw new Exception("Число не входит в диапазон допустимых!");
        } else {
        }
        // return result
        switch (s) {
            case "+":
                int resultSm = a + b;
                result = String.valueOf(resultSm);
                System.out.println("Result: " + result);
                return (result); // return result string
            case "-":
                int resultS = a - b;
                result = String.valueOf(resultS);
                System.out.println("Result: " + result);
                return (result); // return result string
            case "*":
                int resultM = a * b;
                result = String.valueOf(resultM);
                System.out.println("Result: " + result);
                return (result); // return result string
            case "/":
                int resultD = a / b;
                result = String.valueOf(resultD);
                System.out.println("Result: " + result);
                return (result); // return result string
            default:
                throw new Exception("Операция не может быть выполнена!");
        }
    }
}