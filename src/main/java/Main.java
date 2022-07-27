import java.util.Scanner;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        // create an executor
        Integer number = getCallableInteger().call();
        System.out.println(number);
    }
    public static Callable<Integer> getCallableInteger() {
    Callable<Integer> number = () -> {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        return (Integer)num;
    };
    return number;
    }
}