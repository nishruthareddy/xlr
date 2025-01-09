import java.util.Scanner;
public class demo21 {
    public static String getFizzBizz(int number) {
        if (number <= 0) {
            return "Error";
        }
        if (number % 3 == 0 && number % 5 == 0) {
            return "FIZZBIZZ";
        } else if (number % 3 == 0) { 
            return "FIZZ";
        } else if (number % 5 == 0) {
            return "BIZZ";
        }
        return String.valueOf(number);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println(getFizzBizz(number));
        scanner.close();
    }
}