import java.util.Scanner;



public class Calculator {
    public static void main(String[] args) {
       Numbers num = new Numbers();
       num.enterNumbers();
       // Numbers expt = new Numbers();
       // expt.exceptNumbers();
       MathOperations result = new MathOperations();
       result.runProgram();
    }
}


class Numbers {
    int a, b;

    /**
     * 
     */
    public void enterNumbers() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите выражение: ");
        a = in.nextInt();
        b = in.nextInt();
        in.close();
        System.out.println("a = "+a+" b = "+b);
    }
}

    /**
     * @throws Exception
     */
    /*void exceptNumbers() throws Exception{
        try {
            if(a > 10 || a < 1){
                throw new Exception();
            } else if (b > 10 || b < 1){
                throw new Exception();
        }
            else {
                System.out.println("a = "+a+" b = "+b);
            }

        }
        catch(Exception ex){
            System.out.println("Число не принадлежит множеству от 1 до 10");
        }
    }
}*/

class MathOperations{
    int sum;
    int sub;
    int mul;
    int div;
    int a;
    int b;
    String operation;

    /**
     * @param string TODO
     * 
     */
    void runProgram(){
        if (operation)
        switch(ch){
            case '+' :
              sum = a+b;
              System.out.println(a+"+"+b+"="+sum);
              break;
            case '-' :
              sub = a-b;
              System.out.println(a+"-"+b+"="+sub);
              break;
            case '*' :
              mul = a*b;
              System.out.println(a+"*"+b+"="+mul);
              break;
            case '/' :
              div = a/b;
              System.out.println(a+"/"+b+"="+div);
              break;
            default: 
            System.out.println("Программа не может выполнить данное действие.");
        }
    }

}