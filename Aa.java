import java.util.Scanner;

public class Aa {
    
    public static void main(String[] args) {
        A nums = new A();
        nums.entNums();
    }
}

class A{
    int num1;
    int num2;
    
    void entNums() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите выражение: ");
        num1 = in.nextInt();
        num2 = in.nextInt();
        in.close();
        System.out.println("a = "+num1+" b = "+num2);
    }
}

