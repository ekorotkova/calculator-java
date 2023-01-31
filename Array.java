// создает и выводит массив данных от 1 до 10 и если число больше 10, то выбрасывает экспепш.

public class Array{
    public static void main(String[] args) throws Exception {
        int [] numbers = new int[11];
        //numbers[0] = 1;
        for(int i = 1; i<numbers.length; i++){
            numbers[i] = i;
            if(i>10){
                throw new Exception("Число больще 10!");
            }
            else{
                System.out.println(numbers[i]);
            }   
        }
        
    }
}