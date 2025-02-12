import java.util.Scanner;

class VowelOrConsonant {
    static boolean isVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) != -1;
    }
}

public class Demo083 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine().trim();
        sc.close();

        if (input.isEmpty()) {
            System.out.println("Input is empty.");
            return;
        }

        char firstChar = input.charAt(0);
        System.out.println("The first character '" + firstChar + "' is " +
            (VowelOrConsonant.isVowel(firstChar) ? "a Vowel." : Character.isLetter(firstChar) ? "a Consonant." : "not a letter."));
    }
}