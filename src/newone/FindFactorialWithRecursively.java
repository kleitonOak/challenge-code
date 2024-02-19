package newone;

public class FindFactorialWithRecursively {

    public static int factorialOf(int number){
        if(number == 0 || number == 1){
            return 1;
        }else{
            return number * factorialOf(number - 1);
        }
    }

    public static void main(String[] args){
        int number = 4;
        System.out.printf("Which Factorial of %d? %d", number, factorialOf(number));
    }
}
