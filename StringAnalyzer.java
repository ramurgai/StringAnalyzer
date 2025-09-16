import java.util.Scanner;

public class StringAnalyzer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a full sentence
        // Store the sentence in a String variable
        System.out.print("Enter a full sentence please: ");
        String userSentence = input.nextLine();

        // Print the number of characters in the sentence
        // Print the first and last characters
        System.out.println("The total number of characters in your sentence is: " + userSentence.length());
        System.out.println("The characters at the beginning and end of you sentence are: " + userSentence.charAt(0) + " and " + userSentence.charAt(userSentence.length() - 1));

        // Print the sentence with whitespace removed from both ends
        // Print the sentence in all uppercase
        // Print the sentence in all lowercase
        System.out.println("Your sentence with all the leading and trailing spaces removed is: " + userSentence.trim());
        System.out.println("Your sentence where all the letters are uppercase is: " + userSentence.toUpperCase());
        System.out.println("Your sentence where all the letters are uppercase is: " + userSentence.toLowerCase());

        // Prompt the user to enter a single character
        // Determine if it is a letter, digit, or neither
        // If it's a letter, check if it's uppercase or lowercase
        // Print the decimal code of the character
        System.out.println(" ");
        System.out.print("Enter a single character: ");
        String userInp = input.nextLine();
        char userChar = userInp.charAt(0);
        if (Character.isLetter(userChar)){
            System.out.println("Your character is a letter.");
        }
        else if (Character.isDigit(userChar)){
            System.out.println("Your character is a digit.");
        }
        else{
            System.out.println("Your character is neither a letter nor a digit.");
        }
        if (Character.isLetter(userChar)){
            if (Character.isLowerCase(userChar)){
                System.out.println("Your letter is lowercase.");
            }
            else{
                System.out.println("Your letter is uppercase.");
            }
        }
        System.out.println("The numeric code for your character is: " + (int) userChar);


        // BONUS:
        // Prompt the user for a substring to search for
        // Display the index of the first occurrence or -1 if not found
        System.out.println(" ");
        System.out.print("Enter a substring: ");
        String sub = input.nextLine();
        System.out.println("The index of the substring you are searching for (with -1 representing the value not being found) is: " + userSentence.indexOf(sub));
        
    }
}
