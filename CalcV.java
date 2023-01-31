import java.util.Scanner;


public class CalcV {
    public static void main(String[] args) {
       Numbers num = new Numbers();
       num.enterNumbers();
       // Numbers expt = new Numbers();
       // expt.exceptNumbers();
       if()
       Numbers actSum = new Numbers();
       actSum.runProgramSum();
    }
}

class Numbers {
    int a, b, sum, sub, mul, div;
    /**
     * 
     */
    void enterNumbers() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите выражение: ");
        a = in.nextInt();
        b = in.nextInt();
        in.close();
        System.out.println("a = "+a+" b = "+b);
    }

    void runProgramSum(){
        sum = a+b;
        System.out.println(a+"+"+b+"="+sum);
    }
    void runProgramSub(){
        sub = a-b;
        System.out.println(a+"+"+b+"="+sub);
    }
    void runProgramMul(){
        mul = a*b;
        System.out.println(a+"+"+b+"="+mul);
    }
    void runProgramDiv(){
        div = a/b;
        System.out.println(a+"+"+b+"="+div);
    }
}
