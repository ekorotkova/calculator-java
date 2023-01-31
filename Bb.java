import java.util.Scanner;

public class Bb {
    
    public static void main(String[] args) {
        B nums = new B();
        nums.entNums();
    }

    
    public static int sum(int num1, int num2) {
        int result = num1+num2;
        return result;
    }
    public static int sub(int num1, int num2) {
        int result = num1-num2;
        return result;
    }
    public static int mul(int num1, int num2) {
        int result = num1*num2;
        return result;
    }
    public static int div(int num1, int num2) {
        int result = num1/num2;
        return result;
    }
    
}

class B{
    int num1;
    int num2;
    String operation;
    
    void entNums() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите выражение: ");
        num1 = in.nextInt();
        num2 = in.nextInt();
        in.close();
        Scanner op = new Scanner(System.in);
        operation = op.next();
        op.close();

        System.out.println("a = "+num1+" b = "+num2+"op = "+operation);
    }
}