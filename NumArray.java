import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumArray{
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите выражение: ");
        String string = in.nextLine();
        String symbols = "+-*/";
        Pattern pattern = Pattern.compile(symbols);
        Matcher matcher = pattern.matcher(string);
        System.out.println("Выполняем сложение!\n Потому что передно значение со знаком "+matcher.group());
        }





        /*int nums = in.nextInt();
        Integer[] numbers = new Integer[] {1,2,3,4,5,6,7,8,9,10};
        List<Integer> intList = new ArrayList<>(Arrays.asList(numbers));
        if(intList.contains(nums)){
            System.out.println("Число подходит!");
        }
        else {
            throw new Exception("Число не входит в массив от 1 до 10");
        }*/

        //
        /*
        String string = in.nextLine();
        String[] strings = new String[] {"+", "-", "*", "/"};
        String strWhiteSpacesNone = string.replaceAll("\\s", "");
        List<String> strList = new ArrayList<>(Arrays.asList(strings));
            if(strList.contains(strWhiteSpaceNone) && strWhiteSpaceNone.contains("+")){
                System.out.println("Сумма чисел равна: ");
            }
            else{
                throw new Exception("Операция не является: сложением, вычитанием, умножением или делением!");
            }
        */
        
}
