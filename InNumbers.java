import java.util.Scanner;

public class InNumbers {
    
    public static void main() {
        Num nums = new Num();
        nums.entNums();
    }
}

class Num{
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