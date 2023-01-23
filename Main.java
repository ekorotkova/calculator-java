import java.util.Scanner;

public class Main {

    /**
     * @param input
     * @return
     * @throws Exception
     **/
    private static String result;

    public static String calc(String input) throws Exception {

        // input string
        Scanner strIn = new Scanner(System.in);
        System.out.println("Input: ");
        String sInputLine = strIn.nextLine();
        strIn.close();

        // condition
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

        // return result
        switch (s) {
            case "+":
                int resultSm = a + b;
                result = String.valueOf(resultSm);
                return ("Output: " + result); // return result string
            case "-":
                int resultS = a - b;
                result = String.valueOf(resultS);
                return ("Output: " + result); // return result string
            case "*":
                int resultM = a * b;
                result = String.valueOf(resultM);
                return ("Output: " + result); // return result string
            case "/":
                int resultD = a / b;
                result = String.valueOf(resultD);
                return ("Output: " + result); // return result string
            default:
                throw new Exception("Операция не может быть выполнена!");
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println(calc(result));

    }
}